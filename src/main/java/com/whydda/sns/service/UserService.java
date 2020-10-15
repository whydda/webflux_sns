package com.whydda.sns.service;

import com.whydda.sns.dto.UserDto;
import reactor.core.publisher.Mono;

/**
 * Created by whydda on 10월, 2020
 */
public interface UserService {
    Mono<UserDto> findByUser(Long id);
}

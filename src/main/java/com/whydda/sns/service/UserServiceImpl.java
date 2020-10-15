package com.whydda.sns.service;

import com.whydda.sns.dto.UserDto;
import com.whydda.sns.entity.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import com.whydda.sns.repository.*;

/**
 * Created by whydda on 10월, 2020
 */
@Service
public class UserServiceImpl implements UserService {

    final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Mono<UserDto> findByUser(Long id) {
        return userRepository.findById(id)
                .map(this::buildingUserDto)
                .log("get user");
    }

    private UserDto buildingUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .name(user.getName())
                .createdDate(user.getCreatedAt())
                .createdDate(user.getUpdatedAt())
                .build();
    }

}

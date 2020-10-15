package com.whydda.sns.handler;

import com.whydda.sns.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * Created by whydda on 10월, 2020
 */
@Component
public class Handler {
    final UserService userService;

    public Handler(UserService userService) {
        this.userService = userService;
    }

    public Mono<ServerResponse> getNewsFeeds(ServerRequest serverRequest) {
        return userService.findByUser(Long.valueOf(serverRequest.pathVariable("id")))
                .flatMap(result -> ServerResponse.ok().body(BodyInserters.fromValue(result)));
    }
}

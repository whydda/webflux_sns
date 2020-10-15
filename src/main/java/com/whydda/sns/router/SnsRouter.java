package com.whydda.sns.router;

import com.whydda.sns.handler.Handler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class SnsRouter {

    @Bean
    public RouterFunction<?> snsRouters(Handler handler) {

        return RouterFunctions
                .route(GET("/v1/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::getNewsFeeds);
    }
}

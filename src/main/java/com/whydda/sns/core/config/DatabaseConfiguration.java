package com.whydda.sns.core.config;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import static io.r2dbc.spi.ConnectionFactoryOptions.*;

@Configuration
@EnableR2dbcRepositories
public class DatabaseConfiguration extends AbstractR2dbcConfiguration {

    @Bean("whyddaH2")
    @Override
    public ConnectionFactory connectionFactory() {

        return ConnectionFactories.get(builder()
                .option(DRIVER, "h2")
                .option(PROTOCOL, "file")
                .option(USER, "whydda")
                .option(PASSWORD, "")
                .option(DATABASE, "./whydda-db")
                .build());
    }

}

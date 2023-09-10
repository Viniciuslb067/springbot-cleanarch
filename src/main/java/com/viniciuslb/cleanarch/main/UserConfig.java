package com.viniciuslb.cleanarch.main;

import com.viniciuslb.cleanarch.application.gateways.UserGateway;
import com.viniciuslb.cleanarch.application.usecases.CreateUserInteractor;
import com.viniciuslb.cleanarch.infrasctruture.controllers.UserDTOMapper;
import com.viniciuslb.cleanarch.infrasctruture.gateways.UserEntityMapper;
import com.viniciuslb.cleanarch.infrasctruture.gateways.UserRepositoryGateway;
import com.viniciuslb.cleanarch.infrasctruture.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}

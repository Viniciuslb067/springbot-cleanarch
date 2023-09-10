package com.viniciuslb.cleanarch.infrasctruture.gateways;

import com.viniciuslb.cleanarch.application.gateways.UserGateway;
import com.viniciuslb.cleanarch.domain.entity.User;
import com.viniciuslb.cleanarch.infrasctruture.persistence.UserEntity;
import com.viniciuslb.cleanarch.infrasctruture.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity savedEntity = userRepository.save(userEntity);

        return userEntityMapper.toDomainObj(savedEntity);
    }
}

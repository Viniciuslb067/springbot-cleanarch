package com.viniciuslb.cleanarch.infrasctruture.gateways;

import com.viniciuslb.cleanarch.domain.entity.User;
import com.viniciuslb.cleanarch.infrasctruture.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObj) {
        return new UserEntity(userDomainObj.name(), userDomainObj.password(), userDomainObj.email());
    }

    User toDomainObj(UserEntity userEntity) {
        return new User(userEntity.getName(), userEntity.getPassword(), userEntity.getEmail());
    }

}

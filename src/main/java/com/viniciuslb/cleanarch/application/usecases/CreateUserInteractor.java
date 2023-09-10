package com.viniciuslb.cleanarch.application.usecases;

import com.viniciuslb.cleanarch.application.gateways.UserGateway;
import com.viniciuslb.cleanarch.domain.entity.User;

public class CreateUserInteractor {
    private final UserGateway userGateway;

    public CreateUserInteractor(UserGateway createUser) {
        this.userGateway = createUser;
    }

    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}

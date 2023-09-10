package com.viniciuslb.cleanarch.infrasctruture.controllers;

import com.viniciuslb.cleanarch.domain.entity.User;

public class UserDTOMapper {
    CreateUserResponse toResponse(User user) {
        return new CreateUserResponse(user.name(), user.email());
    }

    public User toUser(CreateUserRequest request) {
        return new User(request.name(), request.password(), request.email());
    }
}
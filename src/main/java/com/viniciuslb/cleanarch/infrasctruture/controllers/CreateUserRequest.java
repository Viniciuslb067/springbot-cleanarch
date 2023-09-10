package com.viniciuslb.cleanarch.infrasctruture.controllers;

public record CreateUserRequest (String name, String email, String password) {
}

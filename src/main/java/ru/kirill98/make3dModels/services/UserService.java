package ru.kirill98.make3dModels.services;

import ru.kirill98.make3dModels.entities.User;

public interface UserService {
    User findByUsername(String username);
}

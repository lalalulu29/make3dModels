package ru.kirill98.make3dModels.services;

import ru.kirill98.make3dModels.entities.Log;


public interface LogService {
    Iterable<Log> findAll();
    Iterable<Log> findByLevel(String level);
    Iterable<Log> findByMessageContaining(String message);
    Iterable<Log> findByDateContaining(String date);

}

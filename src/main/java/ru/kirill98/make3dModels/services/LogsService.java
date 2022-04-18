package ru.kirill98.make3dModels.services;

import ru.kirill98.make3dModels.entities.Logs;


public interface LogsService {
    Iterable<Logs> findAll();
    Iterable<Logs> findByLevel(String level);
    Iterable<Logs> findByMessageContaining(String message);
    Iterable<Logs> findByDateContaining(String date);

}

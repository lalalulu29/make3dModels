package ru.kirill98.make3dModels.service;

import ru.kirill98.make3dModels.entity.Logs;


public interface LogsService {
    Iterable<Logs> findAll();
    Iterable<Logs> findByLevel(String level);
    Iterable<Logs> findByMessageContaining(String message);
    Iterable<Logs> findByDateContaining(String date);

}

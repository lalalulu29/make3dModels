package ru.kirill98.make3dModels.services.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import ru.kirill98.make3dModels.entities.Log;
import ru.kirill98.make3dModels.repositories.LogRepository;
import ru.kirill98.make3dModels.services.LogService;


@RequiredArgsConstructor
@Service
@Log4j
public class LogServiceImpl implements LogService {
    private final LogRepository logsRepository;

    @Override
    public Iterable<Log> findAll() {
        return logsRepository.findAll();
    }

    @Override
    public Iterable<Log> findByLevel(String level) {
        return logsRepository.findByLevel(level);
    }

    @Override
    public Iterable<Log> findByMessageContaining(String message) {
        return logsRepository.findByMessageContaining(message);
    }

    @Override
    public Iterable<Log> findByDateContaining(String date) {
        return logsRepository.findByDateContaining(date);
    }

}

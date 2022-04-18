package ru.kirill98.make3dModels.services.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import ru.kirill98.make3dModels.entities.Logs;
import ru.kirill98.make3dModels.repositories.LogsRepository;
import ru.kirill98.make3dModels.services.LogsService;


@RequiredArgsConstructor
@Service
@Log4j
public class LogsServiceImpl implements LogsService {
    private final LogsRepository logsRepository;

    @Override
    public Iterable<Logs> findAll() {

        return logsRepository.findAll();
    }

    @Override
    public Iterable<Logs> findByLevel(String level) {
        return logsRepository.findByLevel(level);
    }

    @Override
    public Iterable<Logs> findByMessageContaining(String message) {
        return logsRepository.findByMessageContaining(message);
    }

    @Override
    public Iterable<Logs> findByDateContaining(String date) {
        return logsRepository.findByDateContaining(date);
    }

}

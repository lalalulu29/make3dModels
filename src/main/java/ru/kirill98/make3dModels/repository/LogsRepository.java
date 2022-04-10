package ru.kirill98.make3dModels.repository;


import org.springframework.data.repository.CrudRepository;
import ru.kirill98.make3dModels.entity.Logs;


public interface LogsRepository extends CrudRepository<Logs, Integer> {
    Iterable<Logs> findByLevel(String level);
    Iterable<Logs> findByMessageContaining(String message);
    Iterable<Logs> findByDateContaining(String date);
}

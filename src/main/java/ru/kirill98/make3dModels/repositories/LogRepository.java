package ru.kirill98.make3dModels.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kirill98.make3dModels.entities.Log;

@Repository
public interface LogRepository extends JpaRepository<Log, Integer> {
    Iterable<Log> findByLevel(String level);
    Iterable<Log> findByMessageContaining(String message);
    Iterable<Log> findByDateContaining(String date);
}

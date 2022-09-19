package ru.alexander.repository;

import org.springframework.data.repository.CrudRepository;

import ru.alexander.Coffee;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}

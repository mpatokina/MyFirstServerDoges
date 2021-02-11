package com.example.myfirstapp.repository;

import com.example.myfirstapp.model.Doges;
import org.springframework.data.repository.CrudRepository;

public interface DogeRepository extends CrudRepository<Doges, Long> {
}
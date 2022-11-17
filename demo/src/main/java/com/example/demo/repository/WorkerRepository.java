package com.example.demo.repository;

import com.example.demo.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface WorkerRepository extends JpaRepository<Worker,Long> {
    Worker findById(long id);
}

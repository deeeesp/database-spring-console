package com.example.demo.DAO;

import com.example.demo.entity.Worker;
import com.example.demo.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerDAO {
    private final WorkerRepository workerRepository;

    @Autowired
    public WorkerDAO(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    public void save(Worker worker){
        workerRepository.save(worker);
    }

    public Worker getById(long id){
        return workerRepository.findById(id);
    }
}

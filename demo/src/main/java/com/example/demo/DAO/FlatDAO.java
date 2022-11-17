package com.example.demo.DAO;

import com.example.demo.entity.Flat;
import com.example.demo.repository.FlatRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlatDAO {
    private final FlatRepository flatRepository;

    @Autowired
    public FlatDAO(FlatRepository flatRepository) {
        this.flatRepository = flatRepository;
    }

    public void save(Flat flat){
        flatRepository.save(flat);
    }
}

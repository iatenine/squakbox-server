package com.revature.services;

import com.revature.models.Squak;
import com.revature.repositories.SquakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SquakServiceImpl implements SquakService{

    @Autowired
    SquakRepository squakRepository;

    @Override
    public List<Squak> getAllSquaks() {
        return (List<Squak>) squakRepository.findAll();
    }

    @Override
    public Squak postSquak(Squak squak) {
        return null;
    }
}

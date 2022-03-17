package com.revature.services;

import com.revature.models.Squak;
import com.revature.repositories.SquakRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SquakServiceImpl implements SquakService{

    @Autowired
    SquakRepository squakRepository;

    @Override
    public List<Squak> getAllSquaks() {
        return null;
    }

    @Override
    public Squak getSquakById(int id) {
        return null;
    }

    @Override
    public Squak postSquak(Squak squak) {
        return null;
    }

    @Override
    public boolean deleteSquak(int id) {
        return false;
    }
}

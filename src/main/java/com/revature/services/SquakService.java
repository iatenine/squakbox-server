package com.revature.services;

import com.revature.models.Squak;

import java.util.List;

public interface SquakService {
    public List<Squak> getAllSquaks();
    public Squak getSquakById(int id);
    public Squak postSquak(Squak squak);

    public boolean deleteSquak(int id);
}

package com.revature.services;

import com.revature.models.Squak;

import java.util.List;

public interface SquakService {
    List<Squak> getAllSquaks();
    Squak postSquak(String content);
}

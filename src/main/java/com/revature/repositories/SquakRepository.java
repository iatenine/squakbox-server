package com.revature.repositories;

import com.revature.models.Squak;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SquakRepository extends CrudRepository<Squak, Integer> {
}

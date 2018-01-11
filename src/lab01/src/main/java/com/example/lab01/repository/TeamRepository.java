package com.example.lab01.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.lab01.domain.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

}

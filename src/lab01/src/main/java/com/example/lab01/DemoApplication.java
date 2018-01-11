package com.example.lab01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.lab01.domain.Player;
import com.example.lab01.domain.Team;
import com.example.lab01.repository.TeamRepository;

@SpringBootApplication
public class DemoApplication {
	
	@Autowired
	public TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();		
		Set<Player> set = new HashSet<>();
		
		set.add(new Player("Fernando Prass","Goleiro"));
		set.add(new Player("Alex","Atacante"));
		
	  	list.add(new Team("Palmeiras","São Paulo", "Porco", set));
	  	list.add(new Team("Santos","São Paulo", "Peixe", null));
	  	
	  	teamRepository.save(list);
	}
}

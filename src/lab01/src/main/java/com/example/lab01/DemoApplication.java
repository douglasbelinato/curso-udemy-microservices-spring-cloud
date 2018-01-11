package com.example.lab01;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		
		Team team = new Team();
	  	team.setLocation("São Paulo");
	  	team.setName("Palmeiras");
	  	list.add(team);
	  	
	  	team = new Team();
	  	team.setLocation("Rio Grande do Sul");
	  	team.setName("Grêmio");
	  	list.add(team);
	  	
	  	teamRepository.save(list);
	}
}

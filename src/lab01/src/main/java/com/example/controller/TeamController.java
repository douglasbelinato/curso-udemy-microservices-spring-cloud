package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Team;

@RestController
public class TeamController {
	
	@GetMapping("/teams")
	public List<Team> getTeams() {
		List<Team> list = new ArrayList<>();
		
		Team team = new Team();
		team.setId(1l);
	  	team.setLocation("São Paulo");
	  	team.setName("Palmeiras");
	  	list.add(team);
	  	
	  	team = new Team();
	  	team.setId(2l);
	  	team.setLocation("Rio Grande do Sul");
	  	team.setName("Grêmio");
	  	list.add(team);
	  	
	  	return list;
	}

}

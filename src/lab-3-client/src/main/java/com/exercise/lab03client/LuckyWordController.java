package com.exercise.lab03client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController {

	@Value("${region}")
	String region;
	
	@Value("${language}")
	String language;

	@GetMapping("/lucky-word")
	public String showLuckyWord() {
		return "The region is " + region + " and the language is " + language;
	}
}

package demo.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import demo.domain.Word;

// service ID registered in Eureka Server
// I can pass the service url directly as well, in case I'm not working with Eureka  
@FeignClient("ARTICLE")
public interface ArticleClient {
	
	@GetMapping("/")
	Word getWord();

}

package com.oep.project.mock.client;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		Result res = new Result();
		res = restTemplate.getForObject("http://localhost:8080/holidays", Result.class);
		System.out.println(res.toString());
		ArrayList lst = (ArrayList) res.getBody();		
		String[] dias = new String[lst.size()];
		lst.toArray(dias);
		
		for(int i = 0; i < dias.length; i++){
			System.out.println(dias[i]);
		}
		
	}
}

package com.example.first_application;

import com.example.first_application.response.GetAssetResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@GetMapping
	public ArrayList<GetAssetResponse> getAssets() {
		ArrayList<GetAssetResponse> list = new ArrayList<>();

		GetAssetResponse response1 = GetAssetResponse.builder()
				.id(1L)
				.name("naruto")
				.balance(2000)
				.car("BMW")
				.build();

		GetAssetResponse response2 = GetAssetResponse.builder()
				.id(2L)
				.name("sasuke")
				.balance(3000)
				.car("mercedes")
				.build();

		list.add(response1);
		list.add(response2);

		return list;
	}

//	@GetMapping
//	public String sayHello(){
//		return"hello world";
//	}

	@GetMapping("/users")
	public List<String> getUser(){
		return List.of("simon","petrus","andreas");
	}
}

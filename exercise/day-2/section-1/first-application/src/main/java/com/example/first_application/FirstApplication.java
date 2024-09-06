package com.example.first_application;

import com.example.first_application.response.GetAssetResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

//	@GetMapping
//	public ArrayList<GetAssetResponse> getAssets() {
//		ArrayList<GetAssetResponse> list = new ArrayList<>();
//
//		GetAssetResponse response1 = GetAssetResponse.builder()
//				.id(1L)
//				.name("naruto")
//				.balance(2000)
//				.car("BMW")
//				.build();
//
//		GetAssetResponse response2 = GetAssetResponse.builder()
//				.id(2L)
//				.name("sasuke")
//				.balance(3000)
//				.car("mercedes")
//				.build();
//
//		list.add(response1);
//		list.add(response2);
//
//		return list;
//	}

	@GetMapping("/assets")
	public List<GetAssetResponse> getAssetById(
			@RequestParam(name="page",defaultValue = "1")int page,
			@RequestParam(name="size",defaultValue = "0")int size
	){
		List<GetAssetResponse> assets = new ArrayList<>();

		assets.add(GetAssetResponse.builder().id(1L).name("simon").build());
		assets.add(GetAssetResponse.builder().id(2L).name("andreas").build());
		assets.add(GetAssetResponse.builder().id(3L).name("yakobus").build());
		assets.add(GetAssetResponse.builder().id(4L).name("yohanes").build());
		assets.add(GetAssetResponse.builder().id(5L).name("filipus").build());

		int start = (page - 1) * size;
		int end = start + size;


		if (start >= assets.size()) {
			return new ArrayList<>();
		}

		if (end > assets.size()) {
			end = assets.size();
		}

		return assets.subList(start, end);
	}

//	@GetMapping
//	public String sayHello(){
//		return"hello world";
//	}

	@GetMapping("/users")
	public List<String> getUser(){
		return List.of("simon","petrus","andreas");
	}

	@GetMapping("/calculator/add")
	public String getAdd(
			@RequestParam(name = "panjang")int panjang,
			@RequestParam(name ="lebar",required = false, defaultValue = "0" ) int lebar

	)
	{
		return String.valueOf(panjang+lebar);
	}
}

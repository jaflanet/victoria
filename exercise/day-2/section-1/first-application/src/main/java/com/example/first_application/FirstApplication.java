package com.example.first_application;

import com.example.first_application.request.CreateUserRequest;
import com.example.first_application.request.EmployeeUserRequest;
import com.example.first_application.request.UpdateUserRequest;
import com.example.first_application.response.CreateEmployeeResponse;
import com.example.first_application.response.CreateUserResponse;
import com.example.first_application.response.GetAssetResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class FirstApplication {


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

//	@GetMapping("/assets")
//	public List<GetAssetResponse> getAssetById(
//			@RequestParam(name="page",defaultValue = "1")int page,
//			@RequestParam(name="size",defaultValue = "0")int size
//	){
//		List<GetAssetResponse> assets = new ArrayList<>();
//
//		assets.add(GetAssetResponse.builder().id(1L).name("simon").build());
//		assets.add(GetAssetResponse.builder().id(2L).name("andreas").build());
//		assets.add(GetAssetResponse.builder().id(3L).name("yakobus").build());
//		assets.add(GetAssetResponse.builder().id(4L).name("yohanes").build());
//		assets.add(GetAssetResponse.builder().id(5L).name("filipus").build());
//
//		int start = (page - 1) * size;
//		int end = start + size;
//
//
//		if (start >= assets.size()) {
//			return new ArrayList<>();
//		}
//
//		if (end > assets.size()) {
//			end = assets.size();
//		}
//
//		return assets.subList(start, end);
//	}
//
////	@GetMapping
////	public String sayHello(){
////		return"hello world";
////	}
//
////	@GetMapping("/users")
////	public List<String> getUser(){
////		return List.of("simon","petrus","andreas");
////	}
//
//	@GetMapping("/calculator/add")
//	public String getAdd(
//			@RequestParam(name = "panjang")int panjang,
//			@RequestParam(name ="lebar",required = false, defaultValue = "0" ) int lebar
//
//	)
//	{
//		return String.valueOf(panjang+lebar);
//	}
//
//	@PostMapping("/users")
//	public ResponseEntity<List<CreateUserResponse>>createUser(
//			@RequestBody CreateUserRequest request){
//
//		List<CreateUserResponse> users = new ArrayList<>();
//
//		users.add(CreateUserResponse.builder().id(1l).name("AB").build());
//		users.add(CreateUserResponse.builder().id(4l).name("CD").build());
//
//		// add new user
//		users.add(CreateUserResponse.builder().id(request.getId()).name(request.getName()).build());
//
//		return new ResponseEntity<>(users, HttpStatus.OK);
//
//	}
//
//	@PostMapping("/employee")
//	public ResponseEntity<List<CreateEmployeeResponse>> createEmployee(
//			@RequestBody EmployeeUserRequest request) {
//
//		List<CreateEmployeeResponse> employees = new ArrayList<>();
//
//
//		employees.add(CreateEmployeeResponse.builder()
//				.id(1L)
//				.name("AB")
//				.age(20)
//				.address("rumah")
//				.phone("0878")
//				.build());
//		employees.add(CreateEmployeeResponse.builder()
//				.id(2L)
//				.name("CD")
//				.age(21)
//				.address("rumah2")
//				.phone("0877")
//				.build());
//
//
//		if (request.getName() != null && request.getAge() > 0 && request.getPhone() != null) {
//			employees.add(CreateEmployeeResponse.builder()
//					.id(generateUniqueId(employees))
//					.name(request.getName())
//					.age(request.getAge())
//					.address(request.getAddress())
//					.phone(request.getPhone())
//					.build());
//			return new ResponseEntity<>(employees, HttpStatus.OK);
//		}
//
//		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//	}

	private List<CreateUserResponse> users = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@PostMapping("/users")
	public ResponseEntity<List<CreateUserResponse>>createUser(
			@RequestBody CreateUserRequest request){

		long uniqueId = (users.isEmpty()) ? 1 : users.get(users.size() - 1).getId() + 1;

		users.add(CreateUserResponse.builder().id(uniqueId).name(request.getName()).build());

		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@PatchMapping("/users/{id}")
	public ResponseEntity<List<CreateUserResponse>> updateUser(
			@RequestBody UpdateUserRequest request,
			@PathVariable("id") long id
	){

		for (CreateUserResponse user :users){
			if(user.getId()==id) {
				user.setName(request.getName());
			}
		}
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

}

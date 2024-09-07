package com.example.my_everything;

import com.example.my_everything.request.CreateTaskRequest;
import com.example.my_everything.request.UpdateTaskRequest;
import com.example.my_everything.response.GetTaskResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@SpringBootApplication
public class MyEverythingApplication {

	private List<GetTaskResponse> tasks = new ArrayList<>();
	private long uniqueId = 1;
	public MyEverythingApplication() {
		tasks.add(GetTaskResponse.builder()
				.id(uniqueId++)
				.name("rashford")
				.status("LW")
				.description("england")
				.build());
		tasks.add(GetTaskResponse.builder()
				.id(uniqueId++)
				.name("garnacho")
				.status("RW")
				.description("argentina")
				.build());
		tasks.add(GetTaskResponse.builder()
				.id(uniqueId++)
				.name("hojlund")
				.status("ST")
				.description("denmark")
				.build());
		tasks.add(GetTaskResponse.builder()
				.id(uniqueId++)
				.name("dialo")
				.status("LW")
				.description("nigeria")
				.build());
		tasks.add(GetTaskResponse.builder()
				.id(uniqueId++)
				.name("antony")
				.status("RW")
				.description("brazil")
				.build());
		tasks.add(GetTaskResponse.builder()
				.id(uniqueId++)
				.name("zirkee")
				.status("ST")
				.description("netherlands")
				.build());
	}


	public static void main(String[] args) {
		SpringApplication.run(MyEverythingApplication.class, args);
	}


	@GetMapping()
	public ResponseEntity<List<GetTaskResponse>> getTasksById(
			@RequestParam(name="page",defaultValue = "1")int page,
			@RequestParam(name = "size", defaultValue = "-1") int size
	){
		if (page < 1) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST); // Invalid page
		}

		if (size == -1) {
			size = tasks.size();
		} else if (size < 1) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST); // Invalid size
		}

		int start = (page - 1) * size;
		int end = start + size;


		if (start >= tasks.size()) {
			return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
		}

		if (end > tasks.size()) {
			end = tasks.size();
		}

		List<GetTaskResponse> paginatedTasks = tasks.subList(start, end);
		return new ResponseEntity<>(paginatedTasks, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public  ResponseEntity<List<GetTaskResponse>> getTasksById(@PathVariable("id") long id
	){
		List<GetTaskResponse> filterId = new ArrayList<>();
		for (GetTaskResponse task :tasks){
			if(task.getId()==id) {
				filterId.add(task);
				return new ResponseEntity<>(filterId, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(filterId, HttpStatus.NOT_FOUND);
	}

	@PostMapping("/tasks")
	public ResponseEntity<List<GetTaskResponse>> createTasks(
			@RequestBody CreateTaskRequest request){
		if(request.getName() != null && request.getStatus()!= null) {

			String description = (request.getDescription() != null) ? request.getDescription() : "";

			tasks.add(GetTaskResponse.builder()
					.id(uniqueId++)
					.name(request.getName())
					.status(request.getStatus())
					.description(description)
					.build());
			return new ResponseEntity<>(tasks, HttpStatus.OK);

		}


		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@PatchMapping("/tasks/{id}")
	public ResponseEntity<List<GetTaskResponse>> updateTasks(
			@RequestBody UpdateTaskRequest request,
			@PathVariable("id") long id
	){

		for (GetTaskResponse task :tasks){
			if(task.getId()==id) {
				if (request.getName() != null) {
					task.setName(request.getName());
				}
				if (request.getStatus() != null) {
					task.setStatus(request.getStatus());
				}
				if (request.getDescription() != null) {
					task.setDescription(request.getDescription());
				}
			}
		}
		return new ResponseEntity<>(tasks, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<List<GetTaskResponse>> deleteTasks(
			@PathVariable("id") long id
			){
		for (GetTaskResponse task :tasks){
			if(task.getId()==id) {
				tasks.remove(task);
				return new ResponseEntity<>(tasks, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}


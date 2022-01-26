package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.TestRequestBodyDTO;

@RestController
@RequestMapping("test")
public class TestController {

	@GetMapping
	public String testController() {
		return "Hello world";
	}
	@GetMapping("/{id}")
	public String testControllerWithPathVariables(@PathVariable(required = false)String id) {
		return "Hello World " + id;
	}
	@GetMapping("/testGetMapping")
	public String testControllerWithPath() {
		return "Hello world getmapping";
	}
	@GetMapping("/testRequestParam")
	public String testControllerRequestParam(@RequestParam(required = false)int id) {
		return "Hello World " + id;
	}
	@GetMapping("/testRequestBody")
	public String testControllerRequestBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO) {
		return "Hello World " + testRequestBodyDTO.getId() + " :" + testRequestBodyDTO.getMessage();
	}
	@GetMapping("/testResponseBody")
	public ResponseDTO<String> testControllertestResponseBody() {
		List<String> list = new ArrayList<>();
		list.add("Hello World - ResponseDTO");
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		return response;
	}
	@GetMapping("/testRequestEntity")
	public ResponseEntity<?> testControllerRequestEntity() {
		List<String> list = new ArrayList<>();
		list.add("Hello World - ResponseEntity. http status 200");
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		return ResponseEntity.ok().body(response);
	}
}

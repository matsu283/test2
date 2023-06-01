package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Test0601 {

	@PostMapping("/post")
	public String post(@RequestParam("name")String name,
			@RequestParam("age") int age) {
		return "名前は" + name +"、年齢は" + age + "です。";
	}
}

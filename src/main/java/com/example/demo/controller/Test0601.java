package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Test0601 {

	@GetMapping("/post")
	public String post(@RequestParam("name")String name,
			@RequestParam("age") int age) {
		return "名前は" + name + "、年齢は" + age + "です。";
	}
}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Test0601_02 {

	@GetMapping("/post1")
	public String post(@RequestParam("name") String name,
			@RequestParam("age") int age) {
		return "名前は" + name + "、年齢は" + age + "ですよ。";
	}
}

package com.teslenko.sshexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, world! - fourth version";
	}
}

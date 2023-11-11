package com.india;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

	@GetMapping("/msg3")
	public String getIndex() {
		return "Spring boot Farmework";

	}
}

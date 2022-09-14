package com.springbootdemo;

import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {
	
	@GetMapping("/message")
	public String getMessage() {
		return"Hello World";
	}
	
	@GetMapping("/newmessage")
	public String getnewMessage() {
		return"Hello World New";
	}
	@GetMapping("/{num}")
	public String isPrime(@PathVariable int num) {
		
		String result= "";
		for(int i=2;i>=num/2;i++) {
			if(num%i==0) {
				result ="is not a prime number";
				break;
			}
			else {
				result= "is a prime number";
			}
			
		}
		return num+result;
	}
	

}

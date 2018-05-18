package com.bookstore;

import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/names/")
	public List<Book> getAllNames() {
		
		return Arrays.asList(new Book("Mehmet"));
	}
	
}

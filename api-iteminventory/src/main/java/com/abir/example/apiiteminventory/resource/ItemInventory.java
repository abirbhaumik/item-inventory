package com.abir.example.apiiteminventory.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory")
public class ItemInventory {
	
	@GetMapping("/count/{item}")
	public int checkInventory(@PathVariable String item) {
		int count =0;
		System.out.println("item .."+item);
		if ("100".equals(item)) {
			System.out.println("Inside if ..");
			count= 10;
		}
		else if ("200".equals(item)) {
			count=20;
		}
		return count;
	}

}

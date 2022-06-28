package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BagController {
	@Autowired
	BagService bagService;
//---------------------------------------------------------------	
	@PostMapping(value="/addDetails")
	public String addDetails(@RequestBody Bag b) {
		
		return bagService.addDetails(b);
	}
	
	@PostMapping(value="/addAllDetails")
	public String addAllDetails(@RequestBody List<Bag> li) {
		
		return bagService.addAllDetails(li);
	}
//-----------------------------------------------------------------	
	@GetMapping(value="/getDetails/{id}")
	public Bag getDetails(@PathVariable int id) {
		
		return bagService.getDetails(id);
	}
	
	@GetMapping(value="/getAllDetails") 
	public List<Bag> getAllDetails() {
		
		return bagService.getAllDetails();
	}
//------------------------------------------------------------------
	
	@DeleteMapping(value="/delete/{id}")
	public String delete(@PathVariable int id) {
		
		return bagService.delete(id);
	}
	
	@PutMapping(value="update/{id}")
	public String update(@RequestBody Bag id) {
		
		return bagService.update(id);
	}
//---------------------------------------------------------------------
	
	@PostMapping(value="/saveAllDetails")  
	public String saveAllDetails(@RequestBody List<Bag> li) {
		
		return bagService.saveAllDetails(li);
	}
	
	@GetMapping(value="/getTax")
	public List<Bag> setByTax() {
		
		return bagService.setByTax();
	}
	
	
	
	}
	


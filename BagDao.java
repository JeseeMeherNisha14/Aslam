package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BagDao {
	
	@Autowired
	BagRepository bagRepo;
	
//------------------------------------------------------
	public String addDetails(Bag b) {
		
		bagRepo.save(b);
		return "Saved Successfully";
	}
	
	public String addAllDetails(List<Bag> li) {
		
		bagRepo.saveAll(li);
		return "All saved Successfully";
	}
//------------------------------------------------------------	
	public Bag getDetails(int id) {
		
		return bagRepo.findById(id).get();
	}
	
	public List<Bag> getAllDetails() {
		
		return bagRepo.findAll();
	}
//-------------------------------------------------------------	
	public String delete(int id) {
		
		bagRepo.deleteById(id);
		return "Deleted successfully";
	}
	
	public String update(Bag id) {
		
		bagRepo.save(id);
		return "Updated successfully";
	}
//-------------------------------------------------------------
	
	public String saveAllDetails(List<Bag> li) {
		
		for(Bag b:li) {
			
		bagRepo.save(b);	
		}
		
		return "All saved Successfully";
	}
	
	public List<Bag> setByTax() {
		
		return bagRepo.findAll();
		
	}
}

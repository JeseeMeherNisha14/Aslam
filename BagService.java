package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class BagService {
	
	@Autowired
	BagDao bagDao;
	
	@Autowired
	BagRepository bagRepo;
	
//----------------------------------------------
	public String addDetails(Bag b) {
		
		return bagDao.addDetails(b);
	}
	
	public String addAllDetails(List<Bag> li) {
		
		return bagDao.addAllDetails(li);
	}
//-------------------------------------------------	
	public Bag getDetails(int id) {
		
		return bagDao.getDetails(id);
	}
	
	public List<Bag> getAllDetails() {
		
		return bagDao.getAllDetails();
	}
//---------------------------------------------------	
	public String delete(int id) {
		
		return bagDao.delete(id);
	}
	
	public String update(Bag id) {
		
		return bagDao.update(id);
	}
//----------------------------------------------------
	
	public String saveAllDetails(List<Bag> li) {
		
		return bagDao.saveAllDetails(li);
	}
	
	
	public List<Bag> setByTax() {
		
		bagDao.setByTax().forEach(x-> {
			x.setPrice(x.getPrice()+(x.getPrice()*5/100));
		});
		
		return bagDao.setByTax();
	}

}

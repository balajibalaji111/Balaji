package com.bike;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BikeDoa {
	@Autowired
	BikeRepository cr;
	public String setBike(Bike b) {
		cr.save(b);
		return "Saved";
	}
	
	
	public String setAllBike ( List<Bike> b){
		
	  cr.saveAll(b);
	  return "Saved";
		
	}


		public Bike getBike(int b) {
	
		return cr.findById(b).get();
	}


		public List<Bike> getAllBike() {
		
			return cr.findAll();
		}


		public String delBike(int c) {
		
			cr.deleteById(c);
			
			return "All delete";
		}


		public String getBrand(int a) {
			Bike bb=cr.findById(a).get();
			return bb.getBrand();
		}
	
	

}

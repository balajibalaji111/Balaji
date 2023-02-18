package com.bike;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController {
	@Autowired
	BikeServices bs;
	@PostMapping(value="/setBike") 
	public String setBike(@RequestBody Bike b) {
		return bs.setBike(b);
	}
	
	
	
	@PostMapping(value="/setAllBike")
	public String setAllBike(@RequestBody List<Bike> b) {
		return bs.setAllBike(b);
	}
	
	@GetMapping(value="/getBike/{b}")
	public Bike getBike(@PathVariable int b) {
		return bs.getBike(b);
	}
	
	@GetMapping(value="/getAllBike") 
	public List<Bike> getAllBike() {
		return bs.getAllBike();
	}
	
	@DeleteMapping(value="/delBike/{c}") 
	public String delBike(@PathVariable int c) {
		return bs.delBike(c);
	}
	

	public List<Bike> getBikeBrand(@PathVariable String a) {
		return bs.getBikeBrand(a);
	}
	
	@GetMapping(value="/getAllPrice/{a}/{b}")
	public List<Bike> getBikePrice(@PathVariable int a,@PathVariable int b) {
		return bs.getBikePrice(a,b);
	}
	
	@GetMapping(value="/getObjPri")
	public Bike getMax() {
		return bs.getMax();
	}
	
	@GetMapping(value="/getBrand/{a}")
	public String  getBrand(@PathVariable int a) {
		return bs.getBrand(a);
	}
	
	
	
}

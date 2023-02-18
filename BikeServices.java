package com.bike;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeServices {
	@Autowired
	BikeDoa bd;
	
	public String setBike(Bike b) {
		return bd.setBike(b);
	}

	public String setAllBike(List<Bike> b) {
		
		return bd.setAllBike(b);
	}


	public Bike getBike(int b) {
		
		return bd.getBike(b);
	}

	public List<Bike> getAllBike() {
		
		return bd.getAllBike();
	}

	public String delBike(int c) {
		
		return bd.delBike(c);
	}

	public List<Bike> getBikeBrand(String a) {
		
		List<Bike>z=getAllBike();
		List<Bike>x=z.stream().filter(y->y.getBrand().equals(z)).collect(Collectors.toList());
		return x;
	}
	
	
	public List<Bike> getBikePrice(int a, int b) {
		List<Bike>z=getAllBike();
		List<Bike>x=z.stream().filter(y->y.getPrice()>a && y.getPrice()<b).collect(Collectors.toList());
		
		return x;
		
	}

	public Bike getMax() {
		
		List<Bike> a=getAllBike();
		
		Bike b=a.stream().max(Comparator.comparing(Bike::getPrice)).get();
		
		return b;
	}

	public String getBrand(int a) {
		return bd.getBrand(a);
	}
	
	



}

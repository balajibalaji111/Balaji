package com.gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gst.entity.Gst;
import com.gst.service.GstService;

@RestController
public class GstController {
	@Autowired
	GstService gs;
	@PostMapping("/setAll")
	public String setAll(@RequestBody List<Gst> g) {
		return gs.setAll(g);
	}
	
	@GetMapping("getAll")
	public List<Gst> getAll() {
		return gs.getAll();
	}
	
	@GetMapping("/getTaxByHsn/{a}")
	public int getTaxByHsn(@PathVariable int a) {
		return gs.getTaxByHsn(a);
	}

}

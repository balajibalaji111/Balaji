package com.gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gst.dao.GstDao;
import com.gst.entity.Gst;

@Service
public class GstService {
    @Autowired
    GstDao gd;
    
	public String setAll(List<Gst> g) {
		return gd.setAll(g);
	}

	public List<Gst> getAll() {
		return gd.getAll();
	}

	public int getTaxByHsn(int a) {
		return gd.getTaxByHsn(a);
	}

}

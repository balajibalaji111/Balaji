package com.gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gst.entity.Gst;
import com.gst.repository.GstRepository;

@Repository
public class GstDao {
  @Autowired
  GstRepository gr;
	public String setAll(List<Gst> g) {
		gr.saveAll(g);
		return "saved";
	}
	public List<Gst> getAll() {
		return gr.findAll();
	}
	public int getTaxByHsn(int a) {
		return gr.getTaxByHsn(a);
	}

}

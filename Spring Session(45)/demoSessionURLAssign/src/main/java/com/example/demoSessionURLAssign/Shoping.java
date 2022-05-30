package com.example.demoSessionURLAssign;

import java.util.Map;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Shoping {
	private Map<String, Integer> list;

	public Map<String, Integer> getList() {
		return list;
	}

	public void setList(Map<String, Integer> list) {
		this.list = list;
	}
	
	
}

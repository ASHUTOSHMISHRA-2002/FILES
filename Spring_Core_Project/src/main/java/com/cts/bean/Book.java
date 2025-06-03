package com.cts.bean;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	private int bid;
//	@Autowired
	private Map<String, String> map;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public Book(int bid, Map<String, String> map) {
		super();
		this.bid = bid;
		this.map = map;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", map=" + map + "]";
	}

}

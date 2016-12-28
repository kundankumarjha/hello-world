package com.counterapp;


import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Counter {
	//private Date created;
	private String calls;
	public Counter(String calls)
	{
		super();
		//created = new Date();
		this.calls = calls;
	}
	/*
	public Date getCreated() {
		return created;
	}*/

	public String getCalls() {
		return calls;
	}
}

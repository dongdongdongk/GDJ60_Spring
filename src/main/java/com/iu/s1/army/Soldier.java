package com.iu.s1.army;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Soldier {
//	@Autowired
//	private Gun gun;
	@Autowired
	@Qualifier("sg")
	private Gun shotGun;
	@Autowired
	@Qualifier("rf")
	private Gun rifle;
	
	private String name;
	private int age;
	
}
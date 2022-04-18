package com.jacaranda.pruebas.model;

import java.util.Comparator;

import com.jacaranda.pruebas.Persona;

public class ComparatorDNI implements Comparator<Persona>{
	
	public ComparatorDNI() {
		
	}
	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getDni().compareTo(o2.getDni());
	}
	

}

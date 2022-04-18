package com.jacaranda.pruebas.model;

import java.util.Comparator;

import com.jacaranda.pruebas.Persona;

public class ComparatorApellido implements Comparator<Persona> {
	
	public ComparatorApellido() {
		
	}
	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getApellido().compareTo(o2.getApellido());
	}
	
}




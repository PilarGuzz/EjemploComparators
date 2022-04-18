package com.jacaranda.pruebas.model;

import java.util.Comparator;

import com.jacaranda.pruebas.Persona;

public class ComparatorFecha implements Comparator<Persona> {
	
	public ComparatorFecha(){
		
	}

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
	}

	
}

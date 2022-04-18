package com.jacaranda.pruebas.model;

import java.util.Comparator;

import com.jacaranda.pruebas.Persona;

public class ComparatorPersonaNombre implements Comparator<Persona>{

	public ComparatorPersonaNombre() {
		
	}

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
	
}

package com.jacaranda.pruebas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.jacaranda.pruebas.model.ComparatorApellido;
import com.jacaranda.pruebas.model.ComparatorDNI;
import com.jacaranda.pruebas.model.ComparatorPersonaNombre;

public class Main2 {
	
	public static final String SEPARADOR = "------------------------------";

	public static void main(String[] args) {
		
		Set<Persona> coleccionP = new HashSet<>();
		
		coleccionP.add(new Persona("Juan", "Jimenez", "24514574A", LocalDate.of(1999, 2, 2) ));
		coleccionP.add(new Persona("Pepe", "Lorenzo", "24514574A" , LocalDate.of(1999, 2, 2)));
		coleccionP.add(new Persona("Lola", "Lopez", "24514574A" , LocalDate.of(1999, 2, 2)));
		coleccionP.add(new Persona("Tomas", "Martin", "24514574A", LocalDate.of(1999, 2, 2) ));
		
		Iterator iterator = coleccionP.iterator();
		
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
		}
			
		System.out.println(SEPARADOR);
		
		List<Persona> listaP = new ArrayList<>();
			
		listaP.add(new Persona("Juan", "Jimenez", "24514574A", LocalDate.of(2000, 2, 2)));
		listaP.add(new Persona("Pepe", "Lopez", "24514574A", LocalDate.of(1998, 2, 2)));
		listaP.add(new Persona("Lola", "Lopez", "24514574A", LocalDate.of(1999, 2, 2)));
		listaP.add(new Persona("Juan", "Martin", "24514574A", LocalDate.of(1994, 2, 2)));
			
		Iterator iteratorP = listaP.iterator();
		
		listaP.sort(new ComparatorApellido().thenComparing(new ComparatorPersonaNombre()));
		while(iteratorP.hasNext()) {
			System.out.println(iteratorP.next());
		}
		System.out.println(SEPARADOR);

		listaP.sort(new ComparatorPersonaNombre().thenComparing(new ComparatorApellido()));
		while(iteratorP.hasNext()) {
			System.out.println(iteratorP.next());
		}
		System.out.println(SEPARADOR);

		listaP.sort(new ComparatorDNI().thenComparing(new ComparatorPersonaNombre()));
		
		while(iteratorP.hasNext()) {
			System.out.println(iteratorP.next());
		}
		

	}
}

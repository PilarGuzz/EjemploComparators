package com.jacaranda.pruebas;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainApp {
	
	public static Map<Integer, Integer> cuentaNumeros(List<Integer> numeros){
		//1 1 3, 5 3 4 5 1 
		//1->3, 3->2, 4->1, 5->2
		Map<Integer, Integer> numerosMap = new HashMap<>();
		int contador;
		for(Integer i : numeros) {
			
			if(numerosMap.containsKey(i)) {
				contador = numerosMap.get(i);
				numerosMap.put(i, ++contador);
			}else {
				contador = 1;
				numerosMap.put(i, contador);
			}
			
		}
		
		
		return numerosMap;
		
	}
	
	
	public static<T> Map<T, Integer> cuentaTodo (Collection <T> coleccion){
		Map<T, Integer> elementos = new HashMap<>();
		int contador;
		for(T i : coleccion) {
			
			if(elementos.containsKey(i)) {
				contador = elementos.get(i);
				elementos.put(i, ++contador);
			}else {
				contador = 1;
				elementos.put(i, contador);
			}
			
		}
		
		return elementos;
	}
	
	public static void main(String[] args) {
		
		List<Integer> listaDeNumeros = Arrays.asList(3, 4, 5, 2, 4 ,7, 3);
		
		//System.out.println(cuentaNumeros(listaDeNumeros));
		
		List<String> listaCadenas = Arrays.asList("perro", "gato", "gato", "canario", "perro", "koala", "perro");
		
		System.out.println(cuentaTodo(listaCadenas));

		
		
	}

}

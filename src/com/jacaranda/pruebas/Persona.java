package com.jacaranda.pruebas;

import java.time.LocalDate;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	private LocalDate fechaNacimiento;
	
	
	public Persona(String nombre, String apellido, String dni, LocalDate fecha) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fecha;
	}
	
	


	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDni() {
		return dni;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}




	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Me llamo" + nombre + " "+ apellido + ", con dni " + dni;
	}
}

package com.zubiri.persona;
/**
 * Esta clase agrega datos personales de las personas que querramos añadir.
 * @author ik013043z1
 *
 */
public class Persona {
	
	private String nombre;
	private String direccion;
	private int codigopostal;
	private String ciudad;
	private int edad;
	
	/**
	 * 
	 * @param nombre String con el nombre de la persona
	 * @param direccion String en la cual se guarda la direccion de la persona 
	 * @param codigopostal int que almacena el codigo postal de la ciudad
	 * @param ciudad String donde vive la persona
	 * @param edad int que guarda la edad de la persona
	 */
	public Persona(String nombre, String direccion, int codigopostal, String ciudad, int edad) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigopostal = codigopostal;
		this.ciudad = ciudad;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getCodigopostal() {
		return codigopostal;
	}


	public void setCodigopostal(int codigopostal) {
		this.codigopostal = codigopostal;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Este boleano  compara si el codigo introducido esta entre los valores 0 y 20000.
	 * @return boolean true si es menor a 20000, sino false
	 */
	public boolean escorrectocodpostal() {
		boolean codcorrecto=true;
		if (codigopostal<=20000) {
			codcorrecto=true;
		}
			else {
				codcorrecto=false;
			}
				return codcorrecto;
		
	}

	@Override
	public String toString() {
		return "Persona Nombre=" + nombre + ", Direccion=" + direccion + ", Codigo Postal=" + codigopostal + ", Ciudad="
				+ ciudad + ", Edad=" + edad;
	}
	

	
	
	

}

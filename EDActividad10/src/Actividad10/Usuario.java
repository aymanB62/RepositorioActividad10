package Actividad10;

import java.util.Arrays;

public class Usuario {
	
	String id;
	String nombre;
	double[] valoraciones;
	String ayman;
	

	public Usuario() {
		
	}
	
	public Usuario(String id, String nombre, double[] array) {
		this.id = id;
		this.nombre = nombre;
		this.valoraciones = array;
		
	}

	public String toString() {
		return "Usuario [id = " + id + ", nombre = " + nombre + ", valoraciones = " + Arrays.toString(valoraciones) + "]";
	}
	
	public int mediaDeValoraciones() {
		int sumador = 0;
		for(int i = 0; i < this.valoraciones.length; i++) {
			sumador += this.valoraciones[i];
		}
		int media = sumador / this.valoraciones.length;
		return media;
	}
	
	public void imprimirValoraciones() {
		System.out.println(Arrays.toString(valoraciones));
	}
	
	public void valoracionMayorMenor(Usuario v) {
		int sumador = 0;
		for(int i = 0; i < this.valoraciones.length; i ++) {
			v.valoraciones[1] = this.valoraciones[i];
				if(this.valoraciones[i] > v.valoraciones[1]) {
					sumador++;
				}
				
		}
		System.out.println("Hay  " + sumador + "mayor");
	}
	
}

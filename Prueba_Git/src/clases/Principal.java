package clases;

import interfaces.Prueba;

public class Principal {
	
	public static void main (String args []) {
		Prueba prueba = new PruebaImpl("Pera");
		prueba.imprimir();
		
	}

}

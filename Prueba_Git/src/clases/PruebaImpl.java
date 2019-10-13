package clases;

import interfaces.Prueba;

public class PruebaImpl implements Prueba {
	
	String cadena;

	
	
	public PruebaImpl(String cadena) {
		this.cadena = cadena;
	}



	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("La cadena es "+ cadena);
	}

}

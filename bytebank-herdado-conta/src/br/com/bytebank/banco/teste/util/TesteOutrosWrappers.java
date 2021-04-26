package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer  idadeRef = Integer.valueOf(12);
		System.out.println(idadeRef);
		
		Double dRef = Double.valueOf(12.00);
		System.out.println(dRef);
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef);
		
		Number numero = Integer.valueOf(4);
		Number numero2 = Double.valueOf(4.5);
		Number numero3 = Float.valueOf(12.02f);
		System.out.println(numero);
		System.out.println(numero2);
		System.out.println(numero3);
		
		List<Number> lista = new ArrayList<Number>();
		lista.add(numero);
		lista.add(numero2);
		lista.add(numero3);
	}
}

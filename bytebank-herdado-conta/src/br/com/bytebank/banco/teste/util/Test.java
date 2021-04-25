package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29; //Integer
		Integer idadeRef = new Integer(29);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idadeRef);
		// ou 
		numeros.add(20); // Autoboxing
		
	}
}

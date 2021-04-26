package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29; //Integer
		
		/* Não inicializamos um Integer da forma abaixo... 
		 * 
		 * Integer idadeRef = new Integer(29);
		 * */
		Integer idadeRef = Integer.valueOf(29);
		int valor = idadeRef.intValue();
		
		// Exemplo utilizando o args do metodo main
		String s1 = args[0];
		String s2 = args[1];
		String s3 = args[2];
		
		Integer numero1 = Integer.valueOf(s1);
		int numero2 = Integer.parseInt(s2);
		double numero3 = Double.parseDouble(s3);
		
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero3);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idadeRef);
		// ou 
		numeros.add(20); // Autoboxing
		
		/**
		 * Para cada tipo primitivo, existe uma versão em forma de classe.
		 * Assim podemos trabalhar com referencias.
		 * 
		 * java.lang.Integer
		 */
	}
}

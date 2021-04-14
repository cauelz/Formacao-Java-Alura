package br.com.bytebank.banco.teste;

public class Teste {

	// Array[]
	public static void main(String[] args) {
		
		// int idades []:
		int [] idades =  new int [5]; // ele já inicializa o array com os valores padroes, ou seja, 0.

		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
	}
}

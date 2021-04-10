package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura"; //object literal
		// String nome = new String("Alura");
		
		/**
		 * Veja que as modificações não foram aplicadas no valor "Alura", mas pq?
		 * Porque a variavel nome foi inicializada com o valor "Alura" e uma caracteristica
		 * desta inicializacao é a Imutabilidade, ou seja, não podemos modificar este valor atribuido 
		 * a variavel nome.
		 */
		nome.replace("A", "a");
		System.out.println(nome);	
		nome.toLowerCase();
		System.out.println(nome);
		System.out.println("");
		System.out.println("");
		
		/**
		 * Todos os metodos que realizam alguma alteração no valor da variavel retornam um novo valor.
		 * Se um novo valor é RETORNADO, precisamos armazenar em uma outra variavel
		 * Veja abaixo
		 */
		
		String outroNome = nome.replace("r", "l");
		System.out.println("Com o método replace: " + outroNome);
	
	}

}

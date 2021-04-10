package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		// String nome = new String("Alura");
		String nome = "Alura"; //object literal
		
		/**
		 * Veja que as modifica��es n�o foram aplicadas no valor "Alura", mas pq?
		 * Porque a variavel nome foi inicializada com o valor "Alura" e uma caracteristica
		 * desta inicializacao � a Imutabilidade, ou seja, n�o podemos modificar este valor atribuido 
		 * a variavel nome.
		 */
		nome.replace("A", "a");
		System.out.println(nome);	
		nome.toLowerCase();
		System.out.println(nome);
		System.out.println("");
		System.out.println("");
		
		/**
		 * Todos os metodos que realizam alguma altera��o no valor da variavel retornam um novo valor.
		 * Se um novo valor � RETORNADO, precisamos armazenar em uma outra variavel
		 * Veja abaixo
		 */
		String outroNome = nome.replace("r", "l");
		System.out.println("Com o m�todo replace: " + outroNome);
		
		char c = 'A';
		char d = 'a';
		
		String outroNome2 = nome.replace(c, d);
		System.out.println("Usando metodo replace com caracteres 'char': " + outroNome2);
	
		
		/**
		 * Outros m�todos:
		 * 
		 * char c = nome.charAt(0); retorna o primeiro caracter A
		 * 
		 * int c = nome.indexOf("ur"); retorna a posi��o 2 desta substring
		 * 
		 * String sub = nome.substring(1); retorna "lura", ou seja, a posi��o 1 de uma string
		 */
		
		String vazio = "  ";
		String outroVazio = vazio.trim();
		System.out.println(vazio.isEmpty());
		System.out.println(outroVazio.isEmpty());
	}

}

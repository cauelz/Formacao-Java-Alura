package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println(3);
		System.out.println("Olá");
		System.out.println(false);
		
		Object cc = new ContaCorrente(222, 333);
		Object cp = new ContaPoupanca(333, 444);
		Object cliente = new Cliente();
		
		System.out.println(cc.toString());
		System.out.println(cp);
		
		println(cc);
	}
	
	static void println() {
	}
	
	static void println(int a) {
	}
	
	static void println(boolean bool) {
	}
	
	static void println(Object referencia) {
		
	}
//	static void println(???? referencia) {
//		
//	}
	
	
}

package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArraysReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5]; // o valor padrão de inicialização é null.
		
		ContaCorrente cc1 = new ContaCorrente(111, 222);
		contas[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(222, 333);
		contas[1] = cc2;
		
		System.out.println(cc2.getNumero());
		System.out.println(contas[1].getNumero());
		
		Conta ref = contas[1];
		ContaPoupanca ref2 = (ContaPoupanca) contas[1]; // type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		System.out.println(ref2.getNumero());
		
	}
}

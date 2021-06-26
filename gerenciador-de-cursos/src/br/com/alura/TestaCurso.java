package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Paulo Silveira");
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 32));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 32));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 32));
		javaColecoes.adiciona(new Aula("Modelando Coleções", 32));
		System.out.println(javaColecoes.getAulas());
		
	}

}

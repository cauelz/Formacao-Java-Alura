package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Cau�");
		alunos.add("Vivian");
		alunos.add("Mariane");
		alunos.add("Ira�");
		alunos.add("Inahe");
		
		System.out.println(alunos);
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		
		System.out.println(pauloEstaMatriculado);
	}

}

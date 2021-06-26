package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAulas {

	public static void main(String[] args) {

		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.add(new Aula("OutraAula1", 15));
		aulas.add(new Aula("Aula2", 25));
		aulas.add(new Aula("Aula3", 35));
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
	}

}

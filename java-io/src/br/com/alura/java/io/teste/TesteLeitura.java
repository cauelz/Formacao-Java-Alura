package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		
		// Fluxo de Entrada com Arquivo
		InputStream fis = new FileInputStream("lorem.txt"); //criar um fluxo para o arquivo, só que binario
		Reader isr = new InputStreamReader(fis); //melhorando os dados, tornando-os caracteres
		BufferedReader br = new BufferedReader(isr); // junta os caracteres em um buffer
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		
	}

}

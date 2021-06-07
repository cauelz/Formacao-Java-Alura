package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		//fLUXO DE ENTRADA COM ARQUIVO
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("texto maluco que está sendo escrito");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("Safados e loucos");
		
		bw.close();
		
	}

}

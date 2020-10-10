package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		//fluxo de entrada com um arquivo
		OutputStream fos = new FileOutputStream("si2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("modelo de john fon newman");
		bw.newLine();
		bw.newLine();
		bw.write("rom - Read Only Memory");
		
		bw.close();
	}

}

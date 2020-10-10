package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		//fluxo de entrada com um arquivo
//		OutputStream fos = new FileOutputStream("si2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("si2.txt"));
		bw.write("modelo de john fon newman");
		bw.newLine();
		bw.newLine();
		bw.write("rom - Read Only Memory");
		
		bw.close();
	}

}

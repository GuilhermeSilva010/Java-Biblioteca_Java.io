package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		//fluxo de entrada com um arquivo
//		OutputStream fos = new FileOutputStream("si2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("si2.txt"));
//		PrintStream ps = new PrintStream("si2.txt");

		long ini = System.currentTimeMillis();
		
		PrintWriter ps = new PrintWriter("si2.txt");
		
		ps.println("Lorem ipsum vai se fude");
		ps.println();
		ps.println("rom - Read Only Memory");
		
		ps.close();
		
		long fim = System.currentTimeMillis();
		
		System.out.println("passaram " + (fim-ini) + " milissegundos");
	}
	
}

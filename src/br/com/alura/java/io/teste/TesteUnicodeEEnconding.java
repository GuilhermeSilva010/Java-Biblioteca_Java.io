package br.com.alura.java.io.teste;

import java.nio.charset.Charset;

public class TesteUnicodeEEnconding {

	public static void main(String[] args) {

		String s ="G";
		System.out.println(s.codePointAt(0));//unicode
		
		Charset charset = Charset.defaultCharset();
//		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes();
		System.out.println(bytes.length + " , " + charset.displayName());
		String sNovo = new String(bytes);
		
		bytes = s.getBytes();
		System.out.println(bytes.length + " , UTF-8" );
		
	}

}

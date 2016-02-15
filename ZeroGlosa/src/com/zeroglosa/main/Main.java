package com.zeroglosa.main;

import com.zeroglosa.model.Conversor;

public class Main {
	
	public static void main(String[] args) {
		
		Conversor teste1 = new Conversor();
		String resposta = teste1.mapear("ZeroGlosa");
		System.out.println(resposta);
		
		Conversor teste2 = new Conversor();
		resposta = teste2.mapear("CTTUAG");
		System.out.println(resposta);
		
		Conversor teste3 = new Conversor();
		resposta = teste3.mapear("C");
		System.out.println(resposta);
		
		Conversor teste4 = new Conversor();
		resposta = teste4.mapear(null);
		System.out.println(resposta);
		
		Conversor teste5 = new Conversor();
		resposta = teste5.mapear("UAGC");
		System.out.println(resposta);
	}
}

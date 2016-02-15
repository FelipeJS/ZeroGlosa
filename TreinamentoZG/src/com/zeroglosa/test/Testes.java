package com.zeroglosa.test;

import org.junit.Test;

import com.zeroglosa.model.Conversor;

public class Testes {
	
	@Test
	public void teste1(){
		Conversor teste1 = new Conversor();
		String resposta = teste1.mapear("ZeroGlosa");
		System.out.println(resposta);
	}
	
	@Test
	public void teste2(){
		Conversor teste2 = new Conversor();
		String resposta = teste2.mapear("CTTUAG");
		System.out.println(resposta);
	}
	
	@Test
	public void teste3(){
		Conversor teste3 = new Conversor();
		String resposta = teste3.mapear("C");
		System.out.println(resposta);
	}
	
	@Test
	public void teste4(){
		Conversor teste4 = new Conversor();
		String resposta = teste4.mapear(null);
		System.out.println(resposta);
	}
	
	@Test
	public void teste5(){
		Conversor teste5 = new Conversor();
		String resposta = teste5.mapear("UAGC");
		System.out.println(resposta);
	}
}

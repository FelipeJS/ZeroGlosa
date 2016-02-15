package com.raindrops.testes;

import org.junit.Test;

import com.raindrops.model.Rain;

public class Teste {
	@Test
	public void teste1() {
		Rain rain = new Rain();
		System.out.println(rain.fatora(28));
	}

	@Test
	public void teste2() {
		Rain rain = new Rain();
		System.out.println(rain.fatora(1755));
	}

	@Test
	public void teste3() {
		Rain rain = new Rain();
		System.out.println(rain.fatora(14));
	}

	@Test
	public void teste4() {
		Rain rain = new Rain();
		System.out.println(rain.fatora(4));
	}

	@Test
	public void teste5() {
		Rain rain = new Rain();
		System.out.println(rain.fatora(0));
	}
}

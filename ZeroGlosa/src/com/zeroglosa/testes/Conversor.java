package com.zeroglosa.testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conversor {
	public static void main(String[] args) {
		Boolean continuar = true;

		ArrayList<Character> saida = new ArrayList<Character>();
		Scanner input = new Scanner(System.in);

		while (continuar) {

			try {
				String str = input.next();
				ArrayList<Character> entrada = new ArrayList<Character>();

				for (char c : str.toCharArray()) {
					entrada.add(c);

					switch (c) {
					case 'G':
						saida.add('C');
						break;
					case 'C':
						saida.add('G');
						break;
					case 'T':
						saida.add('A');
						break;
					case 'A':
						saida.add('U');
						break;
					}
				}
				
			} catch (Exception e) {
				throw e;
			}

		}

	}
}

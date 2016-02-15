package com.zeroglosa.model;

import java.util.HashMap;
import java.util.Map;

public class Conversor {
	
	public String mapear(String dna) {
		Map<Integer, Character> mapaLetras = new HashMap<Integer, Character>();
		
		try{
		dna = dna.toUpperCase();
		
		int contador = 0;
		
			for(char c : dna.toCharArray()){
				switch (c) {
				case 'G':
					mapaLetras.put(contador++, 'C');
					break;
				case 'C':
					mapaLetras.put(contador++, 'G');
					break;
				case 'T':
					mapaLetras.put(contador++, 'A');
					break;
				case 'A':
					mapaLetras.put(contador++, 'U');
					break;
				case 'U':
					mapaLetras.put(contador++, 'A');
					break;
				default:
					mapaLetras.put(contador++, ' ');
					mapaLetras.put(--contador, ' ');
					break;
				}
			}
		}catch(Exception e){
			System.out.print("Entrada Nula");
		}
		
		String retorno = mapaLetras.toString();
		return retorno;
	}

}

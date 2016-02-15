package com.raindrops.model;

public class Rain {

	public String fatora(int num) {
		String palavra = new String();
		
		try {

			if (num % 3 == 0) {
				palavra += "Pling";
			}

			if (num % 5 == 0) {
				palavra += "Plang";
			}

			if (num % 7 == 0) {
				palavra += "Plong";
			}
		} catch (Exception e) {
			throw e;
		}

		return palavra;
	}
}

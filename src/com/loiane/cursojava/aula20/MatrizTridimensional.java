package com.loiane.cursojava.aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {

		int[][][] matrizTridimensional = new int[3][3][3];
		
		for(int i=0; i <matrizTridimensional.length; i++) {
			
			for (int j=0; j < matrizTridimensional[i].length;j++) {
				
				for (int k=0; k < matrizTridimensional[i][j].length;k++) {
					System.out.println("| i: "+i+"| j: "+j+"| k: "+k+"|");
					
				}
			}
		}

	}

}

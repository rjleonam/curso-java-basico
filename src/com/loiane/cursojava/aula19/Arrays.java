package com.loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {

		double[] temperaturas = new double[3];
		
		temperaturas[0] =35;
		temperaturas[1] =37;
		temperaturas[2] =40.3;
		
		//System.out.println("tamnaho array: "+temperaturas.length);
		
		//for (int i=0; i < temperaturas.length; i++) {
		//	System.out.println("Temperatura do dia " +(i+1)+ " eh: "+ temperaturas[i]);
		//}
		
		//FOR melhorado
		
		for (double temp: temperaturas) {
			System.out.println(temp);
		}

	}

}

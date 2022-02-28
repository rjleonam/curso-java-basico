package com.loiane.cursojava.aula47;

public class Excecao {

	public static void main(String[] args) {

		try {
			
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			
			System.out.println("Nao ser� impresso");
			
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exce��o ao acessar um �ndce de vetor inexistente");
		}
		System.out.println("Impress�o p�s a exception");
	}

}

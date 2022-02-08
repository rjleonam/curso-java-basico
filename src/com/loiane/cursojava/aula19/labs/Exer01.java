package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer01 {
	/* 1. Criar um vetor A com 5 elementos inteiros. 
	 * Contruir um vetor B de mesmo tipo e tamanho e 
	 * comos "mesmos" elementos do Vetor A, ou seja,B[i]=A[i].*/
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print(" Entre com o valor da " + (i+1)+ "a posicao : ");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i];

		}

		System.out.println();
		System.out.print("Vetor A = ");
		 for (int i=0; i < vetorA.length;i++) {
			 System.out.print(vetorA[i] + " ");
		 }
		 System.out.println();
		 
		 System.out.print("Vetor B = ");
		 for (int i=0; i < vetorB.length;i++) {
			 System.out.print(vetorB[i] + " ");
		 }

	}

}

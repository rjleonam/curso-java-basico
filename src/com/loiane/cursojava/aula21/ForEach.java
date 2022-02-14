package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		int[] notas = new int[10];

		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {

			notas[i] = random.nextInt(10);

		}
		System.out.print("Array: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.print("[" + notas[i] + "] ");
		}

		System.out.println("\n");
		System.out.println("Usando for each");

		for (int nota : notas) {
			System.out.println(nota);
		}

		// Exemplo 02
		System.out.println("Exemplo com arrays multidimensionais");

		double[][] notasAlunos = new double[3][4];

		// Aluno 1
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 4;
		notasAlunos[0][2] = 6;
		notasAlunos[0][3] = 6;

		// Aluno 2

		notasAlunos[1][0] = 8;
		notasAlunos[1][1] = 7;
		notasAlunos[1][2] = 5;
		notasAlunos[1][3] = 9;
		// Aluno 3
		notasAlunos[2][0] = 10;
		notasAlunos[2][1] = 8;
		notasAlunos[2][2] = 9;
		notasAlunos[2][3] = 8.5;
		
		for ( double[] notasAluno : notasAlunos) {
			for (double nota : notasAluno) {
				System.out.print(nota + " | ");
			}
			System.out.println();
			
		}

	}

}

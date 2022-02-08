package com.loiane.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		//Armazenar as 4 notas do ano de 30 alunos.
		
		double[][] notasAlunos = new double [3][4]; // os valores dos vetores sempre devem ser indicados;
		
		/*Tais declaracoes a seguir poderiam ser feitas da seguinte forma:
		  notasAlunos[][] = {{10,4,6,6}, {8,7,5,9},{10,8,9,8.5}} 
		*/
		
		//Aluno 1
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 4;
		notasAlunos[0][2] = 6;
		notasAlunos[0][3] = 6;
		
		//Aluno 2
		
		notasAlunos[1][0] = 8;
		notasAlunos[1][1] = 7;
		notasAlunos[1][2] = 5;
		notasAlunos[1][3] = 9;
		//Aluno 3 
		notasAlunos[2][0] = 10;
		notasAlunos[2][1] = 8;
		notasAlunos[2][2] = 9;
		notasAlunos[2][3] = 8.5;
		
		for (int i=0; i < notasAlunos.length ; i++) {
			
			for (int j=0;  j < notasAlunos[i].length;j++) {
				System.out.print(notasAlunos[i][j]+" | ");
			}
			System.out.println();
				
		}
		
		//Mudando valor de uma celular da Matriz
		
		notasAlunos[1][3] = 8;
		System.out.println("============");
		for (int i=0; i < notasAlunos.length ; i++) {
			
			for (int j=0;  j < notasAlunos[i].length;j++) {
				System.out.print(notasAlunos[i][j]+" | ");
			}
			System.out.println();
				
		}
		
		//Calculando a média de notas de cada aluno
		System.out.println();
		System.out.println("..:::Calculando a média de cada aluno:::..");
		System.out.println("|");
		double soma;
		for (int i=0; i < notasAlunos.length ; i++) {
			soma=0;
			for (int j=0;  j < notasAlunos[i].length;j++) {
				soma+=notasAlunos[i][j];
			}
			System.out.println("Media do aluno "+ /*OBS=>*/(i+1) +" é= "+(soma/4));
		}
		
	}

}

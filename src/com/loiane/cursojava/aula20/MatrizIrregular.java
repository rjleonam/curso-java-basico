package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.print("Entre com o numero de pessoas que serao entrevistadas: ");
		int numEntrevistados = scan.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for (int i=0; i < nomesFilhos.length;i++) {
			//System.out.println();
			System.out.print("Entre com a qtd de filhos da "+(i+1)+"a pessoa: ");
			int qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for (int j=0; j < nomesFilhos[i].length;j++) {
				System.out.print("Digite o nome do "+(j+1)+"o filho: ");
				
				nomesFilhos[i][j] = scan.next();
			}
		}
		
		System.out.println();
		for (int i=0; i < nomesFilhos.length;i++) {
			
			System.out.println((i+1)+"a Pessoa tem "+nomesFilhos[i].length+" filho(s): ");
			
			for (int j=0; j < nomesFilhos[i].length;j++) {
			System.out.println("- "+nomesFilhos[i][j]);
			}
		}
	}

}

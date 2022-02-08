package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {
	
	/*Escreva um programa para guardar dados de uma pesquisa feita com uma amostra de pessoas da avenida mais movimentada da cidade onde você mora.
A pesquisa consiste em perguntar ao cidadão a quantidade de filhos e o nome de cada filho. Guarde essas informações em uma matriz de forma que cada pessoa entrevista. Ocupe somente o espaço necessário na memória para guardar os nomes dos filhos. Imprima a quantidade de pessoas entrevistadas aqui filhos de cada entrevistado e os respectivos nomes dos filhos.*/

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

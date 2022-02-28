package com.loiane.cursojava.aula49;

public class FinallyPegadinha {
	
	public static void main(String[] args) {
		int[] numeros = {4,8,16,32,64,128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for (int i=0; i < numeros.length;i++) {
			
			try {
				System.out.println(numeros[i]+" / " + denom[i]+" = "+ (numeros[i]/denom[i]));
				
				
			} 
			catch (ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero");
				System.exit(0); // essa linha faz com que ao terminar a execução do programa dentro do try ou catch,  o finally NAO eh executado.
			}
			catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Posicao do array invalida!");
				System.exit(0);
			}
			finally {
				System.out.println("Essa linha eh impressa sempre apos o try ou catch!");
				System.out.println();
			}
			
		}

	}

}

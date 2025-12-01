package classesExecutaveis;

import java.util.Arrays;

public class VetorBidimensional {

	public static void main(String[] args) {
		
		int[][] matriz = new int[2][3];
		matriz[0][0] = 90;
		matriz[0][1] = 70;
		matriz[0][2] = 60;
		
		matriz[1][0] = 50;
		matriz[1][1] = 30;
		matriz[1][2] = 40;
		
		
		// ORDENAR MATRIZES/ARRAYS
		Arrays.sort(matriz[0]);
		Arrays.sort(matriz[1]);
		
		//System.out.println(matriz);
		//PERCORRE AS LINHAS DO ARRAY
		int somaMatriz = 0;
		for(int posLinha = 0; posLinha < matriz.length; posLinha++) {
			System.out.println("==========================");
		// PARA CADA LINHA, PERCORRE TAMBEM AS COLUNAS DO ARRAY
			for(int posColuna = 0; posColuna < matriz[posLinha].length; posColuna++) {
				somaMatriz += matriz[posLinha][posColuna];
			}
		}
		System.out.println("Soma Total da matriz é: " + somaMatriz);
		
		System.out.println("==========================");
		String[][] grade = new String[10][10];
		for(int posLinha = 0; posLinha < grade.length; posLinha++) {
			for(int posColuna = 0; posColuna < grade[posLinha].length; posColuna++) {
				grade[posLinha][posColuna] = "-";
			}
		}
		
		for(int posLinha = 0; posLinha < grade.length; posLinha++) {
			for(int posColuna = 0; posColuna < grade[posLinha].length; posColuna++) {
				System.out.print(" " + grade[posLinha][posColuna]);
			}
			System.out.println();
		}

	}

}

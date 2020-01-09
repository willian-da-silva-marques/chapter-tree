package com.ocajexam.chapter.tree;

import com.ocajexam.chapter.tree.model.PirateShip;

/**
 * @since 09/01/2020
 * @author willian
 * 
 * Precedência de operadores é a ordem em que os operadores são avaliados estando em uma expressão.
 * A precedência poderá ser sobreposta com o uso de parênteses.
 *
 */
public class PrecedenciaDeOperadores {

	public static void main(String[] args) {
		
		/**
		 * Ordem de precedência neste exemplo
		 * 1º índice do array
		 * 2º chamada do método
		 * 3º acesso ao mesmobro
		 * 
		 */
		
		int[] array = new int[1];
		
		int seven = getNumberSeven();
		
		PirateShip pirateShip = new PirateShip();
		int quantityOfPirates = pirateShip.getQuantityOfPirates();
		
		array[0] = 20;
		
		for (int i = 0; i < array.length; i++) {
			int expressao = seven + 2 - quantityOfPirates * array[i] / 4;
			System.out.println(expressao);
		}	
	}

	private static int getNumberSeven() {
		return 7;
	}
}

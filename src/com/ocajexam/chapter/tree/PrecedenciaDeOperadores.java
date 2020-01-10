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
		 * 1º índice do array []
		 * 2º chamada do método ()
		 * 3º acesso a membros .
		 * 
		 */
		
		int[] array = new int[1];
		array[0] = 20;
		
		int seven = getNumberSeven();
		
		PirateShip pirateShip = new PirateShip();
		int quantityOfPirates = pirateShip.getQuantityOfPirates();		
		
		for (int i = 0; i < array.length; i++) {
			int expressao = seven + 13 - quantityOfPirates * array[i] / 4;
			System.out.println("Expressao: " + expressao);
		}
		
		int p1 = 1; int p2 = 5; int p3 = 10; int p4 = 25; int p5 = -5;
		
		/* Mesma precedência [são avaliados da esquerda para direita] */
		System.out.println("1º precedência: " + (p1 + p2 - p3)); // -4
		
		/* Precedência mais baixa (+) seguida por precedência mais alta (*) [o operador de precedência mais alta é avaliado primeiro]*/
		System.out.println("2º precedência: " + (p1 + p2 * p3)); // 51
		
		/* Quando a expressão inclui parênteses (), a precedência de operadores é sobreposta [o operador associado aos parênteses é avaliado primeiro]*/
		System.out.println("3º precedência: " + ((p1 + p2) * p3)); // 60
		
		/* Quando a expressão inclui vários conjuntos de parênteses (), [o operador associado aos parênteses mais interno é avaliado primeiro]*/
		System.out.println("4º precedência: " + (((p1 * (p2 + p3)) - p4) / p5)); // -10
	}

	private static int getNumberSeven() {
		return 7;
	}
}

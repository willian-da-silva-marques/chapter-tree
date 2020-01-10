package com.ocajexam.chapter.tree;

import com.ocajexam.chapter.tree.model.PirateShip;

/**
 * @since 09/01/2020
 * @author willian
 * 
 * Preced�ncia de operadores � a ordem em que os operadores s�o avaliados estando em uma express�o.
 * A preced�ncia poder� ser sobreposta com o uso de par�nteses.
 *
 */
public class PrecedenciaDeOperadores {

	public static void main(String[] args) {
		
		/**
		 * Ordem de preced�ncia neste exemplo
		 * 1� �ndice do array []
		 * 2� chamada do m�todo ()
		 * 3� acesso a membros .
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
		
		/* Mesma preced�ncia [s�o avaliados da esquerda para direita] */
		System.out.println("1� preced�ncia: " + (p1 + p2 - p3)); // -4
		
		/* Preced�ncia mais baixa (+) seguida por preced�ncia mais alta (*) [o operador de preced�ncia mais alta � avaliado primeiro]*/
		System.out.println("2� preced�ncia: " + (p1 + p2 * p3)); // 51
		
		/* Quando a express�o inclui par�nteses (), a preced�ncia de operadores � sobreposta [o operador associado aos par�nteses � avaliado primeiro]*/
		System.out.println("3� preced�ncia: " + ((p1 + p2) * p3)); // 60
		
		/* Quando a express�o inclui v�rios conjuntos de par�nteses (), [o operador associado aos par�nteses mais interno � avaliado primeiro]*/
		System.out.println("4� preced�ncia: " + (((p1 * (p2 + p3)) - p4) / p5)); // -10
	}

	private static int getNumberSeven() {
		return 7;
	}
}

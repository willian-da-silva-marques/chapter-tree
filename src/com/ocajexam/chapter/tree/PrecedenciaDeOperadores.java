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
		 * 1� �ndice do array
		 * 2� chamada do m�todo
		 * 3� acesso ao mesmobro
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

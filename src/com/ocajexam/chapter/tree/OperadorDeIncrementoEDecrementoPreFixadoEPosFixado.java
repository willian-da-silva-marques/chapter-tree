package com.ocajexam.chapter.tree;

/**
 * @since 07.01.2020
 * @author willian
 * 
 * Os operadores pr�-fixados executam seus operadores antes da avalia��o da express�o inteira 
 * Os operadores p�s-fixados executam seus operadores ap�s a express�o ter sido avaliada
 */
public class OperadorDeIncrementoEDecrementoPreFixadoEPosFixado {

	public static void main(String[] args) {
		// O operador de incremento pr�-fixado incrementa um valor de 1 unidade antes da express�o ser avaliada
		int x1 = 10;
		int y1 = ++x1;
		System.out.printf("x = %d y = %d%n", x1, y1);

		// O operador de incremento p�s-fixado incrementa um valor de 1 unidade ap�s a express�o ser avaliada
		int x2 = 10;
		int y2 = x2++;
		System.out.printf("x = %d y = %d%n", x2, y2);

		// O operador de decremento pr�-fixado decrementa um valor de 1 unidade antes da express�o ser avaliada
		int x3 = 10;
		int y3 = --x3;
		System.out.printf("x = %d y = %d%n", x3, y3);

		// O operador de decremento p�s-fixado decrementa um valor de 1 unidade ap�s a express�o ser avaliada
		int x4 = 10;
		int y4 = x4--;
		System.out.printf("x = %d y = %d%n", x4, y4);
	}
}
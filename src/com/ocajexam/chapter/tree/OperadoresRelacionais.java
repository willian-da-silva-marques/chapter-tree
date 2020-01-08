package com.ocajexam.chapter.tree;

/**
 * @since 07.01.2020
 * @author willian.marques 
 * Os operadores relacionais retornam valores boolean
 * relacionados a avalia��o de seus operandos esquerdo e direito.
 */
public class OperadoresRelacionais {

	public static void main(String[] args) {
		// opera��o com operandos primitivos do tipo int
		boolean b1 = 1 < 2;
		boolean b2 = 3 < 2;
		boolean b3 = 3 > 2;
		boolean b4 = 1 > 2;
		boolean b5 = 2 <= 2;
		boolean b6 = 3 <= 2;
		boolean b7 = 3 >= 3;
		boolean b8 = 2 >= 3;
		System.out.println("1 < 2: "+ b1);
		System.out.println("3 < 2: "+ b2);
		System.out.println("3 > 2: "+ b3);
		System.out.println("1 > 2: "+ b4);
		System.out.println("2 <= 2: "+ b5);
		System.out.println("3 <= 2: "+ b6);
		System.out.println("3 >= 3: "+ b7);
		System.out.println("2 >= 3: "+ b8);

		// opera��o com operandos primitivos do tipo char
		boolean b9 = 'A' < 'B';
		boolean b10 = '\u0041' < '\u0042';
		boolean b11 = 0x0041 < 0x0042;
		boolean b12 = 65 < 66;
		boolean b13 = 0101 < 0102;
		boolean b14 = '\101' < '\102';
		boolean b15 = 'A' < 0102;
		System.out.println("'A' < 'B': "+ b9);
		System.out.println("'\\u0041' < '\\u0042': "+ b10);
		System.out.println("0x0041 < 0x0042: "+ b11);
		System.out.println("65 < 66: "+ b12);
		System.out.println("0101 < 0102: "+ b13);
		System.out.println("'\\101' < '\\102': "+ b14);
		System.out.println("'A' < 0102: "+ b15);
		
		// opera��o com operandos primitivos do tipo float
//		boolean b16 = 9.00D < 9.50D;
//		boolean b17 = 9.00D < 9.50D;
//		boolean b18 = 9.00D < 9.50D;
//		boolean b19 = 9.00D < 9.50D;
//		boolean b20 = 9.00D < 9.50D;
//		boolean b21 = 9.00D < 9.50D;
//		boolean b22 = 9.00D < 9.50D;
//		boolean b16 = 9.00D < 9.50D;
//		boolean b16 = 9.00D < 9.50D;
	}
}
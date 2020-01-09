package com.ocajexam.chapter.tree;

/**
 * @since 09.01/2020
 * @author willian
 *
 *         Operadores de igualdade são operadores que verificam diretamente a
 *         igualdade entre primitivos e variáveis de referência.
 *         O operador de igualdade possui os sinais: == igual a != diferente de
 */
public class OperadorDeIguldade {

	public static void main(String[] args) {
//		int value = 12;
//		/* Comparação de primitivos tipo boolean, exibe true */
//		System.out.println("true == true: " + (true == true));
//
//		/* Comparação de primitivos tipo char, exibe false */
//		System.out.println("'a' != 'a': " + ('a' != 'a'));
//
//		/* Comparação de primitivos tipo byte, exibe true */
//		System.out.println("(byte) value == (byte) value: " + ((byte) value == (byte) value));
//
//		/* Comparação de primitivos tipo short, exibe false */
//		System.out.println("(short) value != (short) value: " + ((short) value != (short) value));
//
//		/* Comparação de primitivos tipo int, exibe true */
//		System.out.println("value == value: " + (value == value));
//
//		/* Comparação de primitivos tipo float, exibe true */
//		System.out.println("12F == 12f: " + (12F == 12f));
//
//		/* Comparação de primitivos tipo double, exibe true */
//		System.out.println("12D != 12d: " + (12D != 12d));
		
		/* Comparando valores de referencias */
		Object a = new Object();
		Object b = new Object();
		Object c = b;
		
		/**
		 * Usando o operador (== igual a)
		 */
		/* Referências são diferentes, exibe false */
		System.out.println("a == b: " + (a == b));
		
		/* Referências são diferentes, exibe false */
		System.out.println("a == c: " + (a == c));
		
		/* Referências são iguais, exibe true */
		System.out.println("b == c: " + (b == c));
		
		System.out.println();
		/**
		 * Usando o operador (!= diferente de)
		 */
		/* Referências são diferentes, exibe true */
		System.out.println("a != b: " + (a != b));
		
		/* Referências são diferentes, exibe true */
		System.out.println("a != c: " + (a != c));
		
		/* Referências são iguais, exibe false */
		System.out.println("b != c: " + (b != c));
	}
}
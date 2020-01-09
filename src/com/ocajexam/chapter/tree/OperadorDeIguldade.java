package com.ocajexam.chapter.tree;

/**
 * @since 09.01/2020
 * @author willian
 *
 *         Operadores de igualdade s�o operadores que verificam diretamente a
 *         igualdade entre primitivos e vari�veis de refer�ncia.
 *         O operador de igualdade possui os sinais: == igual a != diferente de
 */
public class OperadorDeIguldade {

	public static void main(String[] args) {
//		int value = 12;
//		/* Compara��o de primitivos tipo boolean, exibe true */
//		System.out.println("true == true: " + (true == true));
//
//		/* Compara��o de primitivos tipo char, exibe false */
//		System.out.println("'a' != 'a': " + ('a' != 'a'));
//
//		/* Compara��o de primitivos tipo byte, exibe true */
//		System.out.println("(byte) value == (byte) value: " + ((byte) value == (byte) value));
//
//		/* Compara��o de primitivos tipo short, exibe false */
//		System.out.println("(short) value != (short) value: " + ((short) value != (short) value));
//
//		/* Compara��o de primitivos tipo int, exibe true */
//		System.out.println("value == value: " + (value == value));
//
//		/* Compara��o de primitivos tipo float, exibe true */
//		System.out.println("12F == 12f: " + (12F == 12f));
//
//		/* Compara��o de primitivos tipo double, exibe true */
//		System.out.println("12D != 12d: " + (12D != 12d));
		
		/* Comparando valores de referencias */
		Object a = new Object();
		Object b = new Object();
		Object c = b;
		
		/**
		 * Usando o operador (== igual a)
		 */
		/* Refer�ncias s�o diferentes, exibe false */
		System.out.println("a == b: " + (a == b));
		
		/* Refer�ncias s�o diferentes, exibe false */
		System.out.println("a == c: " + (a == c));
		
		/* Refer�ncias s�o iguais, exibe true */
		System.out.println("b == c: " + (b == c));
		
		System.out.println();
		/**
		 * Usando o operador (!= diferente de)
		 */
		/* Refer�ncias s�o diferentes, exibe true */
		System.out.println("a != b: " + (a != b));
		
		/* Refer�ncias s�o diferentes, exibe true */
		System.out.println("a != c: " + (a != c));
		
		/* Refer�ncias s�o iguais, exibe false */
		System.out.println("b != c: " + (b != c));
	}
}
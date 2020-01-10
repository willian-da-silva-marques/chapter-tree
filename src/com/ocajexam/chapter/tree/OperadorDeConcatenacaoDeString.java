package com.ocajexam.chapter.tree;

import com.ocajexam.chapter.tree.model.TreasureMap;

/**
 * @since 10/01/2020
 * @author willian
 * 
 *         O operador de concatenação de strings concatena (une) as strings. O
 *         operador e representado pelo operador +
 *
 */
public class OperadorDeConcatenacaoDeString {

	public static void main(String[] args) {
		// Exemplo 1
		String item = "doub" + "loon";
		String question = "What is a " + item + "? ";
		System.out.println("Question: " + question);
		
		/**
		 * Adicionando primitivos a concatenação.
		 * A especificação da linguagem Java diz: "O operador de concatenação e sintaticamente associado a esquerda."
		 */
		/* Porcentagens de dobrões de ouro */
		float reale = .007812f;
		float escudo = .125f;
		
		/* Exibe 0.132812% of one gold doubloon */
		System.out.println(reale + escudo + "% of one gold doubloon.");
		
		/* Exibe 0.132812% of one gold doubloon */
		System.out.println((reale + escudo) + "% of one gold doubloon.");
		
		/* Exibe 0.132812% of one gold doubloon */
		System.out.println("% of one gold doubloon: " + (reale + escudo));
		
		/* Exibe Coin values concatenated: 0.0078120.125 */
		System.out.println("Coin values concatenated: " + reale + escudo);
		
		/**
		 * O método toString
		 * 
		 * Pertence a classe Object e serve para representar um objeto no formato string.
		 * 
		 */
		// Exemplo 1
		TreasureMap treasureMap = new TreasureMap("Blackbeard","Outer Banks");
		System.out.println(treasureMap);
		
		// Concatenando variáveis que inicialmente não são strings
		String title1 = " shovels.";
		String title2 = "Shovels: ";
		int flatShovels = 5;
		int roundPointShovels = 6;
		
		/* Exibe 11 shovels. */
		System.out.println(flatShovels + roundPointShovels + title1);
		
		/* Exibe 11 shovels. */
		System.out.println((flatShovels + roundPointShovels) + title1);
		
		/* Exibe Shovels: 56 */
		System.out.println(title2 + flatShovels + roundPointShovels);
		
		/* Exibe Shovels: 11 */
		System.out.println(title2 + (flatShovels + roundPointShovels));
	}
}

package br.com.w3resouce.basicparti;

import javax.swing.JOptionPane;

public class Exerc10 {

	public static void main(String[] args) {
		
		/*
		 * 10. Write a Java program to compute a specified formula 4.0 * (1 - (1.0/3) +
		 * (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
		 */
		
		JOptionPane.showMessageDialog(null, "O resultado da expressão 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) é: " + 
				(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))));
	}

}

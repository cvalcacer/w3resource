package br.com.w3resouce.basicparti;

import javax.swing.JOptionPane;

public class Exerc05 {

	public static void main(String[] args) {
		
		/*
		 * 5. Write a Java program that takes two numbers as input and display the
		 * product of two numbers.
		 */
		
		int a, b ;
				
		a = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número!"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número!"));
		
		JOptionPane.showMessageDialog(null, "O produto de: " + a + " e: " + b + " é: " + (a * b));
		
		
		
	}

}

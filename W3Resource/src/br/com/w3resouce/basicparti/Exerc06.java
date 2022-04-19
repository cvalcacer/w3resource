package br.com.w3resouce.basicparti;

import javax.swing.JOptionPane;

public class Exerc06 {
	public static void main(String[] args) {
		
		/*
		 * 6. Write a Java program to print the sum (addition), multiply, subtract, divide
		 * and remainder of two numbers.
		 */
		
		double a, b;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número!"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número!"));
		
		JOptionPane.showMessageDialog(null, "Os número são: " + a + " e: " + b +
				"\nA soma é " + (a + b) +
				"\nA multiplicação é " + (a * b) +
				"\nA subtração é " + (a-b) + 
				"\nA divisão é " + (a/b) + 
				"\nO resto é " + (a%b)
				);
		
	}

}

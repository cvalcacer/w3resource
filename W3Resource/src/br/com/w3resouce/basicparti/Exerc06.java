package br.com.w3resouce.basicparti;

import javax.swing.JOptionPane;

public class Exerc06 {
	public static void main(String[] args) {
		
		/*
		 * 6. Write a Java program to print the sum (addition), multiply, subtract, divide
		 * and remainder of two numbers.
		 */
		
		double a, b;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro n�mero!"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo n�mero!"));
		
		JOptionPane.showMessageDialog(null, "Os n�mero s�o: " + a + " e: " + b +
				"\nA soma � " + (a + b) +
				"\nA multiplica��o � " + (a * b) +
				"\nA subtra��o � " + (a-b) + 
				"\nA divis�o � " + (a/b) + 
				"\nO resto � " + (a%b)
				);
		
	}

}

package br.com.w3resouce.basicparti;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exerc12 {

	public static void main(String[] args) {
	
		/*
		 * 12. Write a Java program that takes three numbers as input to calculate and
		 * print the average of the numbers.
		 */
		
		double a,b,c;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro n�mero"));
		
		JOptionPane.showMessageDialog(null, "A m�dia de: "+a+ " , " +b+" , "+c+" �: " + ((a+b+c)/3));
				

	}

}

package br.com.w3resouce.basicparti;

import javax.swing.JOptionPane;

public class Exerc11 {

	public static void main(String[] args) {
		
		/* 11. Write a Java program to print the area and perimeter of a circle */
		
		double r;
		
		r = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do c�rculo!"));	
		JOptionPane.showMessageDialog(null, "O �rea do c�rculo �: " + (Math.PI)*(Math.pow(r, 2)));
		JOptionPane.showMessageDialog(null, "O per�metro do c�rculo �: " + 2* (Math.PI)*r);

	}

}

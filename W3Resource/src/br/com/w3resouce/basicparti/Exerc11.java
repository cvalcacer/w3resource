package br.com.w3resouce.basicparti;

import javax.swing.JOptionPane;

public class Exerc11 {

	public static void main(String[] args) {
		
		/* 11. Write a Java program to print the area and perimeter of a circle */
		
		double r;
		
		r = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do círculo!"));	
		JOptionPane.showMessageDialog(null, "O área do círculo é: " + (Math.PI)*(Math.pow(r, 2)));
		JOptionPane.showMessageDialog(null, "O perímetro do círculo é: " + 2* (Math.PI)*r);

	}

}

package br.com.w3resouce.basicparti;

import javax.swing.JOptionPane;

public class Exerc13 {

	public static void main(String[] args) {


		/* 13. Write a Java program to print the area and perimeter of a rectangle */
		
		double alt, lar;
		
		alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo"));
		lar = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do retângulo"));
		
		JOptionPane.showMessageDialog(null, "O área do retângulo é de: " + (alt*lar));
		JOptionPane.showMessageDialog(null, "O perímetro do retângulo é de: " + (2*(alt+lar)));
		

	}

}

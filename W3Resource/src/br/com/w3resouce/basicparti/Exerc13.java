package br.com.w3resouce.basicparti;

import javax.swing.JOptionPane;

public class Exerc13 {

	public static void main(String[] args) {


		/* 13. Write a Java program to print the area and perimeter of a rectangle */
		
		double alt, lar;
		
		alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do ret�ngulo"));
		lar = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do ret�ngulo"));
		
		JOptionPane.showMessageDialog(null, "O �rea do ret�ngulo � de: " + (alt*lar));
		JOptionPane.showMessageDialog(null, "O per�metro do ret�ngulo � de: " + (2*(alt+lar)));
		

	}

}

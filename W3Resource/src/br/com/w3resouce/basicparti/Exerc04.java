package br.com.w3resouce.basicparti;

import javax.swing.JOptionPane;

public class Exerc04 {
	public static void main(String[] args) {
		
		/*
		 * 4. Write a Java program to print the result of the following operations. Go
		 * to the editor Test Data: 
		 * a. -5 + 8 * 6 
		 * b. (55+9) % 9 
		 * c. 20 + -3*5 / 8 
		 * d. 5 + 15 / 3 * 2 - 8 % 3
		 */
		
	int soma;
	double divisao;
	double divisao2;
	double divisao3;
	
	System.out.println("O resultado da primeira operação é: " + (soma = (-5+(8*6))));
	System.out.println("O resultado da segunda operação é:  " + (divisao = ((55+9)/9)));
	System.out.println("O resultado da terceira operação é: " + (divisao2 = 20 + (-3*5)/8));
	System.out.println("O resultado da quarta operação é: " + (divisao3 = 5 + 15 / 3 * 2 - 8 % 3));
	
	JOptionPane.showMessageDialog(null, "O resultado da primeira operação é: " + (soma = (-5+(8*6))));
	JOptionPane.showMessageDialog(null, "O resultado da segunda operação é: " + (divisao = ((55+9)/9)));
	JOptionPane.showMessageDialog(null, "O resultado da terceira operação é: " + (divisao2 = 20 + (-3*5)/8));
	JOptionPane.showMessageDialog(null, "O resultado da quarta operação é: " + (divisao3 = 5 + 15 / 3 * 2 - 8 % 3));
		
		
	}

}

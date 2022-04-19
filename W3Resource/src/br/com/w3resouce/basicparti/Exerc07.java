package br.com.w3resouce.basicparti;

import javax.swing.JOptionPane;

public class Exerc07 {

	public static void main(String[] args) {
		
		/*
		 * 7. Write a Java program that takes a number as input and prints its
		 * multiplication table up to 10.
		 */
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
		
		JOptionPane.showMessageDialog(null, "Você digitou: " + a +
				"\n A tabuada do número escolhido: " +
				"\n " + a + " x 1 = " + (a*1) +	
				"\n " + a + " x 2 = " + (a*2) +	
				"\n " + a + " x 3 = " + (a*3) +	
				"\n " + a + " x 4 = " + (a*4) +	
				"\n " + a + " x 5 = " + (a*5) +	
				"\n " + a + " x 6 = " + (a*6) +	
				"\n " + a + " x 7 = " + (a*7) +	
				"\n " + a + " x 8 = " + (a*8) +	
				"\n " + a + " x 9 = " + (a*9) +	
				"\n " + a + " x 10 = " + (a*10)
			
				
				);
				
	}

}

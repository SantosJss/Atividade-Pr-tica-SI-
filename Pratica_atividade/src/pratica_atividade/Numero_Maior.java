package pratica_atividade;
//Crie um programa que leia 5 números do usuário e imprima o maior deles

import java.util.Scanner;
public class Numero_Maior {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.println("Digite cinco números:");

	       
	        int Numero_Maior = Integer.MIN_VALUE;

	        
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            int resultado = scanner.nextInt();

	            
	            if (resultado > Numero_Maior) {
	                Numero_Maior = resultado;
	            }
	        }

	        
	        System.out.println("O maior número é: " + Numero_Maior);

	       
	        scanner.close();
	    }
	}
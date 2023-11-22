package pratica_atividade;
//Crie um programa que leia um array de números e, em seguida, imprima a soma dos números lidos


import java.util.Scanner;
public class Array_numeros {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	     
	        System.out.print("Digite o tamanho do array: ");
	        int tamanhoArray = scanner.nextInt();

	        
	        int[] numeros = new int[tamanhoArray];

	        
	        System.out.println("Digite os números do array:");

	        
	        int soma = 0;
	        for (int i = 0; i < tamanhoArray; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	            soma += numeros[i];
	        }

	            System.out.println("A soma dos números do array é: " + soma);

	        
	        scanner.close();
	    }
	
}

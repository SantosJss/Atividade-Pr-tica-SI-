package pratica_atividade;
//Escreva um programa que leia 10 números do usuário e imprima a média deles

import java.util.Scanner; 
public class Media_numero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira 10 numeros");
		
		int soma = 0;
		
		for(int i=0; i<10; i++) {
		System.out.println("numero" + ( i + 1 ) + ":" );
		int resultado = scanner.nextInt();
		soma += resultado;
		
		}
		double media = soma / 10.0;
		System.out.println("Media dos numeros " + media);
		
		scanner.close();
				
			
	}

}

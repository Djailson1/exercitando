import java.util.Scanner;

/*Voc� pede um emprestimo a um amigo e precisa calcular quanto ir� pagar depois de  3 meses.
Voc� vai devolver 10% o valor restante do empr�stimo a cada mes.
Cria um programa que pegue a quantidade do empr�stimo como entrada, calcule e gere a quantidade restante despois de 3 meses.

Exemplo de entrada:
20000

Exemplo de salida:
10628

Aqu� est� o calendario das mensalidades pagas:
Mes 1
Pago: 10% de 20000 = 2000
Quantidade restante: 18000

Mes 2
Pago: 10% de 18000 = 1800
Quantidade restante: 16200

Mes 3:
Pago: 10% de 16200 = 1620
Quantidade restante: 14580*/

public class Exercicios {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual � o valor do empr�stimo?");
		int amount = scanner.nextInt();
		
        int cont = 1;
        
		for(int x = 0; x < 3; x++){
		
    
			amount -= amount * 0.10; 
			System.out.println("M�s " + cont++ + ": " + amount);
}
		
	}

}

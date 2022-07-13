import java.util.Scanner;

/*Inverter frase

Cria um programa que pega uma frase e escreve o inverso.
O programa pega a frase e coloca as letras em ordem inversa.

Exemplo de entrada:
hello there

Ejemplo de saida:
ereht olleh*/

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();

		
		int j = arr.length - 1;

		
		for (int i = j; i >= 0; i--) {

			System.out.print(arr[i]);

		}
	}

}

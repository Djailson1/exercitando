/*Crie um programa que conte exiba os números de 10 em 10 até 500*/
public class Contagem10Em10 {
	public static void main(String[] args) {
		for(int num = 1; num <= 500; num++) {
			if(num % 10 == 0) {
				System.out.print(num + " - ");
				
			}
		}
	}

}

/*Crie um programa que conte exiba os n�meros de 10 em 10 at� 500*/
public class Contagem10Em10 {
	public static void main(String[] args) {
		for(int num = 1; num <= 500; num++) {
			if(num % 10 == 0) {
				System.out.print(num + " - ");
				
			}
		}
	}

}

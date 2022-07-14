
public class Exercicio3 {
	public static void main(String[] args) {
		
		/*Imprima os números de 1 a 1000 exibindo de 10 em 10*/
		
		int numero;
		
		for(int num = 0; num <= 1000; num++) {
			
			if(num % 10 == 0) {
				System.out.print(num + " ");
			}
		}
	}

}

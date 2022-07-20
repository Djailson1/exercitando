/*Faça um programa que faz uma contagem regressiva de 100 a 1 contando de 5 em 5.*/
public class ContagemRegressiva5 {
	public static void main(String[] args) {
		
		for(int num = 100; num >= 1; num--) {
			
			if(num % 5 == 0) {
				System.out.print(num + " ");
			}
		}
	}

}

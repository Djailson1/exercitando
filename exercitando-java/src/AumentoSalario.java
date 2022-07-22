import java.util.Scanner;

/*Crie um programa que pergunta o valor de salário e retorna com um aumento de 10%*/
public class AumentoSalario {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double salario, salarioAumento;
		
		System.out.println("Qual é o valor do seu salário?");
		salario = scan.nextDouble();
		
		salarioAumento = salario + (salario * 0.10);
		
		System.out.println("Com aumento de 10% seu salário agora é de: " +  salarioAumento + " Reais.");
		
		
	}

}

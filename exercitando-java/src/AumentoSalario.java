import java.util.Scanner;

/*Crie um programa que pergunta o valor de sal�rio e retorna com um aumento de 10%*/
public class AumentoSalario {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double salario, salarioAumento;
		
		System.out.println("Qual � o valor do seu sal�rio?");
		salario = scan.nextDouble();
		
		salarioAumento = salario + (salario * 0.10);
		
		System.out.println("Com aumento de 10% seu sal�rio agora � de: " +  salarioAumento + " Reais.");
		
		
	}

}

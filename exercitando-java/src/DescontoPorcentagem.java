import java.util.Scanner;

public class DescontoPorcentagem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valorProduto,desconto;
		
		System.out.println("Digite o valor do produto: ");
		valorProduto = scan.nextDouble();
		
		desconto = valorProduto - (valorProduto * 0.05);
		
		System.out.println("O produto com desconto de 5% custará: " + desconto);
	}

}

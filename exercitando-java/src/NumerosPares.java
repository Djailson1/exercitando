/*Exiba números pares de 1 a 100*/
public class NumerosPares {
public static void main(String[] args) {
	
	for(int num = 1; num <= 100; num++) {
		if(num % 2 == 0) {
			System.out.print(num + "-");
		}
	}
}
}

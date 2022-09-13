package javaDeveloment;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int number1, number2, number3;
		
		System.out.println("Digite um numero: ");
		number1 = sc.nextInt();
		
		System.out.println("Digite um numero: ");
		number2 = sc.nextInt();
		
		System.out.println("Digite um numero: ");
		number3 = sc.nextInt();
		
		int heigher = max(number1, number2, number3);
		
		showResult(heigher);
		
		
	}
	
	public static int max(int x, int y, int z) {
		int aux; 
		
		if (x >y && x>z) {
			aux = x;
		}else if(y>z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = "+ value);
	}
}

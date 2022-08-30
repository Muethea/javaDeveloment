package javaDeveloment;

import java.util.Scanner;

/**
 * @author Fernando Muethea
 *
 */
public class teste {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		String name, sobrename, apelido, endereco;
		int age;
		int idadePermitida =18;
		System.out.println("Digite seu nome: ");
		name = in.nextLine();
		
		System.out.println("Digite seu Sobrenome: ");
		sobrename = in.nextLine();
		
		System.out.println("Digite seu apelido: ");
		apelido = in.nextLine();
		
		System.out.println("Digite seu endereco: ");
		endereco = in.nextLine();
		
		System.out.println("Qual é sua idade? ");
		age = in.nextInt();
		
		if (age >= idadePermitida) {
			System.out.println("Ola "+name+" ja podes votar :)");
		}else {
			System.out.println("OLa "+name+" Nao podes votar pois a sua idade é menor que "+idadePermitida);
		}
		
	}
}

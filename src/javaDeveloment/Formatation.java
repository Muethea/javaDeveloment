package javaDeveloment;

import java.util.Locale;

/**
 * @author Fernando Muethea
 *
 */
public class Formatation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double x = 23.12122;
		
		System.out.println(x);
		
//		Formatando as casas decimais
		
		System.out.printf("%.2f%n", x);
		
	}

}

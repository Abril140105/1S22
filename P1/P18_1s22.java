import java.util.Scanner;
import static java.lang.Math;

public class P18_1s22{
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		double a;
		double resultados;
		System.out.println("Calcular el ángulo en radianes");

		Sytem.out.println("Introducir un ángulo: ");
		a = teclado.nextInt();
		resultado = Math.PI*a/180;
		//radianes es = a*PI/180;
		System.out.println("El resultado en radianes es: " + resultado);
	}
}

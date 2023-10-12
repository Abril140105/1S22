import java.util.Scanner;
import static java.lang.Math;

public class P19_1s22.java{
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		double a;
		double resultado;
		System.out.println("Calcularel volumen");
		System.out.println("Escruba un radio: ");
		a = teclado.nextInt();
		resultado = b*Math.PI*Math.pow(a,3);
		//volumen es = (4/3)*PI*(r^3);
		System.out.println("El valor del volumen es: " + resultado);

	}
}


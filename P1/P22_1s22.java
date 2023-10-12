import java.uti.Scanner;
import java.lang.Math;

public class P22_1s22{
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		int X;
		int Y;
		int A;
		int B;
		int C;
		int abs;
		double distancia;
		double raizAB;
		System.out.println("Introducir las coordenadas del punto X: ");
		X = teclado.nextInt();
		System.out.println("Introducir las coordenadas del punto Y: ");
		Y = teclado.nextint();
		System.out.println("Introducir el valor de A: ");
		A = teclado.nextInt();
		System.out.println("Introducir el valor de B: ");
		B = teclado.nextInt();
		System.out.prinlnt("Introducir el valor de C: ");
		C = teclado.nextInt();

		//operaciones

		//valor obsoluto
		abs = Math.abs(A*X + B*Y + C);

		//raiz de A + B
		raizAB = math.squrt(Math.pow(A,2)+Math.pow(B,2));

		//Valor absoluto entre raiz A + B
		distancia = (abs*raizAB)/(raizAB*raizAB);

		System.out.println("El valor de la distancia es: " + distancia);
	}
}

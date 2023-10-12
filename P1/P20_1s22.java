import java.util.Scanner;
import java.lang.Math;

public class P20_1s22{
	public static void main(String[] args) {
		java.util.Scanner teclado = new Sacnner (System.in);
		double radio;
		double area;
		double longitud;
		System.out.println("Calcular el área y la longitud");
		System.out.println("Escribe el radio: ");
		radio = teclado.nextInt();
		//area = Math.PI*radio;
		longitud = 2*Math.PI*radio;
		//longitud = 2*PI*r;
		System.out.println("El resulatdodel area es: " + area);
		System.out.println("El resultado de longitud es: " + longitud);

	}
}  

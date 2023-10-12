import java.util.Scanner;

public class P24_1s22{
	public static void main(String[] args) {
		java.util,Scanner teclado = new Scanner(System.in);
		int i, num;
		System.out.println("Tabla de multiplicar");
		System.out.println("Escribar un numero del 1 al 9");
		num = teclado.nextInt();
		for(i=1; i<=10; 1++){
			System.out.println(num+"x"+i+"="+(num*i));
		}
	}
}

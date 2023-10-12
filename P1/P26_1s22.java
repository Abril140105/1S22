import java.util.Scanner

public class P26_1s22{
	public static void main(String[] args) {
		System.out.println("Escribir los numeros del 1 al 100");
		for (int i = 1; 1 <= 100; 1++) {
			System.out.println(i + " ");
			if (i % 10 == 0){
				System.out.println();
			}
		}
	}
}

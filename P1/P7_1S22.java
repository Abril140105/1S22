import java.util.Scanner;
class P7_1S22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String temp;
		int num1, num2;
		int resultado;
    teclado.close();

		System.out.println("Ingresa el primer numero: ");
		temp = teclado.nextLine();
		num1 = Integer.parseInt(temp);
		System.out.println("Ingresa el segundo numero");
		temp = teclado.nextLine();
		num2 = Integer.parseInt(temp);
		resultado = num1 * num2;
		System.out.println("La multiplicacion de los dos numeros es: " + resultado);


	}
}
import java.util.Scanner;
public class P11_1s22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int Edad;

			System.out.println("Ingresa tu edad");
			Edad = teclado.nextInt();
		
			if (Edad >= 18){
				System.out.println ("Eres mayor de edad");

			}else{
			System.out.println("No eres mayor de edad");
			}
			// raiz cuadrada, potencia, residuo de division

			System.out.println("Potencia"+ Math.pow(5,3));
			System.out.println("Residuo de 10/5:"+ (10%2));
			System.out.println("Residuo de 11/2:"+ (11%2));
		}

		}
	


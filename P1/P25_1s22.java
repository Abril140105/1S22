import java.util.Scanner;

public class P25_1s22{
	java.util.Scanner teclado = new Scanner(System.in){ 
	int v,i,r;

	System.out.println("Calcule la caída de potencial producida por una resistencia segun la ley de Ohm\n");
	System.out.println("Escribir el valor de la intencidad: ");
	i = teclado.nextInt();
	System.out.println("Escribir el valor de la resistencia: ");
	r = teclado.nextInt();

	if (r<=0 || r>1000){
		System.out.prinltn("El valor de la resitencia esta fuera de limites aceptables indicados");
	}
	else {
		v = i*r;
		System.out.println("El resultado de los voltios es: " + v);
	}
	}
	 }

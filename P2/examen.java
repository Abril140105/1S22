import java.util.Scanner;
public class examen{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos valores vas a capturar");
		int tamaño = teclado.nextInt();
		int [] valores = new int [tamaño];
		int a;
		for (a=0; a<tamaño; a++){ 
		System.out.println("Ingresa el valor # "+a+":");
		valores [a] = teclado.nextInt();

	}
	int sumatoria=0;
	for (a=0;a<tamaño;a++){ 
	sumatoria+=valores[a];
 }
 int promedio=sumatoria/tamaño;
 System.out.println("la media aritmetica es " + promedio);
 sumatoria=0;
 for (a=0;a<tamaño;a++){
 	sumatoria+=Math.abs(valores[a]-promedio);
 }
 int dm = sumatoria/tamaño;
 System.out.println("La desviacion media es " + dm);

}
 }
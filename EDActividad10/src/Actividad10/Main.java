package Actividad10;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Usuario u1 = new Usuario("208934H" , "BUENOS DIAS", pedirPorPantalla());

		System.out.println(u1.toString());
		
		System.out.println("La valoracion es de: " + u1.mediaDeValoraciones());
		
		u1.imprimirValoraciones();
		
		u1.valoracionMayorMenor(u1);
		
		
	}
	
	public static double[] pedirPorPantalla() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantas valoraciones vas ha introducir?");
		int num1 = sc.nextInt();
		
		double[] valoraciones = new double[num1];
		
		for(int i = 0; i < num1; i++) {
			System.out.println("Introduce un numero: ");
			valoraciones[i] = sc.nextDouble();
		}
		return valoraciones;
	}

	
}


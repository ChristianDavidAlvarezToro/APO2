import java.util.Scanner;

public class Promedio_5Pruebas {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double calificacion1,calificacion2,calificacion3,promedio;
		String alumno;
		String nombre;
		String apellido;
		String edad;
		
		System.out.println("Nombre del alumno: ");
		nombre = teclado.nextLine();
		System.out.println("Apellido del alumno: ");
		apellido=teclado.nextLine();
		System.out.println("Edad del alumno: ");
		edad=teclado.nextLine();
		System.out.println("Calificacion de la evaluacion 1: ");
		calificacion1=teclado.nextDouble();
		System.out.println("Calificacion de la evaluacion 2: ");
		calificacion2=teclado.nextDouble();
		System.out.println("Calificacion de la evaluacion 3: ");
		calificacion3=teclado.nextDouble();
		promedio=(calificacion1+calificacion2+calificacion3)/3;
		System.out.println("El promedio final del alumno: "+promedio);
		
	}

}


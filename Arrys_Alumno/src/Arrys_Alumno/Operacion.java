package Arrys_Alumno;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Operacion {
	
	private Alumno [] lista = new Alumno [10];
	private Alumno alumno = new Alumno ();
	
	
	public void recorrerAlumno() {
		Scanner sc = new Scanner (System.in);
		
		int CantAlumnos;
		CantAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de alumnos: "));
		
		for ( int i = 0; i < 10; i++) {
			
			System.out.print("ingrese el nombre del alumno:    ");
			alumno.setNombre (sc.next());
			
			System.out.print("ingrese el apellido del alumno:  ");
			alumno.setApellido (sc.next());
			
			System.out.print("ingrese la nota del alumno:      ");
			alumno.setNota (sc.nextDouble());
			
			lista [i] = alumno;
			
		}
		for (int i = 0; i < lista.length; i++) {
			
			System.out.print(lista[i]);
		}
			
		System.out.print(" El alumno ingresado es: " + alumno.toString());
		
	}

}

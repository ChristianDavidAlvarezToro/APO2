package Algoritmos_Uno;

import java.util.Scanner;

public class Año_Bisiesto {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite el anio: ");
		
		int anio = sc.nextInt();
		
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
			System.out.println("El anio es bisiesto");
		else
			System.out.println("El anio no es bisiesto");
	}

	
	
}

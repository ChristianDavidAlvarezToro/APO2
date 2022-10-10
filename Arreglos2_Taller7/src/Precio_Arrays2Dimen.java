import java.util.Scanner;

public class Precio_Arrays2Dimen {
	
	public static void main(String[] args) {
		
		final int FILAS = 10, COLUMNAS = 3;
        Scanner sc = new Scanner(System.in);
        int i, j, mayor, menor;

        float [][] Precio = new float [FILAS][COLUMNAS]; //Se crea una matriz de 5 filas y 4 columnas
		
		
		Precio [0][0] = 100;
		Precio [0][1] = 100;
		Precio [0][2] = 100;
		
		Precio [1][0] = 100;
		Precio [1][1] = 100;
		Precio [1][2] = 100;
		
		Precio [2][0] = 100;
		Precio [2][1] = 100;
		Precio [2][2] = 100;
		
		Precio [3][0] = 100;
		Precio [3][1] = 100;
		Precio [3][2] = 100;
		
		Precio [4][0] = 100;
		Precio [4][1] = 100;
		Precio [4][2] = 100;
		
		Precio [5][0] = 100;
		Precio [5][1] = 100;
		Precio [5][2] = 100;
		
		Precio [6][0] = 100;
		Precio [6][1] = 100;
		Precio [6][2] = 100;
		
		Precio [7][0] = 100;
		Precio [7][1] = 100;
		Precio [7][2] = 100;
		
		Precio [8][0] = 100;
		Precio [8][1] = 100;
		Precio [8][2] = 100;
	
		Precio [9][0] = 100;
		Precio [9][1] = 100;
		Precio [9][2] = 100;
		
		 //Mostrar por pantalla los valores que contiene la matriz
        System.out.println("valores introducidos:");
        for (i = 0; i < Precio.length; i++) { 
            for (j = 0; j < Precio[i].length; j++) {
                System.out.print(Precio[i][j] + " ");
            }
            System.out.println();
		}
	}
}

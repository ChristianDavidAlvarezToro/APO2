import java.util.Scanner;

public class Arrays2Dimen_Long {
	
	public static void main(String[] args) {
		
		final int FILAS = 4, COLUMNAS = 3;
        Scanner sc = new Scanner(System.in);
        int i, j, mayor, menor;

        int[][] A = new int[FILAS][COLUMNAS]; //Se crea una matriz de 5 filas y 4 columnas

               A[0][0]= 5;
    		   A[0][1]= 5;
    		   A[0][2]= 5;
    		   A[1][0]= 5;
    		   A[1][1]= 5;
    		   A[1][2]= 5;
    		   A[2][0]= 5;
    		   A[2][1]= 5;
    		   A[2][2]= 5;
    		   A[3][0]= 5;
    		   A[3][1]= 5;
    		   A[3][2]= 5;

        //Mostrar por pantalla los valores que contiene la matriz
        System.out.println("valores introducidos:");
        for (i = 0; i < A.length; i++) { 
            for (j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
		}
	}
}

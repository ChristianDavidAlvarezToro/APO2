
public class Bytes_Arrays1Dimen {
	
public static void main(String[] args) {
		
		byte [] Valores = new byte [9];
		
		Valores [0] = 1;
		Valores [1] = 1;
		Valores [2] = 1;
		Valores [3] = 1;
		Valores [4] = 1;
		Valores [5] = 1;
		Valores [6] = 1;
		Valores [7] = 1;
		Valores [8] = 1;
		
		System.out.println("valores introducidos:");
		for (int i = 0; i < Valores.length; i++){
		    // aqui se puede referir al objeto con arreglo[i];
			System.out.println (Valores [i] + " ");
		}
	}
}

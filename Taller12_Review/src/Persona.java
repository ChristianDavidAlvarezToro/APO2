
public class Persona {
	
		 //Constantes
		
	    private final static char SEXO_DEF = 'H';
	    
	     // El peso de la persona esta por debajo del peso ideal
	    
	    public static final int INFRAPESO = -1;
	    // El peso de la persona esta en su peso ideal
	    
	    public static final int PESO_IDEAL = 0;
	 
	    
	     // El peso de la persona esta por encima del peso ideal
	     
	    public static final int SOBREPESO = 1;
	 
	    //Atributos
	     
	    private String nombre;
	 
	    
	     // Edad de la persona
	     
	    private int edad;
	 
	      //DNI de la persona, se genera al construir el objeto
	     
	    private String DNI;
	 
	      //Sexo de la persona, H hombre M mujer
	     
	    private char sexo;
	 
	    // Peso de la persona
	     
	    private double peso;
	 
	     // Altura de la persona
	    
	    private double altura;
	 
	    //Contructores
	     
	    public Persona() {
	        this("", 0, SEXO_DEF, 0, 0);
	    }
	 
	    
	    // Constructor con 3 parametroe
	     
	    public Persona(String nombre, int edad, char sexo) {
	        this(nombre, edad, sexo, 0, 0);
	    }
	 
	    /**
	     * Constructor con 5 parametros
	     *
	     * @param nombre de la persona
	     * @param edad de la persona
	     * @param sexo de la persona
	     * @param peso de la persona
	     * @param altura de la persona
	     */
	    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.peso = peso;
	        this.altura = altura;
	        generarDni();
	        this.sexo = sexo;
	        comprobarSexo();
	    }
	 
	    //Métodos privados
	    private void comprobarSexo() {
	        if (sexo != 'H' && sexo != 'M') {
	            this.sexo = SEXO_DEF;
	        }
	    }
	 
	    private void generarDni() {
	        final int divisor = 23;
	 
	        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
	        int res = numDNI - (numDNI / divisor * divisor);
	        char letraDNI = generaLetraDNI(res);
	        DNI = Integer.toString(numDNI) + letraDNI;
	    }
	 
	    private char generaLetraDNI(int res) {
	        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
	            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
	            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	 
	        return letras[res];
	    }
	 
	    //Métodos publicos
	     
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	 
	     //Modifica la edad de la persona
	     
	    public void setEdad(int edad) {
	        this.edad = edad;
	    }
	    
	     // Modifica el sexo de la persona, comprueba que es correcto
	     
	    public void setSexo(char sexo) {
	        this.sexo = sexo;
	    }
	 
	      //Modifica el peso de la persona
	     
	    public void setPeso(double peso) {
	        this.peso = peso;
	    }
	 
	     // Modifica la altura de la persona
	     
	    public void setAltura(double altura) {
	        this.altura = altura;
	    }
	 
	    
	     //Calcula el indice de masa corporal
	     
	     // codigo numerico
	      //<ul><li>-1: la persona esta por debajo de su peso ideal</li>
	      //<li>0: la persona esta en su peso ideal</li>
	     //<li>1: la persona esta por encima de su peso ideal</li></ul>
	     
	    public int calcularIMC() {
	     
	        double pesoActual = peso / (Math.pow(altura, 2));
	
	        if (pesoActual >= 20 && pesoActual <= 25) {
	            return PESO_IDEAL;
	        } else if (pesoActual < 20) {
	            return INFRAPESO;
	        } else {
	            return SOBREPESO;
	        }
	    }
	 
	    
	      //Indica si la persona es mayor de edad
	     
	    public boolean esMayorDeEdad() {
	        boolean mayor = false;
	        if (edad >= 18) {
	            mayor = true;
	        }
	        return mayor;
	    }
	 
	    
	      //Devuelve informacion del objeto
	    
	    public String toString() {
	        String sexo;
	        if (this.sexo == 'H') {
	            sexo = "hombre";
	        } else {
	            sexo = "mujer";
	        }
	        return "Informacion de la persona:\n"
	                + "Nombre: " + nombre + "\n"
	                + "Sexo: " + sexo + "\n"
	                + "Edad: " + edad + " años\n"
	                + "DNI: " + DNI + "\n"
	                + "Peso: " + peso + " kg\n"
	                + "Altura: " + altura + " metros\n";
	    }
	 
	}



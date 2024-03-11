package POO;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    private final char SEXO_DEF = 'H';

    // Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = SEXO_DEF;
        this.peso = 0;
        this.altura = 0;
        this.DNI = generaDNI();
    }

    // Constructor con nombre, edad y sexo; el resto por defecto
    public Persona(String nombre, int edad, char sexo) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo();
    }

    // Constructor con todos los atributos como parámetro
    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this(nombre, edad, sexo);
        this.peso = peso;
        this.altura = altura;
        this.DNI = DNI;
    }

    // Métodos
    public int calcularIMC() {
        final int DEBAJO = -1;
        final int IDEAL = 0;
        final int SOBREPESO = 1;
        double imc = peso / (Math.pow(altura, 2));
        if (imc < 20) return DEBAJO;
        else if (imc <= 25) return IDEAL;
        else return SOBREPESO;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private void comprobarSexo() {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEF;
        }
    }

    private String generaDNI() {
        final int divisor = 23;
        int numDNI = (int) (Math.random() * 100000000);
        char letraDNI = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numDNI % divisor);
        return Integer.toString(numDNI) + letraDNI;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "DNI: " + DNI + "\n" +
                "Sexo: " + sexo + "\n" +
                "Peso: " + peso + " kg\n" +
                "Altura: " + altura + " m";
    }

    // Métodos set (excepto para DNI)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
        comprobarSexo();
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}


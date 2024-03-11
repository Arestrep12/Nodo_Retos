package POO;

import java.util.Scanner;

public class EjecutablePersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos
        System.out.println("Introduce nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce edad:");
        int edad = scanner.nextInt();

        System.out.println("Introduce sexo (H/M):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Introduce peso:");
        double peso = scanner.nextDouble();

        System.out.println("Introduce altura en metros:");
        double altura = scanner.nextDouble();

        // Crear objetos
        Persona persona1 = new Persona(nombre, edad, sexo);
        persona1.setPeso(peso);
        persona1.setAltura(altura);

        Persona persona2 = new Persona(nombre, edad, sexo);

        Persona persona3 = new Persona();

        // Mostrar información y comprobar IMC y si es mayor de edad
        mostrarInformacion(persona1);
        mostrarInformacion(persona2);
        mostrarInformacion(persona3);
    }

    private static void mostrarInformacion(Persona persona) {
        System.out.println(persona);
        int resultadoIMC = persona.calcularIMC();
        System.out.println("IMC: " + interpretarIMC(resultadoIMC));
        System.out.println("Mayor de edad: " + (persona.esMayorDeEdad() ? "Sí" : "No"));
        System.out.println();
    }

    private static String interpretarIMC(int resultadoIMC) {
        switch (resultadoIMC) {
            case -1: return "Debajo de su peso ideal";
            case 0: return "En su peso ideal";
            case 1: return "Sobrepeso";
            default: return "Indeterminado";
        }
    }
}

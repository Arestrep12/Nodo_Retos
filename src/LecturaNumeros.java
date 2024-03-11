import java.util.ArrayList;
import java.util.Scanner;

public class LecturaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Introduce números enteros (escribe -99 para terminar):");

        while (true) {
            numero = scanner.nextInt();
            if (numero == -99) {
                break;
            }
            numeros.add(numero);
        }

        int suma = 0;
        for (int valor : numeros) {
            suma += valor;
        }
        double media = (numeros.size() > 0) ? (double) suma / numeros.size() : 0;

        System.out.println("Número de valores leídos: " + numeros.size());
        System.out.println("Suma de los valores: " + suma);
        System.out.printf("Media de los valores: %.2f\n", media);

        int mayoresQueMedia = 0;
        System.out.println("Valores leídos:");
        for (int valor : numeros) {
            System.out.println(valor);
            if (valor > media) {
                mayoresQueMedia++;
            }
        }

        System.out.println("Número de valores mayores que la media: " + mayoresQueMedia);
    }
}

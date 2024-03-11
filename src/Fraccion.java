public class Fraccion {
    private int numerador;
    private int denominador;

    // Constructor para fracción
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    // Métodos para realizar operaciones con otra fracción
    public Fraccion sumar(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador + otra.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion restar(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador - otra.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion multiplicar(Fraccion otra) {
        return new Fraccion(this.numerador * otra.numerador, this.denominador * otra.denominador);
    }

    public Fraccion dividir(Fraccion otra) {
        return new Fraccion(this.numerador * otra.denominador, this.denominador * otra.numerador);
    }

    // Métodos para realizar operaciones con un entero
    public Fraccion sumar(int numero) {
        return sumar(new Fraccion(numero, 1));
    }

    public Fraccion restar(int numero) {
        return restar(new Fraccion(numero, 1));
    }

    public Fraccion multiplicar(int numero) {
        return multiplicar(new Fraccion(numero, 1));
    }

    public Fraccion dividir(int numero) {
        return dividir(new Fraccion(numero, 1));
    }

    // Método para simplificar la fracción
    private void simplificar() {
        int gcd = gcd(numerador, denominador);
        numerador /= gcd;
        denominador /= gcd;
    }

    // Método para calcular el máximo común divisor (utilizado en simplificar)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}

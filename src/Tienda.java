import java.util.HashMap;
import java.util.Scanner;

public class Tienda {
    private static HashMap<String, Double> productos = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("Introduce el número de la opción que quieras:");
            System.out.println("1.- Introducir producto");
            System.out.println("2.- Modificar precio");
            System.out.println("3.- Mostrar todos los productos");
            System.out.println("4.- Eliminar producto");
            System.out.println("5.- Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea después del número

            switch (opcion) {
                case 1:
                    introducirProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    mostrarProductos();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
            }
        }
    }

    private static void introducirProducto() {
        System.out.println("Introduce el nombre del producto:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce el precio del producto:");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir línea restante
        productos.put(nombre, precio);
        System.out.println("Producto añadido correctamente.");
    }

    private static void modificarPrecio() {
        System.out.println("Introduce el nombre del producto a modificar:");
        String nombre = scanner.nextLine();
        if (productos.containsKey(nombre)) {
            System.out.println("Introduce el nuevo precio:");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Consumir línea restante
            productos.put(nombre, precio);
            System.out.println("Precio modificado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la lista.");
        } else {
            for (String key : productos.keySet()) {
                System.out.println(key + ": " + productos.get(key));
            }
        }
    }

    private static void eliminarProducto() {
        System.out.println("Introduce el nombre del producto a eliminar:");
        String nombre = scanner.nextLine();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}

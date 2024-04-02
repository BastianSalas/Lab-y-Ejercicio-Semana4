import java.util.Scanner;

public class operaciones {
    static Scanner scanner = new Scanner(System.in);

    public static void suma() {
        int a, b;
        System.out.print("Ingrese un número entero: ");
        a = scanner.nextInt();
        System.out.print("Ingrese otro número entero: ");
        b = scanner.nextInt();

        System.out.println("El resultado de la suma es: " + (a + b));
    }

    public static void resta() {
        int a, b;
        System.out.print("Ingrese un número entero: ");
        a = scanner.nextInt();
        System.out.print("Ingrese otro número entero: ");
        b = scanner.nextInt();

        System.out.println("El resultado de la resta es: " + (a - b));
    }

    public static void multiplicacion() {
        int a, b;
        System.out.print("Ingrese un número entero: ");
        a = scanner.nextInt();
        System.out.print("Ingrese otro número entero: ");
        b = scanner.nextInt();

        System.out.println("El resultado de la multiplicación es: " + (a * b));
    }

    public static void division() {
        int a, b;
        System.out.print("Ingrese un número entero: ");
        a = scanner.nextInt();
        System.out.print("Ingrese otro número entero distinto de cero: ");
        b = scanner.nextInt();

        if (b == 0) {
            System.out.println("No se puede dividir por cero.");
        } else if (a < 0) {
            System.out.println("El primer número ingresado debe ser mayor que cero.");
        } else if (b < 0) {
            System.out.println("El segundo número ingresado debe ser mayor que cero.");
        } else {
            System.out.println("El resultado de la división es: " + (a / b));
            System.out.println("El resto de la división es: " + (a % b));
        }
    }
}

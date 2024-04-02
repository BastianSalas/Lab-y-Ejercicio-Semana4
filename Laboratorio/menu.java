import java.util.Scanner;

public class menu {
    static Scanner scanner = new Scanner(System.in);

    public static void menuPrincipal() {
        int goku;

        do {
            System.out.println("·········································································");
            System.out.println("                                  Menú                                   ");
            System.out.println("                                                                         ");
            System.out.println("Suma....................................................................1");
            System.out.println("Resta...................................................................2");
            System.out.println("Multiplicación..........................................................3");
            System.out.println("División................................................................4");
            System.out.println("Salir ..................................................................5");
            System.out.println("                                                                         ");
            System.out.println("·········································································");
            System.out.print("Elija opción: ");

            goku = scanner.nextInt();

            switch (goku) {
                case 1:
                    operaciones.suma();
                    break;
                case 2:
                    operaciones.resta();
                    break;
                case 3:
                    operaciones.multiplicacion();
                    break;
                case 4:
                    operaciones.division();
                    break;
                case 5:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida (1-5).");
            }
        } while (goku != 5);

        scanner.close();
    }
}

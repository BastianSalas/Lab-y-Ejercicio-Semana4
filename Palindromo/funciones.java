import java.util.Scanner;

public class funciones {
    static Scanner scanner = new Scanner(System.in);

    public static void verificarPalindromo() {
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.next();
    
        if (esPalindromo(palabra.toLowerCase()))
            System.out.println("La palabra '" + palabra + "' es un palíndromo.");
        else
            System.out.println("La palabra '" + palabra + "' no es un palíndromo.");
    }
    
    private static boolean esPalindromo(String palabra) {
        if (palabra.length() <= 1)
            return true;
        else if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1))
            return esPalindromo(palabra.substring(1, palabra.length() - 1));
        else
            return false;
    }
}

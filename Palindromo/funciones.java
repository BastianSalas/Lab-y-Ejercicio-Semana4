import java.util.Scanner;

public class funciones {
    static Scanner scanner = new Scanner(System.in);

    public static void verificarPalindromo() {
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.next(); // Se solicita al usuario que ingrese una palabra y se guarda en la variable 'palabra'
    
        if (esPalindromo(palabra.toLowerCase())) // Se llama al método 'esPalindromo()' para verificar si la palabra ingresada es un palíndromo
            System.out.println("La palabra '" + palabra + "' es un palíndromo."); // Si es un palíndromo, se imprime un mensaje indicándolo
        else
            System.out.println("La palabra '" + palabra + "' no es un palíndromo."); // Si no es un palíndromo, se imprime un mensaje indicándolo
    }
    
    private static boolean esPalindromo(String palabra) {
        if (palabra.length() <= 1) // Si la longitud de la palabra es menor o igual a 1, significa que es un palíndromo
            return true;
        else if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1)) // Si el primer y último carácter son iguales
            return esPalindromo(palabra.substring(1, palabra.length() - 1)); // Se llama recursivamente a la función con la palabra sin el primer y último carácter
        else
            return false; // Si los caracteres no son iguales, la palabra no es un palíndromo
    }
}

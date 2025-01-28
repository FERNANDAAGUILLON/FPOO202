import java.util.Scanner;
public class ejrecicio3 {
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un entero X: ");
        int x = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= x; i++) {
            suma += i;
        }

        System.out.println("La suma de todos los enteros desde 1 hasta " + x + " es: " + suma);

        scanner.close();
    }
}


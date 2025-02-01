import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numero = sc.nextInt();
        for (int i = numero; i >= 0; i--) {
            if (i < numero) System.out.print(", ");
            System.out.print(i);
        }
    }
}









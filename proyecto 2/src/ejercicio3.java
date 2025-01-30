
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("introduce la edad del cliente: ");
        int edad = scanner.nextInt();

        if (edad < 4) ;
        {
            System.out.print("entrada gartis. ");

        }  if (edad >= 4 && edad <= 18){

            System.out.print(" El precio de la entrada 110. ");

            } else {

            System.out.print(" el precio de la entrada 190. ");

        }

        scanner.close();
    }
}







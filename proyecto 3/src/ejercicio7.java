import java.util.Scanner;

public class ejercicio7 {
    {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de * de la base: ");
        int base = sc.nextInt();
        int altura = base / 2 + 1;

        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < altura - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
    }
}






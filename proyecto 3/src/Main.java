import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número entero positivo: ");
    int numero = sc.nextInt();
    for (int i = 1; i <= numero; i += 2) {
        if (i > 1) System.out.print(", ");
        System.out.print(i);
    }
}
}

}

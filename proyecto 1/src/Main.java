import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
        public class Main {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Introduce el número de horas trabajadas: ");
                int horasTrabajadas = scanner.nextInt();

                System.out.print("Introduce el coste por hora: ");
                double costePorHora = scanner.nextDouble();

                double pagaTotal = horasTrabajadas * costePorHora;

                System.out.println("La paga que te corresponde es: $" + pagaTotal);

                scanner.close();
            }

        }

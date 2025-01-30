import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

                String passwordGuardada = "246810";
                Scanner scanner = new Scanner(System.in);

                System.out.print("Introduce tu contraseña: ");
                String passwordUsuario = scanner.nextLine();

                if (passwordGuardada.equalsIgnoreCase(passwordUsuario)) {
                    System.out.println("La contraseña coincide.");
                } else {
                    System.out.println("La contraseña no coincide.");
                }

                scanner.close();
            }
        }




        
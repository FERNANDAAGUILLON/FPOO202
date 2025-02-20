public class Spartan {

    public String nombre;
    int escudo, salud;
    String armaPrincipal;

    public void mostrarinfo() {
        System.out.println("-----------Informacion del Spartan-----------");
        System.out.println("Nombe :" + nombre);
        System.out.println("% de salud :" + salud);
        System.out.println("% de Escudo :" + escudo);
        System.out.println("Arma disponible :" + armaPrincipal);
        System.out.println("-----------------------------------------------");

    }

    public void atacar(String enemigo) {
        System.out.println(nombre + "atac a" + enemigo + "con" + armaPrincipal);
    }

    public void recargarArma(int municiones) {
        int restantes = 10;
        int total = restantes + municiones;
        System.out.println(armaPrincipal + " ahora tiene disponible" + total + "balas");
    }

    public void correr(boolean status) {
        if (status) {
            System.out.println(nombre + "esta corriendo");
            {
                System.out.println(nombre + "se detuvo");




            }
        }




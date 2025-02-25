public class Spartan {

    private String nombre;

    public Spartan(String nombre, int escudo, int salud, String armaPrincipal) {
        this.nombre = nombre;
        this.escudo = escudo;
        this.salud = salud;
        this.armaPrincipal = armaPrincipal;
    }
    private void consultacortana () {
        System.out.println("conversacion privada.......");
    }
    private int escudo, salud;
    private String armaPrincipal;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }



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
        }
    }


// zona de gets y sets

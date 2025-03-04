public class SpartanIV extends Spartan {

    public SpartanIV(String nombre, int salud, String arma, int escudo) {
        super(nombre,salud,arma, 150);
    }
    public void usarPropulsores(){
        System.out.println(nombre+"usa propulsores para moverse rapidamente");
    }
}
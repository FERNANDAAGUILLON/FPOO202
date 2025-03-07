import java.awt.font.MultipleMaster;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

SpartanII jefemaestro= new SpartanII( "jonh", 90, "rifle de asalto",0 );
   jefemaestro.mostrarInfo();
   jefemaestro.usarManejoAvanzado();
   jefemaestro.atacar("convenant");
   jefemaestro.recibirDano(50);
   jefemaestro.recargarEscudo();

   SpartanIII Minimaestro = new SpartanIII( "lucas", 90, "metralleta",0 );
        Minimaestro.mostrarInfo();
        Minimaestro.atacar("convenant");
        Minimaestro.recibirDano(50);
        Minimaestro.recargarEscudo();
        Minimaestro.camuflajeActivo();

        SpartanIV Ministro = new SpartanIV ( "nico", 90, "cuchillo",0 );
        Ministro.mostrarInfo();
        Ministro.atacar("convenant");
        Ministro.recibirDano(50);
        Ministro.recargarEscudo();
        Ministro.usarPropulsores();


    }
    }


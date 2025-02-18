import java.util.concurrent.Callable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// creamos el primer objeto
Spartan masterChief= new Spartan();

// usar atributos
        masterChief.nombre= "john"  ;
        masterChief.salud=100;
        masterChief.escudo=70;
        masterChief.armaPrincipal="Rifle de asalto";

// invocamos los metodos
        masterChief.mostrarinfo();
        masterChief.atacar("Grunt");
        masterChief.recargarArma(75);
        masterChief.correr(true);



            // creamos el primer objeto
            Spartan Chef = new Spartan();

            // usar atributos
            Chef.nombre= " pedro"  ;
            Chef.salud=100;
            Chef.escudo=70;
           Chef.armaPrincipal="Espatula";

// invocamos los metodos
            Chef.mostrarinfo();
            Chef.atacar("michel");
            Chef.recargarArma(75);
            Chef.correr(true);

        }
    }



    
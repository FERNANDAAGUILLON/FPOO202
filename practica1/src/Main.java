import java.util.concurrent.Callable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// creamos el primer objeto
Spartan masterChief= new Spartan("john",100,70,"Rifle de asalto");



// invocamos los metodos
        masterChief.mostrarinfo();
        masterChief.atacar("Grunt");
        masterChief.recargarArma(75);
        masterChief.correr(true);

// intento del uso de un metodo privado 
       // masterChief.consultacortana();

        masterChief.setNombre("Maria Fernanda");
        masterChief.mostrarinfo();
        System.out.println(masterChief.getNombre());



            // creamos el primer objeto
            Spartan Chef = new Spartan(" pedro" ,100,70,"Espatula");


// invocamos los metodos
            Chef.mostrarinfo();
            Chef.atacar("michel");
            Chef.recargarArma(75);
            Chef.correr(true);

        }
    }




//zona de importacion


 // Clase principal

import java.util.Scanner;


public class Main {
    // Metodo principal
    public static void main(String[] args) {

        System.out.println("Hello, fernanda!");

        // cadenas
        String cadena = "fernanda" + "beltran" + "aguillon" ;
        System.out.println(cadena);

// Extraccion de caracteres en base a parametros
        System.out.println(cadena.length());
        System.out.println(cadena.substring(2,5));
        System.out.println(cadena.substring(2));
        System.out.println(cadena.substring(0,5));

//3.variables

        String cadenas= "333",cadenas2,cadenas3;
        int entero=3,entero2, entero3;
        double decimal= 3.3, decimal2, decimal3;

        //convertir cadena a int
        entero2=Integer.parseInt(cadenas);
        System.out.println(entero2);

        //convertir double a int
        entero3=(int) decimal;
        System.out.println(entero3);

        // convertir double a cadena

        cadenas2=String.valueOf(decimal);
        System.out.println(cadenas2);

        // convertir int a double

        decimal2=Double.valueOf(entero);
        System.out.println(decimal2);

        // convercion implicita
        int i = 12;
        double numd=i;
        System.out.println(numd);

        //4. solicitud de datos

        Scanner scn= new Scanner(System.in);

        System.out.println("Escribe una cadenna ");
        String cadenna = scn.nextLine();

        System.out.println("Escribe una enteroo ");
        int enteroo = scn.nextInt();

        System.out.println("Escribe una decimall ");
        double decimall = scn.nextDouble();

        System.out.println("numero guardado: "+enteroo);
        System.out.println("numero guardado: "+cadenna);
        System.out.println("numero guardado: "+decimall);

        System.out.println(10 > 9);
        System.out.println(10 == 9);
        System.out.println(10 > 9);
        System.out.println(10 > 9);


        // operadores logicos
        System.out.println(x <5 );











    }
}
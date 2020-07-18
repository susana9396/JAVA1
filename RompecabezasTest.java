import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RompecabezasTest{
    public static void main(String[] args){
        Rompecabezas res = new Rompecabezas();
        ArrayList <Integer> myList = new ArrayList <Integer>();
        System.out.printf("\n");
        System.out.println("----------Ejercicio 1----------");
        myList.add(3);
        myList.add(5);
        myList.add(1);
        myList.add(2);
        myList.add(7);
        myList.add(9);
        myList.add(8);
        myList.add(13);
        myList.add(25);
        myList.add(32);
        System.out.println(res.sumarr(myList));    // Ejercicio 1

        ArrayList<String> nombres = new ArrayList<String>();
        System.out.printf("\n");
        System.out.println("----------Ejercicio 2----------");
        nombres.add("Nancy");
        nombres.add("Jinichi");
        nombres.add("Fujibayashi");
        nombres.add("Momochi");
        nombres.add("Ishikawa");
        System.out.println("Nuevo arreglo con nombres de mas de 5 caracteres: " + res.arreglonew(nombres));   // Ejercicio 2
        
        ArrayList<String> abece = new ArrayList<String>();
        System.out.printf("\n");
        System.out.println("----------Ejercicio 3----------");
        abece.add("a");
        abece.add("b");
        abece.add("c");
        abece.add("d");
        abece.add("e");
        abece.add("f");
        abece.add("g");
        abece.add("h");
        abece.add("i");
        abece.add("j");
        res.abecedario(abece);                           // Ejercicio 3

        ArrayList <Integer> random = new ArrayList <Integer>(); 
        System.out.printf("\n");
        System.out.println("----------Ejercicio 4----------");
        System.out.println(res.aleatorio());                  // Ejercicio 4

        ArrayList <Integer> orden = new ArrayList <Integer>(); 
        System.out.printf("\n");
        System.out.println("----------Ejercicio 5----------");
        orden = res.ordenado();
        System.out.println(orden);                                                 // Ejercicio 5
        System.out.println("Valor minimo: " + orden.get(0));                       // Ejercicio 5
        System.out.println("Valor maximo: " + orden.get(orden.size()-1));          // Ejercicio 5
        
        System.out.printf("\n");
        System.out.println("----------Ejercicio 6----------");
        System.out.println("La cadena aleatoria de 5 caracteres es: " + res.cadena(abece));  // Ejercicio 6
        
        System.out.printf("\n");
        System.out.println("----------Ejercicio 7----------");
        System.out.println("La 10 cadenas aleatoria de 5 caracteres son: " + res.diezCadenas(abece));    // Ejercicio 7

    }

}

// Victoria, Jorge Gajardo, Susana, Nicol, Joaquin, Juan Carlos, Marcela
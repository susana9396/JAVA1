//Integrantes Marcela Rodriguez, Nicol del Rio, Jorge Gajardo , Francisco Parra, Susana Lefimil

public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava res = new BasicJava();
        res.imprimir();   // ejercicio 1
        res.impares();   // ejercicio 2
        res.suma();     //  ejercicio 3

        int[] Array = {1, 3, 5, 7, 9, 13}; // ejercicio 4
        res.arreglo1(Array);               // ejercicio 4

        int[] Array1 = {-15, -3, -5, 8, 1, 4};   // ejercicio 5
        res.maximo(Array1);                      // ejercicio 5

        int[] Array2 = {2, 10, 3};       // ejercicio 6
        res.promedio(Array2);            // ejercicio 6

        res.arregloimpares();     //  ejercicio 7

        int[] Array3 = {1, 3, 5, 7, 10, 15, -2 };       // ejercicio 8
        int Y = 3;                                      // ejercicio 8
        res.mayorqueY(Array3, Y);                       // ejercicio 8

        int[] Array4 = {1, 5, 10, -2};      // ejercicio 9
        res.alcuadrado(Array4);             // ejercicio 9

        int[] Array5 = {1, 5, 10, -2};      // ejercicio 10
        res.sinnegativos(Array5);             // ejercicio 10

        int[] Array6 = {1, 5, 10, -2};      // ejercicio 11
        res.maxminprom(Array6);             // ejercicio 11

        int[] Array7 = {1, 5, 10, -2};      // ejercicio 12
        res.cambio(Array7);             // ejercicio 12

    }

}
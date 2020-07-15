import java.util.ArrayList;

public class BasicJava {
    // imprimir del 1 al 255
    public void imprimir (){
        for(int i = 1; i < 256; i++){
            System.out.printf("%d, ", i);  // ejercicio 1
        }
    }  

    // imprimir los impares
    public void impares (){
        System.out.printf("\n \n");
        for(int i = 1; i < 256; i++){
            if(i % 2 != 0 )
            System.out.printf("%d, ", i);  // ejercicio 2
        }
    } 

    // Sumar
    public void suma (){
        int sum = 0;
        System.out.printf("\n \n");
        for(int i = 0; i < 256; i++){
            sum += i;
            System.out.printf("Nuevo numero: %d Suma: %d \n ", i, sum);  // ejercicio 3
        }
    } 

    // recorre un arreglo
    public void arreglo1 (int [] myArray){
        System.out.printf("\n");
        for(int i = 0; i < myArray.length; i++){
            System.out.printf("Arreglo: %d\n", myArray[i]);  // ejercicio 4
        }
    } 

    // encontrar el maximo
    public void maximo (int [] myArray){
        System.out.printf("\n");
        int max = myArray[0];
        for(int i = 1; i < myArray.length; i++){
            if(max < myArray[i]){
                max = myArray[i];
            }
        }

        System.out.printf("Maximo: %d\n", max);  // ejercicio 5
    } 

    // encontrar el promedio
    public void promedio (int [] myArray){
        System.out.printf("\n");
        int prom = myArray[0];
        for(int i = 1; i < myArray.length; i++){
            prom = prom + myArray[i];
        }

        prom = prom / myArray.length;
        System.out.printf("Promedio: %d\n", prom);  // ejercicio 6
       
    } 

    // Nuevo arreglo solo impares
    public void arregloimpares (){
        System.out.printf("\n");
        ArrayList<Integer> arrimpar = new ArrayList<Integer>();
        for(int i = 1; i < 256; i++){
            if(i % 2 != 0 ){
                arrimpar.add(i);
            }    
        }

        System.out.println(arrimpar);  // ejercicio 7
    } 

    // mayor que Y
    public void mayorqueY (int [] arr, int Y){
        System.out.printf("\n");
        int mayor = 0;
        for(int i = 0; i < arr.length; i++){
            if( arr[i] > Y ){
                mayor ++;
            }    
        }

        System.out.println(mayor);  // ejercicio 8
    } 

    // al cuadrado
    public void alcuadrado (int [] arr){
        System.out.printf("\n");
        ArrayList<Integer> cuadrado = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            cuadrado.add(arr[i] * arr[i]); 
        }

        System.out.println(cuadrado);  // ejercicio 9
    } 

    // sacando numeros negativos
    public void sinnegativos (int [] arr){
        System.out.printf("\n");
        ArrayList<Integer> positivos = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                positivos.add(0);

            }

                else {
                    positivos.add(arr[i]);
                }

              
        }

        System.out.println(positivos);  // ejercicio 10
    } 

    // encontrar maximo, minimo y promedio
    public void maxminprom (int [] myArray){
        System.out.printf("\n");
        ArrayList<Float> nuevoarr = new ArrayList<Float>();
        float prom = myArray[0];
        float min = myArray[0];
        float max = myArray[0];
        for(int i = 1; i < myArray.length; i++){
            prom = prom + myArray[i];

            if(max < myArray[i]){
                max = myArray[i];
            }
            else {
                min = myArray[i];
            }
        }
        prom = prom / myArray.length;

        nuevoarr.add(max);
        nuevoarr.add(min);
        nuevoarr.add(prom);

        System.out.println(nuevoarr);  // ejercicio 11
       
    } 

    // cambiando los valores del arreglo
    public void cambio (int [] arr){
        System.out.printf("\n");
        ArrayList<Integer> unoadelante = new ArrayList<Integer>();
        int x = 1;
        for(int i = 0; i < arr.length; i++){
            if (i<arr.length -1){
                unoadelante.add(arr[x]);
                x ++;
            
            }
            else if(i == arr.length -1){
                unoadelante.add(0);
            }

        }

        System.out.println(unoadelante);  // ejercicio 12
    } 

}
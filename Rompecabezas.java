import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Rompecabezas {

    // Sumar y nuevo arreglo
    public ArrayList<Integer> sumarr (ArrayList<Integer> arr){
        int sum = 0;
        ArrayList<Integer> arrnew = new ArrayList<Integer>();
        for(Integer element : arr ){
            sum += element;
            if(element > 10){
                arrnew.add(element);
            }
        }
        System.out.printf("Suma: %d \n ", sum);
        return arrnew;                          // ejercicio 1                                 
    } 

    // crear nuevo arreglo
    public ArrayList<String> arreglonew (ArrayList<String> arr){
        ArrayList<String> arrnew1 = new ArrayList<String>();
        Collections.shuffle(arr);
        System.out.println("Arreglo mezclado: " + arr);
        for(String element : arr ){
            if(element.length() > 5){
                arrnew1.add(element);
            }
        }
        return arrnew1;                          // ejercicio 2
    }

    // alfabeto
    public void abecedario (ArrayList<String> arr){
        Collections.shuffle(arr);
        System.out.println("Primera letra del arreglo: " + arr.get(0));
        System.out.println("Ultima letra del arreglo: " + arr.get(arr.size()-1));
        if("aeiou".indexOf(arr.get(0)) >= 0){
            System.out.println("Primera letra es una vocal: " + arr.get(0));   // ejercicio 3
        }
    }

    // array aleatorio
    public ArrayList<Integer> aleatorio(){  
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (arrayList.size() < 10) { 
            int number = random.nextInt(45) + 55; 
            if (!arrayList.contains(number)) {
                arrayList.add(number);
            }
        }
        return arrayList;          // ejercicio 4
    }

    // array aleatorio ordenado
    public ArrayList<Integer> ordenado(){
        ArrayList<Integer> arrayList = this.aleatorio();
        Collections.sort(arrayList);
        return arrayList;      // ejercicio 5
    }

    // cadena aleatoria
    public String cadena(ArrayList<String> entrada){
        int pos;
        String cadena = "";
        Random random = new Random();
        for(int i = 0; i < 5; i++ ){
            pos = random.nextInt(entrada.size());
            cadena = cadena + entrada.get(pos);
        }
        return cadena;
    }

    // 10 cadena aleatoria
    public ArrayList<String> diezCadenas(ArrayList<String> entrada){
        ArrayList<String> diezCadenas = new ArrayList<String>();
        for(int i = 0; i < 10; i++){
            diezCadenas.add(this.cadena(entrada));
        }
        return diezCadenas;   
    }
}

// Victoria, Jorge Gajardo, Susana, Nicol, Joaquin, Juan Carlos, Marcela
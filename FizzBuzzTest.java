import java.util.Scanner;
public class FizzBuzzTest {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        FizzBuzz fb = new FizzBuzz();
        int numero =0;
        while (numero>=0){
          System.out.printf("ingresa Numero:");
          numero=reader.nextInt();
          String res = fb.fizzBuzz(numero);
          System.out.println(res);
        }
    }
}
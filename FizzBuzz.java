public class FizzBuzz {
        public  String fizzBuzz(int number) {
            String result= String.valueOf(number);
            if(number%3==0 && number%5==0) {
                result="FizzBuzz";
              } else if(number%3== 0) {
               result="Fizz";
              } else if (number%5== 0){
                result="Buzz";
               }  
               return result;
              }
            
            
}

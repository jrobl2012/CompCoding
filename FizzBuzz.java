public class FizzBuzz{


     public static void main(String []args){
    
    
         for (int i = 1; i <=100; i++){
        
            int i3 = i%3;
            int i5 = i%5;
        
    if (i3 == 0 && i5 == 0){System.out.println(i + " FizzBuzz");}
             else if(i3 == 0){System.out.println(i + " Fizz");}
             else if(i5 == 0){System.out.println(i + " Buzz");}
             else{System.out.println(i);}
             
            }
         
         
        }
        
        
    }
import java.lang.Math;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    // int a = 3;
    // int b = 5;
    
        Scanner input = new Scanner(System.in);
    	
        System.out.print("podaj liczbe a: ");
        int a = input.nextInt();
        System.out.println("podales liczbe " + a);

    System.out.print("podaj liczbe b: ");
        int b = input.nextInt();
        System.out.println("podales liczbe b " + b);
    
       
   double pierwiastek_a =(Math.sqrt(a));
    System.out.println("pierwiastek podanej liczby a "+ pierwiastek_a);
    double pierwiastek_b =(Math.sqrt(b));
    System.out.println("pierwiastek podanej liczby b "+ pierwiastek_b);
    double suma = pierwiastek_a + pierwiastek_b;
    System.out.println("suma podanych pierwiastków " + suma);
     // closing the scanner object
         input.close();
    
    
  }
}
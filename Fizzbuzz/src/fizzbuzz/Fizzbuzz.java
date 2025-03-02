/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fizzbuzz;

/**
 *
 * @author Usuario
 */
public class Fizzbuzz {

   public void hacerJuego(){
            for (int i = 1; i <= 100; i++) {
           
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            
            else {
                System.out.println(i);
            }
        }
   }
}

/* 
primeFinder Program
.//vbrasic)(
May 9th, 2015
Version 1.0
*/

import java.util.*;
import java.io.*;

public class primeFinder {

   public static void main(String[] args) {
   
      System.out.println("This program will find primes.");
      int counter=0;
   
      for (int i=2; i<100; i++) { // Number to test.
      
         for (int j=2; j<i; j++) { // Modulus test.
         
            if (i%j==0) {
            
               counter++;
            
            }
         
         }
         
         if (counter==0) {
         
            System.out.println(i + " is a prime number."); // Only outputs number if a prime.
         
         }
         
         counter=0; // Resets counter.
         
      }
   
   }

}

import java.util.Random;
import java.util.*;
import java.util.Hashtable;
import java.util.Set;

public class hw3 {
     
     /* SOURCE :  https://www.techiedelight.com/generate-random-integers-specified-range-java/ */
     public static int rand(int min, int max){
          if (min > max || (max - min + 1 > Integer.MAX_VALUE)){
               throw new IllegalArgumentException("Invalid");
          }
          return  new Random().nextInt(max - min + 1 )+ min;
     }  
     public static void main(String [] args){
          
          /* Create a Hash Table */
          Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();

          int min = 0; //MIN int that can be randomly generated
          int max = 200; // MAX int that can be randomly generated
          
          int maxCount = 1;
       
          //make 200 numberes
          for(int i = 1; i <= 200 ;i++){
               int key = rand(min,max) % 200;
               
               int counter = 0;
               ht.get(key);
                    Set <Integer> keys = ht.keySet();
                    
                    //counter = ht.get(key);
                    //setting up counter to be 0, or increment
                        if (ht.get(key) == null){
                              counter = 0;
                         }
                         else{
                              counter = ht.get(key);
                         }
                         counter++ ;
                         ht.put(key,counter);//replace the counter with an increment of it
              }
          Set <Integer> keys = ht.keySet();
          for (Integer k: keys){
                         //Comparison to find the largest collision
                         if (ht.get(k) > maxCount){
                              maxCount = ht.get(k); //replace the maxCount to be the bigger counter value
                              System.out.print("MAX: " + maxCount + " ");
                         }
          }
          }
                
   }


package kata2;

import java.util.ArrayList;
import java.util.Collections;


public class CollectionSortMostFrequent {
    public static void main(String[] args) {
     int[] elements = { 10, 30, 40, 10, 50, 20, 30, 60, 60, 60, 40, 10, 20, 60, 20, 30, 10, 20, 10, 50, 50, 10, 10, 50, 40 };
     ArrayList<Integer> elementList = new ArrayList<>();
 
     for(int element : elements)
       elementList.add(element);
     
     Collections.sort(elementList);
     
     int number = 0;
     int times = 0;
     int currentNumber = -1;
     int currentTimes = 0;
     for (Integer element : elementList){
       if(currentNumber != element){
         if(currentTimes > times){
           number = currentNumber;
           times = currentTimes;
         }
         currentNumber = element;
         currentTimes = 0;
       }
       currentTimes++;
     }
 
     System.out.println("The most frequent element is " + number + " and it occurs " + times + " times");
   }
 
}

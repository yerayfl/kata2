/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.ArrayList;

public class Kata2 {

  
    public static void main(String[] args) {
      int[] elements = { 10, 30, 40, 10, 50, 20, 30, 60, 60, 60, 40, 10, 20, 60, 20, 30, 10, 20, 10, 50, 50, 10, 10, 50, 40 };
     ArrayList<Integer> frequencyList = new ArrayList<>();
 
     for (int index = 0; index < elements.length; index++){
       Integer frequency;
       try{
         frequency = frequencyList.get(elements[index]);
       }
       catch(IndexOutOfBoundsException e){
         frequency = 0;
       }
       try{
         frequencyList.add(elements[index], frequency + 1);
       }
       catch(IndexOutOfBoundsException e){
         for(int arrayListIndex = frequencyList.size(); arrayListIndex < elements[index]; arrayListIndex++)
           frequencyList.add(arrayListIndex, 0);
         frequencyList.add(elements[index], frequency + 1);
       }
     }
 
     int number = 0;
     int times = 0;
     for (int index = 0; index < frequencyList.size(); index++)
       if (frequencyList.get(index) > times) {
         number = index;
         times = frequencyList.get(index);
       }
 
     System.out.println("The most frequent element is " + number + " and it occurs " + times + " times");
 
    }
}

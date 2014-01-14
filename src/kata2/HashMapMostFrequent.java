package kata2;

import java.util.HashMap;

public class HashMapMostFrequent {

    public static void main(String[] args) {
        int[] elements = {10, 30, 40, 10, 50, 20, 30, 60, 60, 60, 40, 10, 20, 60, 20, 30, 10, 20, 10, 50, 50, 10, 10, 50, 40};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int index = 0; index < elements.length; index++) {
            Integer frequency = frequencyMap.get(elements[index]);
            if (frequency == null) {
                frequencyMap.put(elements[index], 1);
            } else {
                frequencyMap.put(elements[index], frequency + 1);
            }
        }

        int number = 0;
        int times = 0;
        for (Integer key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > times) {
                number = key;
                times = frequencyMap.get(key);
            }
        }

        System.out.println("The most frequent element is " + number + " and it occurs " + times + " times");
    }
}

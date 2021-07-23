package hashmaps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class MaximumFrequencyNumber {
    public static Integer maxFrequencyNumber(int[] arr){
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(frequency.containsKey(arr[i])){
                int x = frequency.get(arr[i])+1;
                frequency.put(arr[i],x);
            }
            else {
                frequency.put(arr[i],1);
            }
        }
        int maxindex;
        int maximum=arr[0];
        for(int i=0;i<arr.length;i++){
            int freq=frequency.get(arr[i]);
            if(freq>frequency.get(maximum)){
                maxindex=i;
                maximum=arr[i];
            }
        }
        return maximum;
    }
}


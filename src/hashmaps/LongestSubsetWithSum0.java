package hashmaps;

import java.util.HashMap;

public class LongestSubsetWithSum0 {
    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
        int index =0;
        int sum =0;
        int maxcount=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< arr.length;i++) {
            sum += arr[i];
            if(sum==0){
                if(maxcount<i+1){
                    maxcount= i+1;
                }
            }
            else if(map.containsKey(sum)){
                int x = i - map.get(sum);
                if(x>maxcount){
                    maxcount=x;
                }
            }
            else if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxcount;
    }

    public static void main(String [] args){
        int [] arr ={ 95,-97,-387,-435,-5,-70,897,127,23,284};
        int [] arr2={4,4,4,4};
        System.out.println(lengthOfLongestSubsetWithZeroSum(arr));
    }
}

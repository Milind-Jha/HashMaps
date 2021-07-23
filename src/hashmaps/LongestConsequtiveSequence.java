package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsequtiveSequence {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        int maxlength=0;
        int start=0;
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],true);
        }
        for(int i=0;i<map.size();i++){
            if(!map.get(arr[i])){
                continue;
            }
            else{
                int x = arr[i];
                int count =0;
                map.put(arr[i],false);
                while (map.containsKey(x+1)){
                    count++;
                    x++;
                    map.put(x,false);
                }
                x= arr[i];
                while (map.containsKey(x-1)){
                    count++;
                    x--;
                    map.put(x,false);
                }
                if(count>maxlength){
                    start=x;
                    maxlength= count;
                }
                else if(count==maxlength){
                    if(findIndex(arr,start)>findIndex(arr,x)){
                        start=x;
                    }
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(start);
        ans.add(start+maxlength);
        return ans;
    }

    private static int findIndex(int[] arr, int x) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}

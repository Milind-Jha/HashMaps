package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args){
        int [] arr = {2,3,2,1,4,3,4,2,7,8,9};
        ArrayList<Integer> output = removeDuplicates(arr);
        for ( int x:output) {
            System.out.print(x+" ");
        }
    }

    private static ArrayList<Integer> removeDuplicates(int[] arr) {
            ArrayList<Integer> ans =new ArrayList<>();
            HashMap<Integer,Boolean> map = new HashMap<>();
            for(int i=0;i< arr.length; i++){
                if(map.containsKey(arr[i])){
                    continue;
                }
                else{
                    map.put(arr[i],true);
                    ans.add(arr[i]);
                }
            }
            return ans;
    }
}

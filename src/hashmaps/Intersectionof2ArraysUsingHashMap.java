package hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class Intersectionof2ArraysUsingHashMap {
    public static void printIntersection(int[] arr1,int[] arr2) {
        HashMap<Integer, Integer> a1 = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if(a1.containsKey(arr1[i])){
                int x = a1.get(arr1[i])+1;
                a1.put(arr1[i],x);
            }
            else{
                a1.put(arr1[i],1);
            }
        }
        for(int i=0;i< arr2.length;i++){
            if(a1.containsKey(arr2[i])&&a1.get(arr2[i])>0){ // number exists && (no of times it exists initially) > 0
                System.out.println(arr2[i]);
                int x = a1.get(arr2[i])-1; //after printing the value is decreased by one
                a1.put(arr2[i],x);
            }
        }
    }
    public static void main(String [] args){
        int[] arr1 = {1,4,5,2,2,3,6,5,3,2};
        int[] arr2 = {2,3,2,6,6,5,1};
        printIntersection(arr1,arr2);
    }
}

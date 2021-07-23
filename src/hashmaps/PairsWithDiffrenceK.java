package hashmaps;

import java.util.HashMap;

public class PairsWithDiffrenceK {
    public static int getPairsWithDifferenceK(int[] input, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int fcount=0;
        for(int i=0;i<input.length;i++) {


            if(map.containsKey(input[i] - k)&&k!=0) {

                for(int count = 0 ; count < map.get(input[i] - k);count++ ) {

                    fcount++;
                }

            }
            if(map.containsKey(input[i] + k)) {

                for(int count = 0 ; count < map.get(input[i] + k);count++ ) {



                    fcount++;
                }

            }
            if(map.containsKey(input[i])) {
                map.put(input[i], map.get(input[i]) + 1 );
            }
            else {
                map.put(input[i],1);
            }

        }
        return fcount;
    }

    public static void main(String[] args){
        int [] arr={4,4,4,4};
        System.out.println(getPairsWithDifferenceK(arr,0));
    }
}

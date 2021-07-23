package hashmaps;

import java.util.HashMap;

public class PairSumtoZeroUsingHashmap {
        public static int PairSum(int[] input, int size) {

            HashMap<Integer, Integer> map = new HashMap<>();
            int count = 0;
            for (int i = 0; i < input.length; i++) {

                if (map.containsKey(-input[i])) {   //negative number exists
                    for (int j = 0; j < map.get(-input[i]); j++) {
                        count++;
                    }
                }

                if (map.containsKey(input[i])) {      //number coming in the iteration for the first time
                    map.put(input[i], map.get(input[i]) + 1);
                }

                else {
                    map.put(input[i], 1);
                }

            }
            return count;
        }
}

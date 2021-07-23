package hashmaps;

import java.util.HashMap;

public class ExtractUniqueCharacters {
    public static String uniqueChar(String str){
        HashMap<Character,Integer> alphabets = new HashMap<>();
        String output="";
        for(int i=0;i<str.length();i++){
            if(alphabets.get(str.charAt(i))==null){
                alphabets.put(str.charAt(i),1);
                output=output+str.charAt(i);
            }
            else {
                continue;
            }
        }
       return output;
    }
    public static void main(String[] args){
        String str = "abcde";
        System.out.println(uniqueChar(str));
    }
}

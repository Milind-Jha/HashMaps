import java.util.ArrayList;
import java.util.Scanner;

class Answer{
    ArrayList<Integer> maxindex = new ArrayList<>();
    char maxchar;
}
public class Maxoccouringcharacterbetter {
    public static void main(String[] args){
        String word;
        Scanner scanner = new Scanner(System.in);
        word=scanner.next();
        Answer answer = maxfrequency(word);
        System.out.print(answer.maxchar+" at pos : ");
        for ( int x: answer.maxindex) {
            System.out.print(x+" ");
        }
    }
    public static Answer maxfrequency (String word){
        int[] Ascii = new int[256];
        for(int i=0;i<word.length();i++){
            int value = word.charAt(i);
            Ascii[value]++;
        }
        int max = Ascii[0];
        int index=0;
        for(int i=0;i< Ascii.length;i++){
            if(Ascii[i]>max){
                max = Ascii[i];
                index = i;
            }
        }
        Answer ans = new Answer();
        ans.maxchar = (char) index;
        for(int j=0;j<word.length();j++){
            if(ans.maxchar==word.charAt(j)){
                ans.maxindex.add(j);
            }
        }
        return ans;
    }
}

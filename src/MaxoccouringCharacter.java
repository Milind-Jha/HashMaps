import java.util.Scanner;

public class MaxoccouringCharacter {
    public static char maxoccourance(String a){
        int maxfrequency;
        int maxindex=0;
        char maxcharecter=' ';
        int [] frequency = new int[a.length()];
        for ( int x: frequency) {
            x++;
        }
        for (int i=0;i<a.length()-1;i++) {
            for (int j = i+1; j<a.length();j++){
                if(i==j){
                    continue;
                }
                if(a.charAt(i)==a.charAt(j)){
                    frequency[i]++;
                }
            }
        }
        maxfrequency = frequency[0];
        for(int i=0;i<a.length();i++){
            if(frequency[i]>maxfrequency){
                maxfrequency = frequency[i];
                maxindex = i;
            }
        }
        maxcharecter = a.charAt(maxindex);
        return maxcharecter;
    }


    public static void main(String[] args){
        String a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextLine();
        char max = maxoccourance(a);
        System.out.println(max);
    }
}

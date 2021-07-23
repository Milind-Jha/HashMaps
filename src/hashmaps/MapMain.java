package hashmaps;

public class MapMain {
    public static void main(String[] args){
        Map<String,Integer> myHashMap = new Map<>();

        for(int i=0;i<20;i++){
            myHashMap.insert("abc"+i,2+i);
            System.out.println("Key : "+"abc"+i+" , value : "+myHashMap.getValue("abc"+i) +" Load factor : "+myHashMap.loadFactor);
        }
        System.out.println(myHashMap.getSize());
        myHashMap.getValue("abc5");
        myHashMap.Delete("abc3");
        System.out.println(myHashMap.getSize());
        for(int i=0;i<20;i++){
            System.out.println("abc"+i+" : "+ myHashMap.getValue("abc"+i));
        }
    }
}

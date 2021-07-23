package hashmaps;

public class HashMapfromBST<A,B> {
    private A key;
    private B value;
    HashMapfromBST<A,B> left;
    HashMapfromBST<A,B> right;

    public HashMapfromBST(A key,B value){
        this.key = key;
        this.value = value;

    }
    public HashMapfromBST(){

    }
    public void insert(A key, B value) {
        if (key == null) {
            this.key = key;
            this.value = value;
//        }
//        if(this.value <= value){
//
//        }
        }
    }
    public void delete(A key){
        if(this.key==key){
            this.value = null;
        }
    }
    public boolean searchfromvalue (B value){
        if(this.value==value){
            return true;
        }
//        if(this.value <=value){
//            return true;
//        }
        return  false;
    }
    public boolean searchfromkey (A key){

        return false;
    }

    //TreeMap<Integer,String> treeMap = new TreeMap<>();
}

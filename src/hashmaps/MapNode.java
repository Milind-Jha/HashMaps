package hashmaps;

public class MapNode <A,B>{
    A key;
    B value;
    MapNode<A,B> next;
    public MapNode(A key,B value){
        this.key=key;
        this.value=value;
    }

}

package hashmaps;

import java.util.ArrayList;

public class Map<A,B> {
    ArrayList<MapNode<A,B>>storage;
    int size;
    int storageCapacity;
    double loadFactor;

    public Map(){
        storage = new ArrayList<>();
        storageCapacity = 20;
        for(int i=0;i<storageCapacity;i++){
            storage.add(null);
        }
    }
    private int getStorageindex(A key){
        int hashcode;
        hashcode=key.hashCode();
        int finalindex = hashcode%storageCapacity;
        return finalindex;
    }
    public void insert(A key, B value){
            int finalindex = getStorageindex(key);
            MapNode<A,B> head = storage.get(finalindex);
            while (head!=null){
                if(head.key.equals(key)){ //key already present
                    head.value = value;   // change the value to the new value
                    return;
                }
                head=head.next;
            }
            head= storage.get(finalindex);
            MapNode<A,B> newNode = new MapNode<>(key, value);
            newNode.next=head;
            storage.set(finalindex,newNode);
            size++;
            loadFactor = (1.0*size)/storageCapacity;//We multiply loadfactor with 1.0 to devide a double from int i.e. a double
            if(loadFactor>0.7){
                rehash();
            }
    }

    private void rehash() {
        ArrayList<MapNode<A,B>> temp= storage;
        storage= new ArrayList<>();
        for(int i=0;i<2*storageCapacity;i++){
            storage.add(null);
        }
        size=0;
        storageCapacity*=2;
        for(int i=0;i<temp.size();i++){
            MapNode<A,B> head = temp.get(i);
            while (head != null){
                A key = head.key;
                B value = head.value;
                insert(key,value);
                head=head.next;
                size++;
            }
        }

    }

    public boolean Search(A key){
        int finalindex = getStorageindex(key);
        MapNode<A,B> search = storage.get(finalindex);
        while (search!=null){
            if(search.key.equals(key)){ //key already present
                System.out.println("Value is : "+search.value);
                return true;
            }
            search=search.next;
        }
        return false;
    }
    public B Delete(A key){
        int index = getStorageindex(key);
        MapNode<A,B> searchElement = storage.get(index);
        MapNode<A,B> previousElement = null;
        while (searchElement!=null){
            if(searchElement.key.equals(key)){
                if(previousElement!=null){
                    previousElement.next=searchElement.next;
                }
                else{
                    storage.set(index, searchElement.next);
                }
                size--;
                return searchElement.value;
            }
            previousElement=searchElement;
            searchElement=searchElement.next;
        }
        return null;
    }
    public B getValue(A key){
        int finalindex = getStorageindex(key);
        MapNode<A,B> search = storage.get(finalindex);
        while (search!=null){
            if(search.key.equals(key)){ //key already present
                return search.value;
            }
            search=search.next;
        }
        System.out.println("Key not found.");
        return null;
    }
    public int getSize(){
        return size;
    }
}

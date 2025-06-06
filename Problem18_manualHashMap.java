package p18;
import java.util.HashMap;
import java.util.Map;

class MyHashMap {
    
    Map<Integer,Integer> map = new HashMap<>();
    public MyHashMap(){
        System.out.println(map);
    } 
    
    public void put(int key, int value) {
        this.map.put(key,value);
        System.out.println(map);
    }
    
    public int get(int key) {
        if(this.map.containsKey(key)){
            System.out.println(map);
            return this.map.get(key);
        }
        else{
            System.out.println(map);
            return -1;
        }
    }
    
    public void remove(int key) {
        this.map.remove(key);
        System.out.println(map);
    }
}

public class Problem18_manualHashMap{
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1,1);
        myHashMap.put(2,2);
        myHashMap.get(1);
        myHashMap.get(3);
        myHashMap.put(2,1);
        myHashMap.get(2);
        myHashMap.remove(2);
        myHashMap.get(2);
        
    }
}
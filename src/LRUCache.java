import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    private final int capasity;
    private final Map<String, Integer> cache;

   //constructor
    public LRUCache(int capasity){
        this.capasity = capasity;
        this.cache = new LinkedHashMap<>(capasity, 0.75f, true);
    }

    public void put(String key, int value){
        cache.put(key,value);
    }

    public int get(String key){
        return cache.getOrDefault(key, -1);
    }

    public void remove(String key){
        cache.remove(key);
    }
    public void clear(){
        cache.clear();
    }

    public int size(){
       return cache.size();
    }

    public boolean containsKey(String key){
        return cache.containsKey(key);
    }

    public void printCache(){
        System.out.println(cache);

    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.put("A", 1);
        cache.put("B", 2);
        cache.put("C", 3);
        cache.printCache(); // {A=1, B=2, C=3}

        cache.get("A"); // Access A → becomes most recently used
        cache.put("D", 4); // Evicts least recently used (B)
        cache.printCache(); // {C=3, A=1, D=4}
    }
}
//1. Cache key is string
//2. Cache value is integer
//3. Implement functions of cache
//a. void put(string key, int value)
//b. int get(string key)
//c. void remove(string key)
//d. optional: i. void clear()
             //ii. int size()
            //iii. boolean containsKey(string key)
//4. implement FIFO(first-in first-out) or LRU(least recently used) or LFU(least frequently used)
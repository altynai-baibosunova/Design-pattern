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
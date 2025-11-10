public class CacheSingleton {
    private static CacheSingleton instance;
    private LRUCache cache;

    private CacheSingleton(int capacity){
        cache= new LRUCache(capacity);
    }
    public static CacheSingleton getInstance(int capacity){
        if(instance == null){
            instance = new CacheSingleton(capacity);
        }
        return instance;
    }
    public LRUCache getCache(){
        return cache;
    }
}

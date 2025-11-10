public class CacheFactory {
    public static LRUCache createLRUCache(int capacity){
        return new LRUCacheBuilder().capacity(capacity).build();
    }
}
// Placeholder for other cache types
// public static LFUCache createLFUCache(int capacity)
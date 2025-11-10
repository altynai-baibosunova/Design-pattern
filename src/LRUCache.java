import java.util.LinkedHashMap;
import java.util.Map;

    public class LRUCache {

        private final int capacity;
        private final Map<String, Integer> cache;

        // Private constructor: Builder will use this
        LRUCache(int capacity) {
            this.capacity = capacity;
            this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                    return size() > LRUCache.this.capacity;
                }
            };
        }

    // Add or update a key-value pair
    public void put(String key, int value) {
        cache.put(key, value);
    }

    // Get the value for a key, or -1 if not present
    public int get(String key) {
        return cache.getOrDefault(key, -1);
    }

    // Remove a specific key
    public void remove(String key) {
        cache.remove(key);
    }

    // Clear the cache
    public void clear() {
        cache.clear();
    }

    // Get current cache size
    public int size() {
        return cache.size();
    }

    // Check if key exists
    public boolean containsKey(String key) {
        return cache.containsKey(key);
    }

    // Print the cache content
    public void printCache() {
        System.out.println(cache);
    }

    // Simple main to test
    public static void main(String[] args) {
        LRUCache lru = new LRUCache(3);
        lru.put("A", 1);
        lru.put("B", 2);
        lru.put("C", 3);
        lru.printCache(); // {A=1, B=2, C=3}

        lru.get("A");     // Access A, now order: B, C, A
        lru.put("D", 4);  // Evicts B (least recently used)
        lru.printCache(); // {C=3, A=1, D=4}
    }
}

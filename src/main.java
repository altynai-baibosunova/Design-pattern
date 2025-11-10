public class main {
    public static void main(String[] args) {
        CacheSingleton singleton = CacheSingleton.getInstance(3);
        LRUCache cache = singleton.getCache();
        cache.put("A", 1);
        cache.put("B", 2);
        cache.put("C", 3);
        cache.printCache(); // {A=1, B=2, C=3}

        cache.get("A"); // Access A → becomes most recently used
        cache.put("D", 4); // Evicts least recently used (B)
        cache.printCache(); // {C=3, A=1, D=4}

        // Access the singleton again elsewhere
        CacheSingleton sameSingleton = CacheSingleton.getInstance(3);
        LRUCache sameCache = sameSingleton.getCache();
        sameCache.put("E", 5);
        sameCache.printCache(); // {A=1, D=4, E=5}
    }
}

public class main {
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

public class main {
        public static void main(String[] args) {
            LRUCache cache = CacheFactory.createLRUCache(5);
            cache.put("A", 1);
            cache.put("B", 2);

            System.out.println(cache.get("A")); // Output: 1
        }
}

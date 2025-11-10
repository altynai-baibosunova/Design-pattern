

public class LRUCacheBuilder {
    private int capacity;

    public LRUCacheBuilder capacity(int capacity){
        this.capacity = capacity;
        return this;
    }
    public LRUCache build(){
        return new LRUCache(capacity);
    }
}

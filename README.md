My LRU Cache Implementation
I created a cache memory using a class called LRUCache to store key-value pairs, where the key is a String and the value is an int. 
I set a fixed capacity to limit how many items the cache can hold and control memory usage. 
The actual data is stored in a LinkedHashMap, which keeps track of the order in which items are accessed.
I implemented the following functions:
put(key, value) to add or update data and remove the least recently used item if the cache is full
get(key) to retrieve values and mark them as recently used
remove(key) to delete items from the cache
clear() to empty the cache
size() to check the number of items stored
containsKey(key) to verify if a key exists in the cache

Creational Design Patterns Used:
Singleton: Ensures only one cache instance exists.
Prototype: Allows cloning cache elements efficiently.
Builder: Provides flexible configuration (capacity, expiration, etc.).
Factory/Abstract Factory: Creates different types of caches without changing client code.

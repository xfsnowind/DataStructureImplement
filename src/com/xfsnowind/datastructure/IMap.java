package com.xfsnowind.datastructure;

public interface IMap<K, V> {
   /**
    * Get the value with given key.
    * 
    * @param key - the given key.
    * @return The object of value.
    */
   public V get(Object key);
   
   /**
    * Set the value with given key. If it doesn't exist in the map,
    * create one.
    * 
    * @param key - the given key.
    * @param value - The value to be set.
    * @return The value to be set.
    */
   public V set(K key, V value);
   
   /**
    * Remove the value with given key. If the key doesn't exist in the map, 
    * return null.
    * 
    * @param key - the given key.
    * @return The 
    */
   public V remove(Object key);
   
   /**
    * @return
    */
   public int size();
   
   /**
    * If the map contains given key.
    * 
    * @param key - the given key.
    * @return
    */
   public boolean containsKey(Object key);

}

package com.jdevexpert.cache;

import java.util.List;

/**
 * @author sandeepandey
 */
public interface Cache<K,V> {

  V get(K key);

  List<V> mGet(List<K> keys);
    
  boolean put(K key,V value);

  boolean put(K key,V value,long ttl);

  void clear();


}

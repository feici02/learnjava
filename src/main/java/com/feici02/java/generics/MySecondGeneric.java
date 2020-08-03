package com.feici02.java.generics;

public class MySecondGeneric<K, V> {
    private K key;
    private V value;

    public MySecondGeneric(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

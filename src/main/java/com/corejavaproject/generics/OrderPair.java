package com.corejavaproject.generics;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderPair<K, V> implements interfacePair<K, V> {

    private K key;
    private V Value;


    public OrderPair(K key, V value) {
        this.key = key;
        Value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return Value;
    }
}

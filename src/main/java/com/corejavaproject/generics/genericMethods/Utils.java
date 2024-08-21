package com.corejavaproject.generics.genericMethods;

import com.corejavaproject.generics.OrderPair;

public class Utils {

    public static <K, V> boolean compare(OrderPair<K, V> p1, OrderPair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}

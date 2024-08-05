package com.corejavaproject.ArrayListExample;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Log4j2
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.createList(list);
//        ascending order
        Collections.sort(list);
        log.info(list);
//        descending order
        list.sort(Collections.reverseOrder());
        log.info(list);
    }

    public void createList(List<String> stringList) {

        stringList.add("Sunny");
        stringList.add("Amit");
        stringList.add("Regu");
        stringList.add("Rakesh");
        stringList.add("Ajay");

        log.info(stringList);
    }
}

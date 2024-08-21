package com.corejavaproject.generics.wildcard;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.List;

@Log4j2
public class WildCardExample {
    public static void main(String[] args) {
        WildCardExample wildCardExample = new WildCardExample();

        // Wildcard with string data
        /*List<String> stringList = Arrays.asList("Java", "Full Stack", "Course");
        wildCardExample.listOfUsers(stringList);*/

        // Wildcard with integer data
        /*List<Integer> integerList = Arrays.asList(1, 5, 9, 10);
        wildCardExample.listOfUsers(integerList);*/

        // with super keyword
        List<Number> integerList = Arrays.asList(1, 5, 9, 10);
        wildCardExample.listOfUsers(integerList);

    }

    // with any type parameters (Integer, String etc)
    /*public void listOfUsers(List<?> list) {
        for (Object data : list)
            System.out.println(data + " ");
    }*/

    // with only integer type parameters

   /* public void listOfUsers(List<? extends Number> list) {
        for (Object data : list)
            System.out.println(data + " ");
    }*/

    // if we are using super with number List type should be a number

    public void listOfUsers(List<? super Number> list) {
        for (Object data : list)
            System.out.println(data + " ");
    }

}

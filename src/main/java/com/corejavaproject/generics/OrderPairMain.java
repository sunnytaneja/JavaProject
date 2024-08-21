package com.corejavaproject.generics;

import com.corejavaproject.generics.genericMethods.Utils;
import lombok.extern.log4j.Log4j2;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class OrderPairMain {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Generic");
        stringList.add("List");
        stringList.add("Example");

        /**
         * with string key and string parameters
         */
//        OrderPair<String, String> orderPair = new OrderPair<>("name", "Sunny");
        OrderPair<Integer, String> orderPair = new OrderPair<>(2, "Sunny");
        log.info("Order Pais with String key is:{}", orderPair);

        /**
         * with integer key and string parameters
         */

        OrderPair<Integer, String> orderPair1 = new OrderPair<>(1, "Hi Sunny");
        log.info("Order Pais with Integer key is:{}", orderPair1);

        /**
         * with String key and List of String parameters
         */
        OrderPair<String, List<String>> orderPair2 = new OrderPair<>("ListOfUsers", stringList);
        log.info("Generic List Data is:{}", orderPair2);

        /**
         * for Generic method
         */
        Boolean response = Utils.compare(orderPair1, orderPair);
        log.info("Generic Method response is:{}", response);
    }
}

//package com.corejavaproject.queueexample;
//
//import com.corejavaproject.assignment29July.Student;
//import com.corejavaproject.assignment31July.StudentData;
//import lombok.extern.log4j.Log4j2;
//
//import java.util.*;
//
//@Log4j2
//public class QueueCreation {
//
//
//    public static void main(String[] args) {
//
//        // Create a Queue of Integers using LinkedList
//        QueueData queueData = new QueueData();
//        queueData.setName("Sunny");
//        queueData.setEmailId("sunny@gmail.com");
//
//        QueueData queueData1 = new QueueData();
//        queueData1.setName("Amit");
//        queueData1.setEmailId("amit@gmail.com");
//
//        QueueData queueData2 = new QueueData();
//        queueData2.setName("Amit");
//        queueData2.setEmailId("amit@gmail.com");
//
//        log.info(queueData);
//
//        Queue<QueueData> dataQueue = new LinkedList<>();
//        dataQueue.add(queueData);
//        dataQueue.add(queueData1);
//        dataQueue.add(queueData2);
//        iterateUsingIterator(dataQueue);
//
//    }
//
//    public static void iterateUsingIterator(Queue<QueueData> queues) {
//        Iterator<QueueData> iterator = queues.iterator();
//        while (iterator.hasNext()) {
//            QueueData queueData = iterator.next();
//            log.info("Iterator Student Name is: {} and Student Email is: {}", queueData.getName(), queueData.getEmailId());
//        }
//    }
//}

package com.corejavaproject.string;

import java.util.Date;
import java.util.HashMap;

public final class Customer {
    private final Integer customerId;
    private final String customerName;
    private final HashMap<Integer, String> map;
    private final Date date;

    public Customer(Integer customerId, String customerName, HashMap<Integer, String> map, Date date) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.map = new HashMap<>(map);
        this.date = new Date(date.getTime());
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public HashMap<Integer, String> getMap() {
        return (HashMap<Integer, String>) map.clone();
    }

    public Date getDate() {
        return (Date) date.clone();
    }

    public static void main(String[] args) {
    }
}


package com.driver;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {

    private String id;

    private int deliveryTime;

    @Autowired
    private OrderService a;
    public Order(String id, String deliveryTime) {
        String a[]=deliveryTime.split(":");
        int hh=converttoInt(a[0]);
        int min=converttoInt(a[1]);
        this.deliveryTime=hh*60+min;
        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
    }
    private int converttoInt(String s) {
          int val=Integer.parseInt(s);
        return val;
    }

    public String getId() {
        return id;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    public void setDeliveryTime(String deliveryTime) {
        String a[]=deliveryTime.split(":");
        int hh=converttoInt(a[0]);
        int min=converttoInt(a[1]);
        this.deliveryTime=hh*60+min;
    }
    public int getDeliveryTime() {return deliveryTime;}
}

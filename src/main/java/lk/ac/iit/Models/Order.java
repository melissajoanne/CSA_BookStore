/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.ac.iit.Models;

/**
 *
 * @author melzjoanne
 */
import java.util.*;

public class Order {
    private int orderId;
    private int customerId;
    private List<Integer> bookIds;
    private double totalPrice;

    public Order(int orderId, int customerId, List<Integer> bookIds, double totalPrice) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.bookIds = bookIds;
        this.totalPrice = totalPrice;
    }

    public int getOrderId() { return orderId; }
    public int getCustomerId() { return customerId; }
    public List<Integer> getBookIds() { return bookIds; }
    public double getTotalPrice() { return totalPrice; }
}


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

public class Cart {
    private int customerId;
    private List<Integer> bookIds;

    public Cart(int customerId) {
        this.customerId = customerId;
        this.bookIds = new ArrayList<>();
    }

    public int getCustomerId() { return customerId; }
    public List<Integer> getBookIds() { return bookIds; }
}

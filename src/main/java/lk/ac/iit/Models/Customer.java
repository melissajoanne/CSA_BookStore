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

public class Customer {
    private int id;
    private String name;
    private String email;
    private String password;
    private List<Integer> cart = new ArrayList<>();

    public Customer(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public List<Integer> getCart() { return cart; }
}


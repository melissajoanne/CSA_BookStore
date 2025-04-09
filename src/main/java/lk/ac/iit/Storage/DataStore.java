/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.ac.iit.Storage;

/**
 *
 * @author melzjoanne
 */
import lk.ac.iit.Models.*;

import java.util.*;


public class DataStore {
    public static final Map<Integer, Book> books = new HashMap<>();
    public static final Map<Integer, Author> authors = new HashMap<>();
    public static final Map<Integer, Customer> customers = new HashMap<>();
    public static final Map<Integer, Cart> carts = new HashMap<>();
    public static final Map<Integer, List<Order>> orders = new HashMap<>();

    public static int bookIdCounter = 1;
    public static int authorIdCounter = 1;
    public static int customerIdCounter = 1;
    public static int orderIdCounter = 1;
}

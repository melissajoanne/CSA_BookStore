/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.ac.iit.Models;

/**
 *
 * @author melzjoanne
 */
public class Author {
    private int id;
    private String name;
    private String biography;

    public Author(int id, String name, String biography) {
        this.id = id;
        this.name = name;
        this.biography = biography;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getBiography() { return biography; }
}


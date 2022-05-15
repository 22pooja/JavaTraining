package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
    public student()
    {

    }
    @Id
    private int id;

    private String name;
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    public student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}

    
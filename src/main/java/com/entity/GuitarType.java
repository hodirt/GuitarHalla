
package com.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class GuitarType implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "type")
    private List<Guitar> guitarList;
    
    private String guitarType;

    public GuitarType() {
    }
    
    public GuitarType(String guitarType) {
        this.guitarType = guitarType;
    }
    
    public GuitarType(int id, List<Guitar> guitarList, String guitarType) {
        this.id = id;
        this.guitarList = guitarList;
        this.guitarType = guitarType;
    }

    public List<Guitar> getGuitarList() {
        return guitarList;
    }

    public void setGuitarList(List<Guitar> guitarList) {
        this.guitarList = guitarList;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(String guitarType) {
        this.guitarType = guitarType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return guitarType;
    }
    
    
    
    
}

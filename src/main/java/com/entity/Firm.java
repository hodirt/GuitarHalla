/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author home
 */
@Entity
public class Firm implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "firm")
    private List<Guitar> guitarList;
    
    private String firm;

    public Firm() {
    }

    public Firm(String firm) {
        this.firm = firm;
    }
    public Firm(int id, List<Guitar> guitarList, String firm) {
        this.id = id;
        this.guitarList = guitarList;
        this.firm = firm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Guitar> getGuitarList() {
        return guitarList;
    }

    public void setGuitarList(List<Guitar> guitarList) {
        this.guitarList = guitarList;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    @Override
    public String toString() {
        return firm;
    }
    
    
}


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
public class Tree implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "treeOfMainPart")
    private List<Guitar> guitarMainPart;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "treeOfFingerbar")
    private List<Guitar> guitarFingerbar;
    
    private String treeType;

    public Tree() {
    }
    
    public Tree(int id, List<Guitar> guitarMainPart, String treeType, List<Guitar> guitarFingerbar) {
        this.id = id;
        this.guitarMainPart = guitarMainPart;
        this.guitarFingerbar = guitarFingerbar;
        this.treeType = treeType;
    }

    public List<Guitar> getGuitarMainPart() {
        return guitarMainPart;
    }

    public void setGuitars(List<Guitar> guitarMainPart) {
        this.guitarMainPart = guitarMainPart;
    }

    public String getTreeType() {
        return treeType;
    }

    public void setTreeType(String treeType) {
        this.treeType = treeType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Guitar> getGuitarFingerbar() {
        return guitarFingerbar;
    }

    public void setGuitarFingerbar(List<Guitar> guitarFingerbar) {
        this.guitarFingerbar = guitarFingerbar;
    }

    @Override
    public String toString() {
        return "Tree " + treeType;
    }
    
    
    
}

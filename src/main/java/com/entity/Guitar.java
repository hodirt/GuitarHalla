
package com.entity;

import com.service.UniqueField;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Guitar implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int numberOfStrings;
    @ManyToOne
    private Tree treeOfMainPart;
    
    @ManyToOne
    private Tree treeOfFingerbar;
    
    @UniqueField(message = "Guitar with this name already exists")
    private String name;
    
    @ManyToOne
    private Firm firm;
    @ManyToOne
    private GuitarType type;
    private String pickups;
    
    @ManyToOne
    private Color color;
    private double price;
    private int numberOfFrets;
    
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "customer_guitar", joinColumns = @JoinColumn(name = "fk_guitar"), 
    inverseJoinColumns = @JoinColumn(name = "fk_customer"))
    private List<Customer> customers;

    public Guitar() {
    }

    public Guitar(int id, int numberOfStrings, Tree treeOfMainPart, Tree treeOfFingerbar, String name, Firm firm, GuitarType type, String pickups, Color color, double price, int numberOfFrets, List<Customer> customers) {
        this.id = id;
        this.numberOfStrings = numberOfStrings;
        this.treeOfMainPart = treeOfMainPart;
        this.treeOfFingerbar = treeOfFingerbar;
        this.name = name;
        this.firm = firm;
        this.type = type;
        this.pickups = pickups;
        this.color = color;
        this.price = price;
        this.numberOfFrets = numberOfFrets;
        this.customers = customers;
    }
    

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public Tree getTreeOfMainPart() {
        return treeOfMainPart;
    }

    public void setTreeOfMainPart(Tree treeOfMainPart) {
        this.treeOfMainPart = treeOfMainPart;
    }

    public Tree getTreeOfFingerbar() {
        return treeOfFingerbar;
    }

    public void setTreeOfFingerbar(Tree treeOfFingerbar) {
        this.treeOfFingerbar = treeOfFingerbar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuitarType getType() {
        return type;
    }

    public void setType(GuitarType type) {
        this.type = type;
    }

    public String getPickups() {
        return pickups;
    }

    public void setPickups(String pickups) {
        this.pickups = pickups;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        if(this.price < 0){
            this.price = 0;
        }
    }

    public int getNumberOfFrets() {
        return numberOfFrets;
    }

    public void setNumberOfFrets(int numberOfFrets) {
        this.numberOfFrets = numberOfFrets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Firm getFirm() {
        return firm;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
    }
    
    
}

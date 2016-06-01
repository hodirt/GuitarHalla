
package com.entity;

import com.service.UniqueField;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Customer implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Size(min = 1, max = 255)
    @Pattern(regexp = "[A-Za-z]+", message = "field can not be empty")
    @UniqueField(message = "customer with this name already exists")
    private String firstName;
    
    @Size(min = 1, max = 255)
    @Pattern(regexp = "[A-Za-z]+")
    private String lastName;
    
    // прописати @Pattern для пароля
   @Size(min = 1, max = 255)
   private String password;
    
    private Role role;
    private boolean enabled;
    
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "customer_guitar", joinColumns = @JoinColumn(name = "fk_customer"), 
    inverseJoinColumns = @JoinColumn(name = "fk_guitar"))
    private List<Guitar> guitars;
    
    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Guitar> getGuitars() {
        return guitars;
    }

    public void setGuitars(List<Guitar> guitars) {
        this.guitars = guitars;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}

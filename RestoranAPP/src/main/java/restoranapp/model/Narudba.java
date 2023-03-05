/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoranapp.model;

import jakarta.persistence.Entity;

/**
 *
 * @author Kristijan
 */
@Entity
public class Narudba {
    private Gost gost;
    private Stol stol;

    public Narudba() {
        super();
    }

    public Narudba(Gost gost, Stol stol) {
        this.gost = gost;
        this.stol = stol;
    }
    
    
    

    public Gost getGost() {
        return gost;
    }

    public void setGost(Gost gost) {
        this.gost = gost;
    }

    public Stol getStol() {
        return stol;
    }

    public void setStol(Stol stol) {
        this.stol = stol;
    }
    
    
    
}

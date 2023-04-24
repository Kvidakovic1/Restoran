/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoranapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kristijan
 */
@Entity
public class Narudba extends Entitet {
    @ManyToOne
    private Stol stol;
    
    private String napomena;
    @ManyToMany
    @JoinTable(
    name="stavka", joinColumns = {@JoinColumn(name="narudba")},inverseJoinColumns={@JoinColumn(name="artikl")} )
    private List<Artikl> artikli;

    public Narudba() {
        super();
        artikli = new ArrayList<>();
        
    }

    public Stol getStol() {
        return stol;
    }

    public void setStol(Stol stol) {
        this.stol = stol;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public List<Artikl> getArtikli() {
        return artikli;
    }

    public void setArtikli(List<Artikl> artikli) {
        this.artikli = artikli;
    }

    public Narudba(Stol stol, String napomena, List<Artikl> artikli) {
        this.stol = stol;
        this.napomena = napomena;
        this.artikli = artikli;
    }

    public Narudba(Stol stol, String napomena, List<Artikl> artikli, int sifra) {
        super(sifra);
        this.stol = stol;
        this.napomena = napomena;
        this.artikli = artikli;
    }

    

    @Override
    public String toString() {
        return  napomena + " " + artikli.size() + " artikala";
    }
    
    

    
    

    
    

  
    
    
}

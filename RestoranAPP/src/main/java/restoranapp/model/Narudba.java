/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoranapp.model;

import jakarta.persistence.Entity;
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
    

    public Narudba() {
        super();
        
    }

    public Narudba(Stol stol, List<Artikl> artikli, String napomena, int kolicina) {
        this.stol = stol;
        
        this.napomena = napomena;
        
    }

    public Narudba(Stol stol, List<Artikl> artikli, String napomena, int kolicina, int sifra) {
        super(sifra);
        this.stol = stol;
       
        this.napomena = napomena;
        
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

    

    
    

  
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoranapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Artikl extends Entitet {
     private String naziv;
     private BigDecimal cijena;
     private String kategorija;
     
     @ManyToMany(mappedBy = "artikli")
     private List<Narudba> narudbe = new ArrayList<>();

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public Artikl() {
        super();
    }

    public Artikl(String naziv, BigDecimal cijena, String kategorija) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kategorija = kategorija;
    }

    public Artikl(String naziv, BigDecimal cijena, String kategorija, int sifra) {
        super(sifra);
        this.naziv = naziv;
        this.cijena = cijena;
        this.kategorija = kategorija;
    }

    public List<Narudba> getNarudbe() {
        return narudbe;
    }

    public void setNarudbe(List<Narudba> narudbe) {
        this.narudbe = narudbe;
    }
    

    @Override
    public String toString() {
        return naziv + " - " + cijena.toString() + " €";
    }
    
    
    
    
    

    
    
    
}

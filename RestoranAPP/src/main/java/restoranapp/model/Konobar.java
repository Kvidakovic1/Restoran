/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoranapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Konobar extends Entitet {
    
    private String ime;
    private String prezime;
    private String oib;
    private String iban;
    
    @OneToMany(mappedBy = "konobar")
    private List<Stol> stolovi;

    public Konobar(String ime, String prezime, String oib, String iban, int sifra) {
        super(sifra);
        this.ime = ime;
        this.prezime = prezime;
        this.oib = oib;
        this.iban = iban;
    }

    public Konobar() {
        super();
    }
    

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public List<Stol> getStolovi() {
        return stolovi;
    }

    public void setStolovi(List<Stol> stolovi) {
        this.stolovi = stolovi;
    }
    
    

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
    
    public String getImePrezime(){
        return ime + " " + prezime;
    }
    
    
    
    
}

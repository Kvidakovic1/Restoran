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
public class Gost extends Entitet {
    private String ime;
    private String prezime;
    private String brojTelefona; 

    public Gost() {
        super();
    }

    public Gost(String ime, String prezime, String brojTelefona) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojTelefona = brojTelefona;
    }

    public Gost(String ime, String prezime, String brojTelefona, int sifra) {
        super(sifra);
        this.ime = ime;
        this.prezime = prezime;
        this.brojTelefona = brojTelefona;
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

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }
    
    
}

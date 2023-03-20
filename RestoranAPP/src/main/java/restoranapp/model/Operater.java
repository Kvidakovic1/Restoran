/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoranapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

/**
 *
 * @author Kristijan
 */
@Entity
public class Operater extends Entitet {
    
        private String ime;
        private String prezime;
        private String oib;
        private String email;
        
        @Column(columnDefinition = "char(61)")
        private char[] lozinka;

    public Operater() {
        super();
    }
        
        

    public Operater(String ime, String prezime, String oib, String email, char[] lozinka) {
        this.ime = ime;
        this.prezime = prezime;
        this.oib = oib;
        this.email = email;
        this.lozinka = lozinka;
    }

    public Operater(String ime, String prezime, String oib, String email, char[] lozinka, int sifra) {
        super(sifra);
        this.ime = ime;
        this.prezime = prezime;
        this.oib = oib;
        this.email = email;
        this.lozinka = lozinka;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char[] getLozinka() {
        return lozinka;
    }

    public void setLozinka(char[] lozinka) {
        this.lozinka = lozinka;
    }
    
    public String getImePrezime(){
        return ime + " " + prezime;
    }
        
        
        
}

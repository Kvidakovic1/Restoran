/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoranapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kristijan
 */
@Entity
public class Stol extends Entitet {

    private int brojStola;
    @ManyToOne
    private Konobar konobar;

    public Stol() {
        super();
    }

    public Stol(int brojStola, Konobar konobar) {
        this.brojStola = brojStola;
        this.konobar = konobar;
    }

    public Stol(int brojStola, Konobar konobar, int sifra) {
        super(sifra);
        this.brojStola = brojStola;
        this.konobar = konobar;
    }
    
    
    
    

    public int getBrojStola() {
        return brojStola;
    }

    public void setBrojStola(int brojStola) {
        this.brojStola = brojStola;
    }

    public Konobar getKonobar() {
        return konobar;
    }

    public void setKonobar(Konobar konobar) {
        this.konobar = konobar;
    }

    @Override
    public String toString() {
        return "Broj stola: " +  String.valueOf(brojStola);
    }
    
    
    

    

    
    

    
}

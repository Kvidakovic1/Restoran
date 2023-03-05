/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoranapp.model;

import jakarta.persistence.Entity;
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
    @OneToMany
    private List<Gost> gosti;

    public Stol() {
        super();
        gosti = new ArrayList<>();
    }

    public Stol(int brojStola, Konobar konobar, List<Gost> gosti) {
        this.brojStola = brojStola;
        this.konobar = konobar;
        this.gosti = gosti;
    }

    public Stol(int brojStola, Konobar konobar, List<Gost> gosti, int sifra) {
        super(sifra);
        this.brojStola = brojStola;
        this.konobar = konobar;
        this.gosti = gosti;
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

    public List<Gost> getGosti() {
        return gosti;
    }

    public void setGosti(List<Gost> gosti) {
        this.gosti = gosti;
    }
    
    

    
    

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoranapp.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Entitet {
    @Id
    @GeneratedValue
    private int sifra;

    public Entitet() {
        super();
    }

    public Entitet(int sifra) {
        super();
        this.sifra = sifra;
    }

    public int getSifra() {

        return sifra;
    }

    public void setSifra(int sifra) {
       
        this.sifra = sifra;
    }

}
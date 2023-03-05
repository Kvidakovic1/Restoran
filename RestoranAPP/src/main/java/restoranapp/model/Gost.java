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
}

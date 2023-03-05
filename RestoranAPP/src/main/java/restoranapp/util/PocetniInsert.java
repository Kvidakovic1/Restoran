/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoranapp.util;

import com.github.javafaker.Faker;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import restoranapp.model.Artikl;
import restoranapp.model.Gost;
import restoranapp.model.Konobar;
import restoranapp.model.Stol;

/**
 *
 * @author Kristijan
 */
public class PocetniInsert {
    
    private Faker faker;
    private List<Konobar> konobari;
    private List<Gost> gosti;
    private List<Artikl> artikli;
    private List<Stol> stolovi;
    private Session session;
    
    public PocetniInsert(){
        faker = new Faker();
        konobari = new ArrayList<>();
        gosti = new ArrayList<>();
        
        
    }
        
        
    }
    


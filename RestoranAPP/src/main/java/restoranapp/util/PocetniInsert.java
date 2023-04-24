/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoranapp.util;

import com.github.javafaker.Faker;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.hibernate.Session;
import restoranapp.model.Artikl;
import restoranapp.model.Gost;
import restoranapp.model.Konobar;
import restoranapp.model.Narudba;

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
    private List<Narudba> narudbe;
    private Session session;
    
    public static void izvedi(){
    new PocetniInsert();
    }

    public PocetniInsert() {
        faker = new Faker();
        konobari = new ArrayList<>();
        gosti = new ArrayList<>();
        artikli = new ArrayList<>();
        stolovi = new ArrayList<>();
        narudbe = new ArrayList<>();
        session = HibernateUtil.getSession();
        session.beginTransaction();
        kreirajKonobare();
        //kreirajGoste();
        kreirajArtikle();
        kreirajStolove();
        kreirajNarudbu();
        //kreirajStavke();
        session.getTransaction().commit();

    }

    private void kreirajKonobare() {
        Konobar k;
        for (int i = 0; i < 21; i++) {
            k = new Konobar();
            k.setIme(faker.name().firstName());
            k.setPrezime(faker.name().lastName());
            k.setIban(faker.finance().iban());
            k.setOib(Alati.dovuciOib());
            session.persist(k);
            konobari.add(k);

        }

    }

    private void kreirajGoste() {
        Gost g;
        for (int i = 0; i < 200; i++) {
            g = new Gost();
            g.setIme(faker.name().firstName());
            g.setPrezime(faker.name().lastName());
            g.setBrojTelefona(faker.phoneNumber().cellPhone());
            session.persist(g);
            gosti.add(g);

        }

    }

    private void kreirajArtikle() {
        Artikl a;
        for (int i = 0; i < 150; i++) {
            a = new Artikl();
            if (i % 2 == 0) {
                a.setNaziv(faker.food().dish());
                a.setKategorija("Hrana");
            } else {
                a.setNaziv(faker.beer().name());
                a.setKategorija("Pice");

            }
            a.setCijena(new BigDecimal(sb(10, 150)));

            session.persist(a);
            artikli.add(a);

        }

    }

    private int sb(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    private void kreirajStolove() {
        Stol s;
        

        for (int i = 0; i < 10; i++) {
            s = new Stol();
            s.setBrojStola(i + 1);
            s.setKonobar(konobari.get(sb(0, 20)));
            
            
            
            session.persist(s);
            stolovi.add(s);
        }

    
    }
    private void kreirajNarudbu() {
        Narudba n;
        List<Artikl> a;
        for(int i = 0; i <100;i++){
            n = new Narudba();
            n.setNapomena(faker.ancient().titan());
            n.setStol(stolovi.get(sb(0,stolovi.size()-1)));
            a = new ArrayList<>();
            for(int j = 0; j<sb(1, 10);j++){
                a.add(artikli.get(sb(0, artikli.size()-1)));
            }
            
            n.setArtikli(a);
            session.persist(n); 
        }
          
       }
       }

        
//       for(int i =0;i<50;i++){
//       n = new Narudba();
//       n.setStol(stolovi.get(sb(0,stolovi.size()-1)));
//       n.setNapomena(faker.ancient().titan());
//       
       
      
       
     
//    private void kreirajStavke() {
//        Stavka s;
//        List<Artikl> a;
//        List<Narudba> n;
//        
//        for(int i =0;i<50;i++){
//          s = new Stavka();
//          s.setArtikl(artikli.get(sb(0, artikli.size()-1)));
//          s.setKolicina(sb(1, 10));
//          s.setNarudba(narudbe.get(sb(0, narudbe.size()-1)));
//          
//          session.persist(s);
//        }
//        
//    }

    



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

    public PocetniInsert() {
        faker = new Faker();
        konobari = new ArrayList<>();
        gosti = new ArrayList<>();
        artikli = new ArrayList<>();
        session = HibernateUtil.getSession();
        session.beginTransaction();
        kreirajKonobare();
        kreirajGoste();
        kreirajArtikle();
        kreirajStolove();
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
            g.setIme(faker.phoneNumber().cellPhone());
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
        List<Gost> a;

        for (int i = 0; i < 10; i++) {
            s = new Stol();
            s.setBrojStola(i + 1);
            s.setKonobar(konobari.get(sb(0, konobari.size())));
            a = new ArrayList<>();
            for (int j = 0; j < sb(2, 10); j++) {
                a.add(gosti.get(sb(0, (gosti.size()))));
            }
            s.setGosti(gosti);
            session.persist(s);
        }

    }

}

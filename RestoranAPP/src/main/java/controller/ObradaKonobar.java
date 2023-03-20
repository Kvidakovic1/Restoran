/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import restoranapp.model.Konobar;
import restoranapp.util.Alati;
import restoranapp.util.EdunovaException;

/**
 *
 * @author Kristijan
 */
public class ObradaKonobar extends Obrada<Konobar> {

    @Override
    public List<Konobar> read() {
        return session.createQuery("from Konobar order by ime", Konobar.class).list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaOib();
        kontrolaIban();

    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        kontrolaImeNull();
        kontrolaImeNijeBroj();
        kontrolaImeMaksimalnaDuzina();
        kontrolaOib();
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {

    }

    private void kontrolaIme() throws EdunovaException {
        kontrolaImeNull();
        kontrolaImeNijeBroj();
        kontrolaImeMaksimalnaDuzina();
    }

    private void kontrolaImeNull() throws EdunovaException {
        if (entitet.getIme().isEmpty()) {
            throw new EdunovaException("Ime mora biti postavljeno");
        }
    }

    private void kontrolaImeNijeBroj() throws EdunovaException {
        boolean broj = false;

        try {
            Double.parseDouble(entitet.getIme());
            broj = true;
        } catch (Exception e) {

        }

        if (broj) {
            throw new EdunovaException("Ime ne moze biti broj");
        }
    }

    private void kontrolaImeMaksimalnaDuzina() throws EdunovaException {
        if (entitet.getIme().trim().length() > 50) {
            throw new EdunovaException("Ime može imati maksimalno 50 znakova");
        }
    }

    private void kontrolaPrezimeNijeBroj() throws EdunovaException {
        boolean broj = false;

        try {
            Double.parseDouble(entitet.getPrezime());
            broj = true;
        } catch (Exception e) {

        }

        if (broj) {
            throw new EdunovaException("Prezime ne moze biti broj");
        }
    }

    private void kontrolaPrezime() throws EdunovaException {
        kontrolaPrezimeNijeBroj();
        kontrolaPrezimeNull();
        kontrolaPrezimeMaksimalnaDuzina();
    }

    private void kontrolaPrezimeNull() throws EdunovaException {
        if (entitet.getPrezime().isEmpty()) {
            throw new EdunovaException("Prezime mora biti postavljeno");
        }
    }

    private void kontrolaPrezimeMaksimalnaDuzina() throws EdunovaException {
        if (entitet.getPrezime().trim().length() > 50) {
            throw new EdunovaException("Prezime može imati maksimalno 50 znakova");
        }
    }

    private void kontrolaOib() throws EdunovaException {
        if (!Alati.kontrolaOIB(entitet.getOib())) {
            throw new EdunovaException("Oib nije u dobrom formatu");
        }
    }

    private void kontrolaIban() throws EdunovaException {
        kontrolaIbanNull();
    }

    private void kontrolaIbanNull() throws EdunovaException {
        if (entitet.getIban().isEmpty()) {
            throw new EdunovaException("Iban mora biti postavljen");
        }
    }

}

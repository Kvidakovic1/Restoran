/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.math.BigDecimal;
import java.util.List;
import restoranapp.model.Artikl;
import restoranapp.model.Entitet;
import restoranapp.model.Konobar;
import restoranapp.util.EdunovaException;

/**
 *
 * @author Kristijan
 */
public class ObradaArtikl extends Obrada<Artikl> {

    @Override
    public List<Artikl> read() {
        return session.createQuery("from Artikl", Artikl.class).list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        kontrolaNaziv();
        kontrolaCijena();
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        kontrolaNazivNull();
        kontrolaNazivNijeBroj();
        kontrolaNazivMaksimalnaDuzina();
        kontrolaCijena();
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void kontrolaNaziv() throws EdunovaException {
        kontrolaNazivNull();
        kontrolaNazivNijeBroj();
        kontrolaNazivMaksimalnaDuzina();
    }

    private void kontrolaNazivNull() throws EdunovaException {
        if (entitet.getNaziv() == null) {
            throw new EdunovaException("Naziv mora biti postavljen");
        }
    }

    private void kontrolaNazivNijeBroj() throws EdunovaException {

        boolean broj = false;

        try {
            Double.parseDouble(entitet.getNaziv());
            broj = true;
        } catch (Exception e) {

        }

        if (broj) {
            throw new EdunovaException("Naziv artikla ne smije biti broj");
        }
    }

    private void kontrolaNazivMaksimalnaDuzina() throws EdunovaException {
        if (entitet.getNaziv().trim().length() > 50) {
            throw new EdunovaException("Naziv artikla može imati maksimalno 50 znakova");
        }
    }

    private void kontrolaCijena() throws EdunovaException {
        if (entitet.getCijena() == null || entitet.getCijena().compareTo(BigDecimal.ZERO) <= 0 || entitet.getCijena().compareTo(new BigDecimal(1000)) == 1) {
            throw new EdunovaException("Cijena mora biti postavljena," + " veća od 0 i manja od 1000");
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import restoranapp.model.Narudba;
import restoranapp.util.EdunovaException;

/**
 *
 * @author Kristijan
 */
public class ObradaNarudba extends Obrada<Narudba> {

    @Override
    public List<Narudba> read() {
       return session.createQuery("from Narudba order by Stol asc", Narudba.class).list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
        
    }
    
}

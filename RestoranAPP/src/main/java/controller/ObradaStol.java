/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import restoranapp.model.Stol;
import restoranapp.util.EdunovaException;

/**
 *
 * @author Kristijan
 */
public class ObradaStol extends Obrada<Stol> {

    @Override
    public List<Stol> read() {
        return session.createQuery("from Stol", Stol.class).list();
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

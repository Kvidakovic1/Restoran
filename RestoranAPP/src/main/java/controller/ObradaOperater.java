/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import jakarta.persistence.NoResultException;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;
import restoranapp.model.Operater;
import restoranapp.util.EdunovaException;

/**
 *
 * @author Kristijan
 */
public class ObradaOperater extends Obrada<Operater> {

    @Override
    public List<Operater> read() {
        return session.createQuery("from Operater", Operater.class).list();
    }

    public void unosAdminOperatera() {
        Operater o = new Operater();
        o.setIme("Admin");
        o.setPrezime("Operater");
        o.setEmail("operater@gmail.hr");
        o.setOib("53853566439");
        o.setLozinka(BCrypt.hashpw("admin", BCrypt.gensalt()).toCharArray());

        entitet = o;

        try {
            create();
        } catch (EdunovaException ex) {
            System.out.println(ex.getPoruka());
        }
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

    public Operater autoriziraj(String email, char[] lozinka) {
        Operater o;
        try {
            o = session.createQuery("from Operater o where o.email=:email",Operater.class).setParameter("email", email).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
         if(BCrypt.checkpw(
                new String(lozinka), 
                new String(o.getLozinka())
                            )
                ){
            return o;
        }
         return null;
    }

}

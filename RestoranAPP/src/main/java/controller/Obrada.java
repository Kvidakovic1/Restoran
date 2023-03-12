/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.annotations.Persister;
import restoranapp.model.Entitet;
import restoranapp.util.EdunovaException;
import restoranapp.util.HibernateUtil;

/**
 *
 * @author Kristijan
 */
public abstract class Obrada<T extends Entitet> {

    protected T entitet;
    protected Session session;

    public abstract List<T> read();

    protected abstract void kontrolaUnos() throws EdunovaException;

    protected abstract void kontrolaPromjena() throws EdunovaException;

    protected abstract void kontrolaBrisanje() throws EdunovaException;

    public Obrada() {
        this.session = HibernateUtil.getSession();
    }

    public void create() throws EdunovaException {
        if (entitet == null) {
            throw new EdunovaException("Entitet je null");
        }
        kontrolaUnos();
        persist();

    }

    public void update() throws EdunovaException {
        kontrolaPromjena();
        persist();
    }

    public void delete() throws EdunovaException {
        kontrolaBrisanje();
        session.beginTransaction();
        session.remove(entitet);
        session.getTransaction().commit();

    }

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }

    private void persist() {
        session.beginTransaction();
        session.persist(entitet);
        session.getTransaction().commit();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calendarjsf.daos;

import com.calendarjsf.modelos.*;
//import Com.CalendarJSF.Modelos.Users;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Joan
 */
public abstract class Helper {

    protected Session session;
    
    public Helper() {
        this.session = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Session generado??");
        //this.session = HibernateUtil.getSessionFactory().openSession();
    }
    
    protected void closeSession() {
        this.session.close();
    }
    //public abstract Usuarios getListById(int id);
    //public abstract List<Usuarios> getAllUsers();
    //public abstract Usuarios getUserByEmail(String Email) throws Exception, HibernateException;
    //public abstract Usuarios getUserByUsername(String Username) throws Exception, HibernateException;
    
}

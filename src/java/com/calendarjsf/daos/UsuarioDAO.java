/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calendarjsf.daos;

import com.calendarjsf.modelos.*;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 * OBJETO DAO DE PERSISTENCIA PARA USUARIO (HIBERNATE)
 * @author Joan
 */

public class UsuarioDAO extends Helper {
    
    //private Session session;
    
    public UsuarioDAO() {
        super();
    }
    //METODO QUE OBTIENE TODA LA LISTA DE USUARIOS GUARDADOS EN LA TABLA USERS
    @SuppressWarnings("CallToPrintStackTrace")
    public List<Usuarios> getAllUsers() {
        
        Transaction tx = this.session.beginTransaction();
        List<Usuarios> users = null;
        
        try {
            Query query = session.createQuery("FROM Usuarios");
            users = query.list();
        }catch(HibernateException e) {
            e.printStackTrace();
            tx.rollback();
        }
        return users;
    }
    //METODO DE OBTENCION DE USUARIO A PARTIR DE ID
    @SuppressWarnings("CallToPrintStackTrace")
    public Usuarios getListById(int id) {
        
        Transaction tx = this.session.beginTransaction();
        Usuarios user = new Usuarios();
        
        try {
            Query query = session.createQuery("FROM Usuarios WHERE id="+id);
            //query.setInteger(0, id);
            user = (Usuarios) query.uniqueResult();
            System.out.println("Query??");
            //users = (user) query;
        }catch(HibernateException e){
            e.printStackTrace();
            tx.rollback();
        }
        return user;
    }
    //METODO DE OBTENCION DE USER A PARTIR DE MAIL
    public Usuarios getUserByEmail(String Email) throws Exception, HibernateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //METODO DE OBTENCION DE USER APARTIR DE USERNAME
    public Usuarios getUserByUsername(List<Usuarios> Users, String Username) throws NullPointerException, Exception{
        Usuarios Encontrado = new Usuarios();
        for(Usuarios user : Users) {
            if(user.getUsuario().equals(Username)) {
                Encontrado = user;
                break;
            }
        }
        return Encontrado;
    }
    //METODO DE VALIDACION DE USUARIO A PARTIR DE LISTA CON TODOS LOS USERS
    public boolean userValidate(List<Usuarios> Users, String Username, String Pass) throws Exception {
        boolean validate = false;
        for(Usuarios user : Users) {
            if(user.getUsuario().equals(Username) && user.getPass().equals(Pass)) {
                System.out.println("User and Pass Correct!");
                validate = true;
            }
        }
        return validate;
    }
    //METODO DE VALIDACION DE USUARIO SIN LISTA
    public boolean userValidate(String Username, String Pass) throws Exception {
        boolean validate = false;
        //Este metodo tendria que valorar el hecho que el usuario tambien puede autenticarse con el email
        Usuarios User = getUserByUsername(Username);
        if((User.getUsuario().equals(Username)) && (User.getPass().equals(Pass))) {
            validate = true;
        }
        return validate;
    }
    //METODO DE OBTENCION DE OBJETO USER A PARTIR DE USERNAME
    @SuppressWarnings("CallToPrintStackTrace")
    public Usuarios getUserByUsername(String Username) throws Exception, HibernateException {
        if(!this.session.isOpen()) {
            this.session = HibernateUtil.getSessionFactory().openSession();
        }
        Transaction tx = this.session.beginTransaction();
        Usuarios user = new Usuarios();
        
        try {
            Query query = this.session.createQuery("select u from Usuarios u where u.usuario=?");
            query.setString(0, Username);
            user = (Usuarios) query.uniqueResult();
            if(user == null) {
                return user = new Usuarios();
            }
            System.out.println("User " + user.getUsuario() + " recuperado.");
            tx.commit();
        }catch(HibernateException e) {
            e.printStackTrace();
            tx.rollback();
        }catch(Exception e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            this.session.close();
        }
        
        return user;
    }
}

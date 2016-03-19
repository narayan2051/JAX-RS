/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sampleproject.DAO.impl;

import com.leapfrog.sampleproject.DAO.ContactDAO;
import com.leapfrog.sampleproject.entity.Contact;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Narayan
 */
public class ContactDAOImpl implements ContactDAO{

       EntityManagerFactory emf;
        EntityManager em;
        EntityTransaction trns;
    public ContactDAOImpl() {
        
     emf=Persistence.createEntityManagerFactory("CUnit");
     em=emf.createEntityManager();
     trns=em.getTransaction();
        
        
    }
    
    
    

    @Override
    public int insert(Contact t) {

        
        if(!trns.isActive()){
            trns.begin();
        }
        
        em.persist(t);
        trns.commit();
        
        return 1;
    }

    @Override
    public List<Contact> getAll() {
       
        Query query=em.createQuery("SELECT c FROM Contact c");
        
      return (List<Contact>)query.getResultList();
        
        
    }

    @Override
    public int update(Contact c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Contact getById(int id) {
        return em.find(Contact.class, id);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sampleproject.DAO;

import com.leapfrog.sampleproject.entity.Contact;
import java.util.List;

/**
 *
 * @author Narayan
 */
public interface ContactDAO {
    
    int insert(Contact t);
    List<Contact> getAll();
    int update(Contact c);
    int delete(int id);
    Contact getById(int id);
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sampleproject.API;

import com.leapfrog.sampleproject.DAO.ContactDAO;
import com.leapfrog.sampleproject.DAO.impl.ContactDAOImpl;
import com.leapfrog.sampleproject.entity.Contact;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author Narayan
 */
@Path("contact")
@Produces("Application/json")

public class ContactAPI {

    ContactDAO contactDAO = new ContactDAOImpl();

    @GET
    public List<Contact> index() {
        return (List<Contact>) contactDAO.getAll();
    }

    @GET
    @Path("/{id}")
    public Contact id(@PathParam("id") int id) {
        return contactDAO.getById(id);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author java
 */
@Path("saludos")
public class rsHola {
    //por query
    @GET
    @Path("hola")
    @Produces(MediaType.TEXT_PLAIN)
    public String Hola(@QueryParam("nombre") String nombre) {
        return "Hola " + nombre + "!"; 
    }
    
    //por path
    @GET
    @Path("hola2/{nombre}")
    @Produces(MediaType.TEXT_PLAIN)
    public String Hola2(@PathParam("nombre") String nombre) {
        return "Hola2 " + nombre + "!"; 
    }    
}

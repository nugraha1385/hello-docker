package com.example;


import io.micronaut.context.annotation.Parameter;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.logging.LogManager;


@Path("/hello")
public class HelloController {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String greeting(){
        System.out.println("Hello");
        return "Hello Indra";
    }


}

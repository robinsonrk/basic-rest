package com.merian.restapp.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author robinson
 */
@Path("hello")
public class Hello {

    @GET
    public String hello() {
        return "Hello World! From EndPoint";
    }

    @GET
    @Path("{name}")
    public String hello(@PathParam("name") String name) {
        if (!"".equals(name)) {
            return "Hello " + name + "! From EndPoint";
        } else {
            return hello();
        }
    }

}

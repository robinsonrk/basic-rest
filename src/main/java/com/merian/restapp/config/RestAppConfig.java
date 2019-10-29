package com.merian.restapp.config;

import com.merian.restapp.resources.Hello;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author robinson
 */
@ApplicationPath("resources/v1")
public class RestAppConfig extends Application {

    Set<Class<?>> resources = new HashSet<>();

    public RestAppConfig() {
        resources.add(Hello.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return resources;
    }

}

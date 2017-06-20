package com.gizwits.controller;

import com.gizwits.domain.Employee;
import com.gizwits.domain.Employees;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/message")
public class JerseyService {
    @GET
    @Path("/getmsg")
    public String getMsg() {
        return "Hello World !! - Jersey 2";
    }

    @GET
    @Path("/getJson")
    @Produces(MediaType.APPLICATION_JSON)
    public Employees getAllEmployees() {

        /**
         *
         *  <p>
         *    参考链接 http://owlike.github.io/genson/Documentation/Extensions/#jax-rs-jersey--cie
         *     http://howtodoinjava.com/jersey/jax-rs-jersey-jsonp-example/
         *     http://howtodoinjava.com/jersey/jersey-2-hello-world-application-tutorial/
         *
         *  </p>
         */
        Employees list = new Employees();
        list.setEmployeeList(new ArrayList<Employee>());

        list.getEmployeeList().add(new Employee(1, "中文名字"));
        list.getEmployeeList().add(new Employee(2, "Alex Kolenchiskey"));
        list.getEmployeeList().add(new Employee(3, "David Kameron"));

        return list;
    }
}
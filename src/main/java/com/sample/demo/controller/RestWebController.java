package com.sample.demo.controller;

import com.sample.demo.message.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sample.demo.model.Customer;
import com.sample.demo.repository.UserRepo;

import java.util.ArrayList;
import java.util.List;


@RestController

    @RequestMapping("/api/customer")
    public class RestWebController {
    List <Customer> cust = new ArrayList<Customer>();


    @Autowired
    UserRepo userRepo;


    @GetMapping("/all")
    public Response getResource(){
        Response response = new Response("Done", cust);
        return response;
    }

    @PostMapping("/save")
    public Response postCustomer(@RequestBody Customer customer){
        cust.add(customer);
        System.out.println("customer = " + customer);
        Response response = new Response("Done", customer);
        return response;
    }

}

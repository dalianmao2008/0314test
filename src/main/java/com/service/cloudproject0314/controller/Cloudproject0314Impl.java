package com.service.cloudproject0314.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-03-14T10:01:48.352Z")

@RestSchema(schemaId = "cloudproject0314")
@RequestMapping(path = "/CloudProject0314", produces = MediaType.APPLICATION_JSON)
public class Cloudproject0314Impl {

    @Autowired
    private Cloudproject0314Delegate userCloudproject0314Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCloudproject0314Delegate.helloworld(name);
    }

}

package com.service.cloudproject0314.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCloudproject0314 {

        Cloudproject0314Delegate cloudproject0314Delegate = new Cloudproject0314Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cloudproject0314Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
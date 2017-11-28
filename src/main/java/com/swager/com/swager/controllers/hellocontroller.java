package com.swager.com.swager.controllers;

/**
 * Created by muhamd gomaa on 11/26/2017.
 */

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
@Api(value=" hello  controller",description = "show hello restful")
public class hellocontroller {
 @ApiOperation("return hello world")
    @GetMapping
    public String hello(){


        return" hello world";
    }
    @PostMapping("/post")
    public String posthello(@RequestBody final String hello){


        return hello;
    }
    @PutMapping("/put")
    public String puthello(@RequestBody final String hello){

        return hello;
    }






}


package com.swager.com.swager.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by muhamd gomaa on 11/26/2017.
 */

@RestController
@RequestMapping("/rest/user")
public class usercontroller {

    @GetMapping
            public List<User> getusers(){


        return Arrays.asList(new User("mohamed","123"),new User("ahmed","345"));

    }
    @GetMapping("/{username}")
    public User getuser(@PathVariable String name){

return new User(name,"789");
    }


   private class User{
        @ApiModelProperty(notes="name of user")
                String name;
       @ApiModelProperty(notes="pass of user")
       String pass;
                public User(String name,String pass){

                    this.name=name;
                    this.pass=pass;

                }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }
   }

}



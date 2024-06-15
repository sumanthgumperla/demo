package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String greet(){
        return "Welcome to Springboot!";
    }

    @PostMapping("/save")
    public ResponseEntity<HttpStatus> saveEmployee(@RequestBody Employee employee){

        if(employee!=null){
            System.out.println("valid employee object !!!####");
            return new ResponseEntity<>(HttpStatus.CREATED);
        }else{
            System.out.println("In valid employee object");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

}

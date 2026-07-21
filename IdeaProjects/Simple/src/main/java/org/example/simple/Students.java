package org.example.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Students {

    //Constructor Injection
//    private  Books obj;
//
//    public  Students(Books obj ){
//        this.obj = obj;
//    }

    //  field injection

//    @Autowired
//    private Books obj;

    // setter Injection

    private Books obj;

    @Autowired
    public void setObj(Books obj){
        this.obj = obj;
    }


    public void study(){
        obj.study();
        System.out.println("Student is Studying");
    }
}
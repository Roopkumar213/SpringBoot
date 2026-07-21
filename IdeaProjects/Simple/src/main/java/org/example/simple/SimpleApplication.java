package org.example.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleApplication {

    public static void main(String[] args) {


       ApplicationContext  context =  SpringApplication.run(SimpleApplication.class, args);

      Students obj =context.getBean(Students.class);
      obj.study();
    }

}

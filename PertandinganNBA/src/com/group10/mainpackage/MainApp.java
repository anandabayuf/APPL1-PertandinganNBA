package com.group10.mainpackage;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import com.group10.configuration.ApplicationConfig;
import com.group10.controller.PertandinganNBAController;
import com.group10.controller.PertandinganNBAService;
import com.group10.model.PertandinganNBA;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      PertandinganNBAController obj = context.getBean("pertandinganNBAController", PertandinganNBAController.class);
      
      obj.play();
   }
}
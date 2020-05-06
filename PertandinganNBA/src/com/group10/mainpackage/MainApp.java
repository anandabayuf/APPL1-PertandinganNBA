package com.group10.mainpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.group10.configuration.ApplicationConfig;
import com.group10.controller.PertandinganNBAController;
import com.group10.controller.PertandinganNBAService;
import com.group10.model.PertandinganNBA;

public class MainApp {
   public static void main(String[] args) {
      //ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      //PertandinganNBAController obj = context.getBean("pertandinganNBAController", PertandinganNBAController.class);
      
      //obj.play();
      

	  AbstractApplicationContext absAppcontext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        PertandinganNBAService pertandinganNBAService = (PertandinganNBAService) absAppcontext.getBean("pertandinganNBAService");
        // Delete All cars
        pertandinganNBAService.deleteAll();
        
        PertandinganNBA pertandingan1 = new PertandinganNBA("2020-01-01", "GWS", "HR", "20-20",
        		"25-21", "25-20", "23-19", "93-80");
        pertandinganNBAService.create(pertandingan1);
        
        absAppcontext.close();
   }
}
package mainpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controller.PertandinganNBAController;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      PertandinganNBAController obj = context.getBean("pertandinganNBAController", PertandinganNBAController.class);
      
      obj.play();
   }
}
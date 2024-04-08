package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container  = new AnnotationConfigApplicationContext(AppConfig.class, NewAppConfig.class);
      FullTimeEmployee fullTimeEmployee = container.getBean(FullTimeEmployee.class);
      fullTimeEmployee.createAccount();
      PartTimeEmployee partTimeEmployee= container.getBean(PartTimeEmployee.class);
      partTimeEmployee.createAccount();

      //String welcomeString= container.getBean("",String.class);


    }

}

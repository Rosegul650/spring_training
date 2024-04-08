package sterotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sterotype_annotation.Config.ConfigApp;
import sterotype_annotation.Model.DataStructure;
import sterotype_annotation.Model.Microservice;

public class CourseApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);
        DataStructure dataStructure = container.getBean(DataStructure.class);
        dataStructure.getTotalHours();
        Microservice microservice = container.getBean(Microservice.class);
        microservice.getTotalHours();
    }
}

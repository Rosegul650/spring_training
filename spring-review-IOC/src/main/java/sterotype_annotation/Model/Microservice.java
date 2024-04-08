package sterotype_annotation.Model;

import org.springframework.stereotype.Component;

@Component
public class Microservice {
    public void getTotalHours(){
        System.out.println("Total hours : "+ 20);
    }
}

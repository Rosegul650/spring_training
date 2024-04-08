package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewAppConfig {
@Bean
public String welcome(){
    return "Welcome to Cydeo";
}
@Bean
    public String practice(){
    return "Spring core practice";
}
}

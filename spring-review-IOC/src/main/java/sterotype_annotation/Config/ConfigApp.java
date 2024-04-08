package sterotype_annotation.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import sterotype_annotation.Model.DataStructure;
import sterotype_annotation.Model.Devops;
import sterotype_annotation.Model.Microservice;

@Configuration
@ComponentScan("sterotype_annotation")
public class ConfigApp {
    public DataStructure  dataStructure;
  //  public Devops devops;
    public Microservice microservice;

    public ConfigApp(DataStructure dataStructure, Microservice microservice) {
        this.dataStructure = dataStructure;
        this.microservice = microservice;
    }




}

package com.cydeo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Data  //to have getter and setter
@Configuration
public class AppConfigData {
    @Value("${username}") //we are trying to bring this value from somewhere else
    private String UserName;
    @Value("${password}")
    private String Password;
    @Value("${url}")
    private String Url;

}

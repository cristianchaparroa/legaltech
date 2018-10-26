package legaltech;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
@ComponentScan("legaltech")
@EntityScan( basePackages = {"legaltech.entities"} )
public class Application {

  protected Logger logger = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
       SpringApplication.run(Application.class, args);
   }

}

package scotiabank;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class Application {

  protected Logger logger = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
       SpringApplication.run(Application.class, args);
   }

}

package org.starichkov.java.vaadin.v8.grid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author Vadim Starichkov
 * @since 12.03.2019 11:34
 */
@SpringBootApplication
public class VaadinV8GridApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(VaadinV8GridApplication.class, args);
  }
}

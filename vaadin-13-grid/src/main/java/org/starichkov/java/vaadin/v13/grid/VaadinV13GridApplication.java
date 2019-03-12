package org.starichkov.java.vaadin.v13.grid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Vadim Starichkov
 * @since 12.03.2019 11:40
 */
@SpringBootApplication
public class VaadinV13GridApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(VaadinV13GridApplication.class, args);
  }
}

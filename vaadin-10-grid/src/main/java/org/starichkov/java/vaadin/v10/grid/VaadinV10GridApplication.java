package org.starichkov.java.vaadin.v10.grid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Vadim Starichkov
 * @since 12.03.2019 11:40
 */
@SpringBootApplication
public class VaadinV10GridApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(VaadinV10GridApplication.class, args);
  }
}

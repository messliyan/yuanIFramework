package com.yuan;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class YuanWebApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(YuanWebApplication.class).web(WebApplicationType.REACTIVE)
        .run(args);
  }

}

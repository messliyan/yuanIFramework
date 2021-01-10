package com.yuan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.reactive.config.EnableWebFlux;


@SpringBootApplication
public class YuanWebApplication {

  public static void main(String[] args)  {
    new SpringApplicationBuilder(YuanWebApplication.class).web(WebApplicationType.REACTIVE).run(args);
  }

}

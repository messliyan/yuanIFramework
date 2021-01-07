package com.yuan.config.flyway;

import javax.sql.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.FlywayException;
import org.flywaydb.core.api.configuration.FluentConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Slf4j
@Configuration
public class FlywayConfig implements WebFluxConfigurer {


  @Value("${pg-db.schema}")
  private String schema;

  @Autowired
  private DataSource dataSource;

//  @Bean
//  public void initEnviroment() {
////        new DriverDataSource()
////        DriverDataSource.DriverType.POSTGRESQL
//    try {
//      FluentConfiguration configuration = getFlywayConfiguration();
//      configuration.baselineOnMigrate(true);
//      configuration.baselineDescription("INIT START");
//      Flyway flyway = configuration.load();
//      flyway.migrate();
//    } catch (FlywayException e) {
//      log.warn(" flyway 初始化环境失败 , {}", e.getMessage());
//    }
//  }

  @Bean
  public void upgradeEnviroment() {
    try {
      FluentConfiguration configuration = getFlywayConfiguration();
      Flyway flyway = configuration.load();
      flyway.migrate();
      log.info(">>> flyway upgrade tables");
    } catch (FlywayException e) {
      log.debug(" flyway fail upgrade : {}", e.getMessage());
    }
  }

  private FluentConfiguration getFlywayConfiguration() {
    log.info(" ====> {}", schema);
    FluentConfiguration configuration = Flyway.configure().dataSource(dataSource);
    configuration.schemas(schema, "public");
    configuration.defaultSchema(schema);
    configuration.table("schema_version");
    return configuration;
  }

}

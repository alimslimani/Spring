//package com.alm.highfi.conferencedemo.config;
//
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class PersistanceConfiguration {
//    /*  manual configuration for database
//        it's not preferable
//        use the configuration in application.properties */
//    @Bean
//    public DataSource dataSource() {
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url("jdbc:postgresql://localhost:5432/conference_app");
//        builder.password("admin");
//        builder.username("postgres");
//        System.out.println("Custom datasource bean has been initialized and set");
//        return builder.build();
//    }
//}

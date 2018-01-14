package com.raiden.reda.hilmi.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Services action configuration.
 * This config enables all needed features by loading useful configs,
 * and also loads all cloud-related configs such as Discovery client, circuit breaker, etc.
 */
@Configuration
@ComponentScan(basePackages = { "com.cdiscount.grc" })
@EnableAutoConfiguration(exclude = {
    SolrAutoConfiguration.class,
    DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class
})
@EnableCircuitBreaker
@EnableDiscoveryClient
public class RedaConfig {


}

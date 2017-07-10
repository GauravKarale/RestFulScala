package com.dexcom.config

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.boot.autoconfigure.domain.EntityScan
/**
 * 
 * Author: Gaurav Karale
 * version 1.0.0
 * Date :- 07/09/2017
 * Info :-Spring boot starter class for phone scala api
 * */
@SpringBootApplication
@EnableJpaRepositories(Array("com.dexcom.service"))
@EntityScan(Array("com.dexcom.model"))
@ComponentScan(Array("com.dexcom.service","com.dexcom.controller","com.dexcom.model","com.dexcom.config"))
class Application 
  
object Application extends App {
    SpringApplication.run(classOf[Application]);
}
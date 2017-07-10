package com.dexcom.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

import com.dexcom.service.PhoneRepository
import com.dexcom.model.Phone

/**
 * 
 * Author: Gaurav Karale
 * version 1.0.0
 * Date :- 07/09/2017
 * Info :-Responsible for populating some initial data into the database..
 * */
@Component
class DbPopulator @Autowired()(val phoneRepository: PhoneRepository) extends CommandLineRunner {
  override def run(args: String*): Unit = {
    (1 to 10).foreach(i => {
      phoneRepository.save(new Phone(id=null, name = s"Phone $i", homeNumber = s"989898999$i", cellPhone = s"989898999$i"))  
    })
  }
}

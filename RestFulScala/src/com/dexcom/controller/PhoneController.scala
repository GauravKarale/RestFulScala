package com.dexcom.controller

import java.lang.Long
import javax.validation.Valid

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation._
import org.springframework.http.HttpStatus
import com.dexcom.service.PhoneRepository
import com.dexcom.model.Phone
import org.springframework.beans.factory.annotation.Qualifier

/**
 * 
 * Author: Gaurav Karale
 * version 1.0.0
 * Date :- 07/09/2017
 * Info :-Phone controller
 * */
@Controller
@RequestMapping(Array("/phones"))
class phoneController @Autowired()@Qualifier("phoneRepo")(private val phoneRepository: PhoneRepository) {

  @GetMapping
  @ResponseBody
  def list() = {
    val phones = phoneRepository.findAll()
    phones
  }

  @PostMapping(value = Array("/create"))
  @ResponseStatus(HttpStatus.OK)
  def create(@Valid @RequestBody phone: Phone) =
  {
      phoneRepository.save(phone)
  }


  @PutMapping(value = Array("/update"))
  @ResponseBody
  def update(@Valid @RequestBody phone: Phone) =
  {
      val ph = phoneRepository.save(phone)
      ph
  }


  @DeleteMapping(value = Array("/delete/{id}"))
  @ResponseStatus(HttpStatus.OK)
  def delete(@PathVariable("id") id: Long) = {
    phoneRepository.delete(id)
  }

}
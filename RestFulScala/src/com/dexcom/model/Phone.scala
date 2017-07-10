package com.dexcom.model

import javax.persistence.Id
import javax.persistence.GeneratedValue
import java.lang.Long
import javax.persistence.Entity

import scala.beans.BeanProperty
import org.hibernate.validator.constraints.NotEmpty

import scala.annotation.meta.field
/**
 * 
 * Author: Gaurav Karale
 * version 1.0.0
 * Date :- 07/09/2017
 * Info :- Phone bean 
 * */
@Entity
class Phone(@(Id @field) @(GeneratedValue @field) @BeanProperty var id: Long,
            @BeanProperty @(NotEmpty @field) var name: String,
            @BeanProperty @(NotEmpty @field) var homeNumber: String,
            @BeanProperty @(NotEmpty @field) var cellPhone: String) {

  def this() = this(null, null, null, null)
}
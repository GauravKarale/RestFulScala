package com.dexcom.service

import org.springframework.data.repository.CrudRepository
import java.lang.Long
import com.dexcom.model.Phone
import org.springframework.stereotype.Repository
@Repository("phoneRepo")
trait PhoneRepository extends CrudRepository[Phone, Long]
package com.ivoronline.compose_db_update

import kotlinx.coroutines.*

class PersonRepository(private val productDao: PersonDao) {

  //PROPERTIES
  private val coroutineScope = CoroutineScope(Dispatchers.Main)

  //INSERT PERSON
  fun insertPerson(person: Person) {
    coroutineScope.launch(Dispatchers.IO) {
      productDao.insertPerson(person)
    }
  }

  //DELETE PERSON
  fun deletePerson(name: String) {
    coroutineScope.launch(Dispatchers.IO) {
      productDao.deletePerson(name)
    }
  }

  //UPDATE PERSON
  fun updatePerson(person: Person) {
    coroutineScope.launch(Dispatchers.IO) {
      productDao.updatePerson(person)
    }
  }

}


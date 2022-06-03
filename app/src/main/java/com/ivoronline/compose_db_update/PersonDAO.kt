package com.ivoronline.compose_db_update

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PersonDao {

  //INSERT PERSON
  @Insert
  fun insertPerson(product: Person)

  //DELETE PERSON
  @Query("DELETE FROM person WHERE name = :name")
  fun deletePerson(name: String)

  //UPDATE PERSON
  @Update
  fun updatePerson(person: Person)

}



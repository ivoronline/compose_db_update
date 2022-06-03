package com.ivoronline.compose_db_update

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity()
class Person {

  //====================================================================
  // PROPERTIES
  //====================================================================
  @PrimaryKey(autoGenerate = true)
  var id  : Int    = 0
  var name: String = ""
  var age : Int    = 0

  //====================================================================
  // CONSTRUCTORS
  //====================================================================
  constructor() {}

  //FOR INSERT
  constructor(name: String, age: Int) {
    this.name = name
    this.age  = age
  }

  //FOR UPDATE
  constructor(id:Int, name: String, age: Int) {
    this.id   = id
    this.name = name
    this.age  = age
  }

}

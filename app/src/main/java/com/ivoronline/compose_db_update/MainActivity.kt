package com.ivoronline.compose_db_update

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

lateinit var viewModel: MyViewModel

//===============================================================================
// MAIN ACTIVITY
//===============================================================================
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    viewModel = MyViewModel(applicationContext as Application)
    setContent {
      ScreenSetup()
    }
  }
}

//===============================================================================
// SCREEN SETUP
//===============================================================================
@Composable
fun ScreenSetup() {
  Column {

    Button({ viewModel.insertPerson(Person("Bill", 20)) }) { Text("Insert Person"    ) }
    Button({ viewModel.deletePerson("Bill")             }) { Text("Delete Person"    ) }

    Button({
      viewModel.person = Person(1, "Bill New", 200)
      viewModel.updatePersonById(viewModel.person!!)
    }) {
      Text("Edit Person by ID: " + viewModel.person?.name)
    }

  }
}

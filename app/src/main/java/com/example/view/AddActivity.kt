package com.example.view

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.model.UserDataPresenter
import com.example.model.UserDataPresenterImpl
import com.example.userlist.R

class AddActivity: AppCompatActivity() {

    val editUserName by lazy {
        findViewById<EditText>(R.id.add_user_name)
    }

    val editUserNumber by lazy {
        findViewById<EditText>(R.id.add_user_mobile_number)
    }
    val editUserEmail by lazy {
        findViewById<EditText>(R.id.add_user_email)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        val saveButton = findViewById<Button>(R.id.save_user)
        saveButton.setOnClickListener {


        }
    }

}
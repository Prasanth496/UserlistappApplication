package com.example.userlist.model

import com.example.model.User
import com.example.model.UserDataPresenter
import com.example.model.UserDataPresenterImpl
import org.junit.Assert
import org.junit.Test

class UserDataPresenterTest {

    lateinit var userDataPresenter: UserDataPresenter

    // test for able to add user to UI
    @Test
    fun ShouldBeAbleToAddUserToUI() {
        val userDataPresenter: UserDataPresenter = UserDataPresenterImpl()
        val user = User("Pavan", mobileNumber = "9543216423",email = "pavan123@gmail.com")
        userDataPresenter.initAddUserUI(user)
        Assert.assertTrue(userDataPresenter.initAddUserUI(user))
    }
}
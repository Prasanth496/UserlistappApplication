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
        val user = User("Pavan", mobileNumber = "9543216423", email = "pavan123@gmail.com")
        userDataPresenter.initAddUserUI(user)
        Assert.assertTrue(userDataPresenter.initAddUserUI(user))
    }

    // test for able to add two users to UI
    @Test
    fun ShouldBeAbleToAddTwoUsersToUI() {
        val userDataPresenter: UserDataPresenter = UserDataPresenterImpl()
        val userOne = User("Pavan", mobileNumber = "9543216423", email = "pavan123@gmail.com")
        val userTwo = User("Ravi", mobileNumber = "9645432532",email = "ravi234@gmail.com")
        userDataPresenter.initAddUserUI(userOne)
        userDataPresenter.initAddUserUI(userTwo)
        Assert.assertTrue(userDataPresenter.initAddUserUI(userOne))
        Assert.assertTrue(userDataPresenter.initAddUserUI(userTwo))
    }
}
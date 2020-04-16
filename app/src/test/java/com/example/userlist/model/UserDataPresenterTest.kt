package com.example.userlist.model

import com.example.model.User
import com.example.model.UserDataPresenter
import com.example.model.UserDataPresenterImpl
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class UserDataPresenterTest {

    lateinit var userDataPresenter: UserDataPresenter

    @Before
    fun setUp() {
        userDataPresenter = UserDataPresenterImpl()
    }


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

    // test for able add user to list
    @Test
    fun ShouldBeAbleToAddUserToList() {
        val userDataPresenter: UserDataPresenter = UserDataPresenterImpl()
        val user = User("Pavan", mobileNumber = "9543216423", email = "pavan123@gmail.com")
        userDataPresenter.saveUserToList(user)
        Assert.assertTrue(userDataPresenter.saveUserToList(user))
    }

    // test for should be able to add two users to list
    @Test
    fun ShouldBeAbleToAddTwoUsersToList() {
        val userDataPresenter: UserDataPresenter = UserDataPresenterImpl()
        val userOne = User("Pavan", mobileNumber = "9543216423", email = "pavan123@gmail.com")
        val userTwo = User("Ravi", mobileNumber = "9645432532", email = "ravi234@gmail.com")
        Assert.assertTrue(userDataPresenter.saveUserToList(userOne))
        Assert.assertTrue(userDataPresenter.saveUserToList(userTwo))
    }

    // test for to add userdetails to UI
    @Test
    fun ShouldBeAbleToAddUserDetailsToUI() {
        val userDataPresenter: UserDataPresenter = UserDataPresenterImpl()
        val user = User("Pavan", mobileNumber = "9543216423", email = "pavan123@gmail.com")
        userDataPresenter.initDetailUI(user)
        Assert.assertTrue(userDataPresenter.initDetailUI(user))
    }

    // test for to add two userdetails to UI
    @Test
    fun ShouldBeAbleToAddTwoUserDetailsToUI() {
        val userDataPresenter: UserDataPresenter = UserDataPresenterImpl()
        val userOne = User("Pavan", mobileNumber = "9543216423", email = "pavan123@gmail.com")
        val userTwo = User("Ravi", mobileNumber = "9645432532", email = "ravi234@gmail.com")
        Assert.assertTrue(userDataPresenter.initDetailUI(userOne))
        Assert.assertTrue(userDataPresenter.initDetailUI(userTwo))
    }

    @After
    fun tearDown() {
        userDataPresenter.onDeleteButtonClick()
    }
}
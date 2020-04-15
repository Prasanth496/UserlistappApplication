package com.example.userlist.model

import com.example.model.User
import com.example.model.UserDataManager
import com.example.model.UserDataManagerImpl
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class UserDataManagerTest {

    lateinit var userDataManager : UserDataManager

    @Before
    fun setUp() {
        userDataManager = UserDataManagerImpl()
    }

    // test for insert one user
    @Test
    fun ShouldBeAbleToInsertOneUser() {
        val userDataManager: UserDataManager = UserDataManagerImpl()
        val user = User("Pavan", mobileNumber = "9543216423",email = "pavan123@gmail.com")
        val userListSizeBeforeAdd : Int = userDataManager.readUsers().size
        userDataManager.insertUser(user)
        Assert.assertEquals(userListSizeBeforeAdd + 1, userDataManager.readUsers().size)

    }
    // test for insert two users
    @Test
    fun ShouldBeAbleToInsertTwoUsers() {
        val userDataManager: UserDataManager= UserDataManagerImpl()
        val userOne = User("Pavan", mobileNumber = "9543216423",email = "pavan123@gmail.com")
        val userTwo = User("Ravi", mobileNumber = "9645432532",email = "ravi234@gmail.com")
        val userListSizeBeforeAdd = userDataManager.readUsers().size
        userDataManager.insertUser(userOne)
        userDataManager.insertUser(userTwo)
        Assert.assertEquals(userListSizeBeforeAdd + 2, userDataManager.readUsers().size)
    }

    // test for insert users with same email
    @Test
    fun ShouldNotBeAbleToInsertUsersWithSameEmail() {
        val userDataManager: UserDataManager= UserDataManagerImpl()
        val userOne = User("Pavan", mobileNumber = "9543216423",email = "pavan123@gmail.com")
        val userTwo = User("Ravi", mobileNumber = "9645432532",email = "pavan123@gmail.com")
        val userListSizeBeforeAdd = userDataManager.readUsers().size
        userDataManager.insertUser(userOne)
        Assert.assertFalse(userDataManager.insertUser(userOne))
        Assert.assertFalse(userDataManager.insertUser(userTwo))
    }

    //test for users with different email
   @Test
    fun ShouldBeAbleToInsertUsersWithDifferentEmail() {
        val userDataManager: UserDataManager = UserDataManagerImpl()
        val userOne = User("Pavan", mobileNumber = "9543216423", email = "pavan123@gmail.com")
        val userTwo = User("Ravi", mobileNumber = "9645432532", email = "ravi432@gmail.com")
        val userListSizeBeforeAdd = userDataManager.readUsers().size
        userDataManager.insertUser(userOne)
        Assert.assertTrue(userDataManager.insertUser(userTwo))
    }
}
package com.example.userlist.model

import com.example.model.User
import com.example.model.UserDataManager
import com.example.model.UserDataManagerImpl
import org.junit.Assert
import org.junit.Test

class UserDataManagerTest {
    // function test for create user
    @Test
    fun ShouldBeableToInsertOneUser() {
        val userDatamanager: UserDataManagerImpl = UserDataManagerImpl()
        val user = User("Pavan", mobileNumber = "9543216423")
        Assert.assertTrue(userDatamanager.insertUser(user))

    }
}
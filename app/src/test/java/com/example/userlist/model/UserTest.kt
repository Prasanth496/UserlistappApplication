package com.example.userlist.model

import com.example.model.User
import org.junit.Assert
import org.junit.Test

class UserTest {
    @Test
    // function for null check
    fun givenUserOneAndNull_WhenEquals_ShouldNotBeEqual() {
        val userOne = User(name = "Pavan",mobileNumber = "9432567834",email = "pavan123@gmail.com")
        val userTwo = null
        Assert.assertFalse(userOne == userTwo)

    }

   @Test
    // function for reference check
    fun givenSameUser_WhenEquals_ShouldBeEqual() {
        val userOne = User(name = "Pavan",mobileNumber = "9543216423",email = "pavan123@gmail.com")
        Assert.assertTrue(userOne.equals(userOne))
    }

    @Test
    // function for values are equal check
    fun givenUserOneAndUserTwoWithSameDetails_Whenequals_ShouldBeEqual() {
        val userOne = User(name = "Pavan",mobileNumber = "9543216423",email = "pavan123@gmail.com")
        val userTwo = User(name = "Pavan",mobileNumber = "9543216423",email = "pavan123@gmail.com")
        Assert.assertTrue(userOne.equals(userTwo))
    }

    @Test
    //function for value are not equal check
    fun givenUserOneAndUserTwoWithDifferentDetails_Whenequals_ShouldNotBeEqual() {
        val userOne = User(name = "Pavan",mobileNumber = "9543216423",email = "pavan123@gmail.com")
        val userTwo = User(name = "Ravi",mobileNumber = "9645432532",email = "ravi234@gmail.com")
        Assert.assertFalse(userOne.equals(userTwo))
    }

    @Test
    // function for value and string check
    fun givenUserOneAndString_WhenEquals_ShouldNotBeEqual() {
        val userOne = User(name = "Pavan",mobileNumber = "9543216423",email = "pavan123@gmail.com")
        val userTwo = "Ravi"
        Assert.assertFalse(userOne.equals(userTwo))

    }
}
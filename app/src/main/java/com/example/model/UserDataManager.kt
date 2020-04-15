package com.example.model

interface UserDataManager {

    fun insertUser(user : User) : Boolean
    fun readUsers() : List<User>
    fun updateUser(userTwo : User) : Boolean
    fun deleteUsers()

}
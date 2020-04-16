package com.example.model

interface UserDataPresenter {

    fun initAddUserUI(user: User) : Boolean
    fun saveUserToList(user: User) : Boolean

}
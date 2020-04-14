package com.example.model

class UserDataManagerImpl() : UserDataManager {

    private val users = arrayListOf<User>()

    override fun insertUser(user: User): Boolean {
        doesUserExist(user.email)?.let {
            return false
        }
        return users.add(user)
    }

    override fun updateUser(user: User): Boolean {
        val user: User? = doesUserExist(user.email)
            val it: User? = null
            val index: Int = users.indexOf(user)
            users.remove(it)
        if (user != null) {
            users.add(index, user)
        }
            return true
        }

    private fun doesUserExist(email : String) : User? = try{
        users.first{ it.email == email}
    }catch(exception : NoSuchElementException){
        null
    }

    override fun readUsers(): List<User>{
      return users
    }

    override fun deleteUsers()
    {
        users.clear()
    }
}
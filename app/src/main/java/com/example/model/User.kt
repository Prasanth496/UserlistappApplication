package com.example.model

class User(val name : String, val mobileNumber : String, val email : String) {

   override fun equals(other: Any?): Boolean {
        if(other == null) return false
        if(other === this) return true
        if(other !is User) return false
         other as User
        return (other.name== this.name).and(other.mobileNumber==this.mobileNumber)

    }
}
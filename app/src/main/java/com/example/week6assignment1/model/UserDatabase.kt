package com.example.week6assignment1.model

var students = mutableListOf<User>(User("https://scontent.fktm7-1.fna.fbcdn.net/v/t1.0-9/119833808_2656811234567969_3796195083886734553_o.jpg?_nc_cat=100&ccb=2&_nc_sid=174925&_nc_ohc=NEiBpJ3edy0AX8r3ayF&_nc_ht=scontent.fktm7-1.fna&oh=ba82b14ef2aab8dbace6d74a7e6cb80d&oe=602638B6","Krishna Neupane","21","Male","Gongabu"))

class UserDatabase() {
   private val user1 = User("https://scontent.fktm7-1.fna.fbcdn.net/v/t1.0-9/119833808_2656811234567969_3796195083886734553_o.jpg?_nc_cat=100&ccb=2&_nc_sid=174925&_nc_ohc=NEiBpJ3edy0AX8r3ayF&_nc_ht=scontent.fktm7-1.fna&oh=ba82b14ef2aab8dbace6d74a7e6cb80d&oe=602638B6","Krishna Neupane","21","Male","Gongabu")



    fun getStudent():MutableList<User>
    {
        return students
    }
}


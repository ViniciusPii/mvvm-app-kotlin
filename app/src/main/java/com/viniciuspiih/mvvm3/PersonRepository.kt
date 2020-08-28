package com.viniciuspiih.mvvm3

class PersonRepository {

    fun login(name: String): Boolean {
        return name != ""
    }

}
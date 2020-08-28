package com.viniciuspiih.mvvm3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var mRepository = PersonRepository()

    private var mLogin = MutableLiveData<Boolean>()
    var login = mLogin

    fun login(name: String) {
        mLogin.value = mRepository.login(name)
    }

}
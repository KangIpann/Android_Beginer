package com.example.modulfragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    val name: LiveData<String>
        get() = mName
    fun setName(name: String) {
        mName.value = name
    }
}
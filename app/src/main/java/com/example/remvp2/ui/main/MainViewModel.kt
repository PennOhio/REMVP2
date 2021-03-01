package com.example.remvp2.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.remvp2.repository.PropertyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

//@HiltViewModel
class MainViewModel : ViewModel() {

    private var _address = MutableLiveData<String>("ViewModel Stock")

    val address: LiveData<String>
        get() = _address

    var newAddress = "ViewModel Changed"

    fun updateAddress() {
        _address.setValue(newAddress)
    }





}
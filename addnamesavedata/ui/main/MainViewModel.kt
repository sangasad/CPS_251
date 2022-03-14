package com.ebookfrenzy.addnamesavedata.ui.main

import android.icu.lang.UCharacter
import android.provider.Contacts.SettingsColumns.KEY
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MainViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {
    // TODO: Implement the ViewModel

    private var name = ""
    private var txtInput = ""
    var myName:MutableLiveData<String> = MutableLiveData()
    var yourName:MutableLiveData<String> = MutableLiveData()

    /*
    fun receiveName()
    {
        myName.let {
            if(!it.value.equals(""))
            {
                yourName.value = it.value.toString()
            }
            else
            {
                yourName.value = "No names entered"
            }
        }
    }*/


    fun setName(value: String) {
        this.txtInput = value
        name = value
    }

    fun getName(): String {
        return name
    }

}
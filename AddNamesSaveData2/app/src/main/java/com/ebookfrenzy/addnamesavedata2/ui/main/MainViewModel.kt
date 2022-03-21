package com.ebookfrenzy.addnamesavedata2.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData


class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    var txtInput: MutableLiveData<String> = MutableLiveData()
    var nameResult: MutableLiveData<String> = MutableLiveData()

    fun addNames()
    {
        txtInput.let {
            if (!it.value.equals(""))
            {
                nameResult.value +=  it.value?.toString() + "\n"
            }
            else
            {
                nameResult.value = "Please enter names"
            }
        }
    }
}

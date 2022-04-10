package id.ac.polbeng.mylistprogrammingapp.viewmodel

import androidx.lifecycle.ViewModel
import id.ac.polbeng.mylistprogrammingapp.model.Programming
import id.ac.polbeng.mylistprogrammingapp.model.ProgrammingData

class ProgrammingViewModel : ViewModel(){
    private val _data = ProgrammingData.listData
    val data : List<Programming> = _data
    private lateinit var item : Programming

    fun getItemProgramming(name: String) : Programming{
        for (i in _data){
            if (name == i.name){
                item = i
            }
        }
        return item
    }
}
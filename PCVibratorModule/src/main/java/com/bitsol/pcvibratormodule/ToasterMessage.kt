package com.bitsol.pcvibratormodule

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    fun print(context: Context,message:String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}
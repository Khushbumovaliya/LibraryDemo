package com.myaarlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void displayToast(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
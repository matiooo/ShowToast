package com.example.showtoast;

import android.content.Context;
import android.widget.Toast;

public class ToastMatiooo {

    public static void ShowToast(Context ctx,String text)
    {
        Toast.makeText(ctx,text,Toast.LENGTH_LONG).show();
    }
}

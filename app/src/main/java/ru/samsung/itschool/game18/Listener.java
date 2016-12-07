package ru.samsung.itschool.game18;


import android.graphics.Color;
import android.view.View;

public class Listener implements View.OnClickListener{
    int b = 1;
    @Override
    public void onClick(View v) {
        b += 15;
        v.setBackgroundColor(Color.argb(255,0,0,b));
    }
}

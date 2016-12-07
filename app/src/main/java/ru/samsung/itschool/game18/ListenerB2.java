package ru.samsung.itschool.game18;

import android.graphics.Color;
import android.view.View;

/**
 * Created by student2 on 15.11.16.
 */
public class ListenerB2 implements View.OnClickListener{
    int r = 1;
    @Override
    public void onClick(View v) {
        r += 15;
        v.setBackgroundColor(Color.argb(255,r,0,0));
    }
}

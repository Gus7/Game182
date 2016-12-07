package ru.samsung.itschool.game18;

import android.graphics.Color;
import android.view.View;

/**
 * Created by student2 on 15.11.16.
 */
public class LestenerB3 implements View.OnClickListener{
    int g = 1;
    @Override
    public void onClick(View v) {
        g += 15;
        v.setBackgroundColor(Color.argb(255,0,g,0));
    }
}

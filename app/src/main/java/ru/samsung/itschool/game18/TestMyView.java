package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

/**
 * Created by student2 on 18.11.16.
 */
public class TestMyView extends View implements CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener
{
    void start(Context context)
    {

        mouse = new Mouse[1];

        for (int i = 0; i < mouse.length; i++)
        {
            mouse[i] = new Mouse((float) Math.random()*500, (float) Math.random()*500, 1, context);
        }
    }



    public TestMyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        start(context);
    }
    Mouse[] mouse;
    int color = Color.YELLOW;
    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(color);
        for (int i = 0; i < mouse.length; i++)
        {
            mouse[i].draw(canvas);
            mouse[i].move(canvas);
        }
        this.invalidate();
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (appear) {
            for (int i = 0; i < mouse.length; i++) {
                mouse[i].toGo.set(event.getX(), event.getY());
            }

        }
        return true; // важна долгость касания
    }
    float px;
    float py;
    boolean appear = true;
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (buttonView == getRootView().findViewById(R.id.switch1)) {
            if (isChecked) color = Color.BLUE;
            else color = Color.YELLOW;
        }
        if (buttonView == getRootView().findViewById(R.id.checkBox)){

                if (isChecked == false){
                    for (int i = 0; i < mouse.length; i++) {
                        px = mouse[i].pos.x;
                        py = mouse[i].pos.y;
                        mouse[i].pos.set(-10000, -10000);
                        mouse[i].toGo.set(-10000, -10000);
                    }
                    appear = false;}
                else {
                    appear = true;
                    for (int i = 0; i < mouse.length; i++)
                    {
                        mouse[i].pos.set(px, py);
                        mouse[i].toGo.set(px, py);
                    }
                }
            }
        invalidate();
        }


    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        for (Mouse m : mouse)
        {
            m.size = 5*i;
        }
        /*
        for (Animal m : mouse)
        {
            if (m instanceof Mouse) ((Mouse)m).size = 500* (i + 100f)/100;
        }
        */

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}

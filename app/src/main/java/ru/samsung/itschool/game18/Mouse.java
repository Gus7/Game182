package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/**
 * Created by student2 on 08.11.16.
 */
public class Mouse extends Animal{

    Vector toGo = new Vector(500,500);

    Mouse(Context context)
    {
        super(context, R.drawable.mouse);
    }
    Mouse(float x, float y, float size, Context context)
    {
        super(x, y, size,context, R.drawable.mouse);
    }

    void move(Canvas canvas){
        Vector velocity = new Vector(toGo);
        velocity.sub(pos);
        velocity.mul((float)Math.random()/5);
        pos.sum(velocity);
    }

    /*
    boolean ifx = false;

    void move(Canvas canvas)
    {
        if (canvas.getWidth() - pic.getWidth()*size < pos.x){ifx = true;}
        else if (0 > pos.x){ifx = false;}
        if (ifx == false)
        {
            pos.x += 10;

        }
        else{
            pos.x -= 10;
        }
        canvas.drawBitmap(pic, pos.x, pos.y, paint);

    }
    */
}

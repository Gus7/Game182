package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;

public class Animal {
    Vector pos;
    float size;
    Bitmap pic;

    Animal(Context context, int picResId)
    {
        pos = new Vector(0, 0);
        size = 1;
        pic = BitmapFactory.decodeResource(context.getResources(), picResId);
    }

    Animal(float x, float y, float size, Context context, int picResId)
    {
        pos = new Vector (x, y);
        this.size = size;
        pic = BitmapFactory.decodeResource(context.getResources(), picResId);
    }
    Paint paint = new Paint();

    void draw(Canvas canvas)
    {
        float k = ((float)pic.getHeight()/pic.getWidth());
        RectF rect = new RectF(pos.x- pic.getWidth()*0.5f, pos.y- pic.getHeight()*0.5f,
                pos.x + size+500, pos.y + size * k+500 );

        canvas.drawBitmap(pic, null, rect, paint);
        /*Matrix m = new Matrix();
        m.postScale(size, size);
        m.postTranslate(pos.x, pos.y);
        canvas.drawBitmap(pic, pos.x  - pic.getWidth()*0.5f*size, pos.y - pic.getHeight()*0.5f*size, paint);*/

    }
    boolean ifx = true;
    void move(Canvas canvas)
    {

        if (canvas.getWidth() > pos.x && ifx == true){pos.x += 1;}
        else {
            pos.x -= 1;
            ifx = true;
        }
        canvas.drawBitmap(pic, pos.x, pos.y, paint);
    }

}

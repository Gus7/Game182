package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Cat extends Animal{
	Cat(Context context)
	{
		super(context, R.drawable.cat);
	}
	Cat(float x, float y, float size, Context context)
	{
		super(x, y, size,context, R.drawable.cat);
	}

	/*
	void move(Canvas canvas)
	{

		if (canvas.getWidth() > pos.x && ifx == true){pos.x += 1;}
		else {
			pos.x -= 1;
			ifx = false;
		}
		canvas.drawBitmap(pic, pos.x, pos.y, paint);
	}
	*/
}

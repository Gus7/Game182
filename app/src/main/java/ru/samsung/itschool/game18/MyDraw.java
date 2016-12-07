package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class MyDraw extends View{
	void start(Context context)
	{
		v = new Vector(50, 100);
		mouse = new Mouse[1];
		catOne = new Cat(550, 500, 1, context);
		for (int i = 0; i < mouse.length; i++)
		{
			mouse[i] = new Mouse((float) Math.random()*500, (float) Math.random()*500, 1, context);
		}
	}

	Vector v;

	public MyDraw(Context context, AttributeSet attrs) {
		super(context, attrs);
		start(context);

	}

	public MyDraw(Context context) {
		super(context);
		start(context);
	}
	Paint paint = new Paint();
	Cat catOne;
	Mouse[] mouse;
	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawColor(Color.BLUE);
		// TODO Auto-generated method stub
		canvas.drawLine(0, 0, v.x, v.y, paint);
		canvas.drawText(v.toString(), 50, 50, paint);
		catOne.draw(canvas);
		for (int i = 0; i < mouse.length; i++)
		{
			mouse[i].draw(canvas);
			mouse[i].move(canvas);
		}
		this.invalidate();
	}


	@Override
	public boolean onTouchEvent(MotionEvent event) {
		for (int i = 0; i < mouse.length; i++) {
			mouse[i].toGo.set(event.getX(), event.getY());
		}
		return false; //не важна долгость касания

	}
}

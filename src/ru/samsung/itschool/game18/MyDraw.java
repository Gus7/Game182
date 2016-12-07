package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class MyDraw extends View{
	Vector v = new Vector();

	public MyDraw(Context context) {
		super(context);
		v.set(100, 200);
	}
	Paint paint = new Paint();
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		canvas.drawLine(0, 0, v.x, v.y, paint);
		canvas.drawText(v.toString(), 50, 50, paint);
	}
	
	 

}

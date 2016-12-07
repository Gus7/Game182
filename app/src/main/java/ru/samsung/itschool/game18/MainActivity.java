package ru.samsung.itschool.game18;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends Activity implements View.OnClickListener {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		/*
		Switch s = (Switch)findViewById(R.id.switch1);
		CheckBox check = (CheckBox) findViewById(R.id.checkBox);
		SeekBar se = (SeekBar) findViewById(R.id.seekBar);
		TestMyView myView = (TestMyView)findViewById(R.id.view2);
		s.setOnCheckedChangeListener(myView);
		se.setOnSeekBarChangeListener(myView);
		check.setOnCheckedChangeListener(myView);
		/*Button b1 = (Button) findViewById(R.id.b1);
		b1.setOnClickListener(new ListenerB2());

		Button b2 = (Button) findViewById(R.id.b3);
		b2.setOnClickListener(new LestenerB3());
		*/
		Button b = (Button) findViewById(R.id.but);
		b.setOnClickListener(MainActivity.this);


	}


	@Override
	public void onClick(View v) {
		Intent intent = new Intent(MainActivity.this, Main2Activity.class);
		startActivity(intent);
	}
}





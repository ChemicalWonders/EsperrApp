package com.example.esperrapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}
	
	public void change_to_happy (View view){
		Intent intent = new Intent(this, ChangeToHappy.class);
		startActivity(intent);
	}
	
	public void change_to_sad (View view){
		Intent intent = new Intent(this, ChangeToSad.class);
		startActivity(intent);
	}
	
	public void change_to_angry (View view){
		Intent intent = new Intent(this, ChangeToAngry.class);
		startActivity(intent);
	}
	
	public void change_to_full (View view){
		Intent intent = new Intent(this, ChangeToFull.class);
		startActivity(intent);
	}
	
	
	public void quit_app (View view){
		finish();
	}

}

package com.example.progressdemo;

import view.CircularProgressBar;
import view.CircularProgressDrawable;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
	CircularProgressBar mProgressBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	/*	mProgressBar = (CircularProgressBar) findViewById(R.id.progress);
		((CircularProgressDrawable) mProgressBar.getIndeterminateDrawable())
				.start();*/
	}

}

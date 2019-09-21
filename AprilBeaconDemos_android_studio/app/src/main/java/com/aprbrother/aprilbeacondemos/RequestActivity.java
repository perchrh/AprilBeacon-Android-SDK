package com.aprbrother.aprilbeacondemos;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.aprbrother.aprilbeacondemo.R;

public class RequestActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_request);
		super.onCreate(savedInstanceState);
		init();
	}

	private void init() {
		String string = getIntent().getExtras().getString("string");
		
		TextView tv = findViewById(R.id.tv_request);
		
		tv.setText(string);
	}
}

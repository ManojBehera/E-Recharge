package com.samlei.easyrecharge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends Activity {

	Button btn;
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_up);

		tv = (TextView) findViewById(R.id.login);
		tv.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(SignUpActivity.this,
						LoginActivity.class);
				startActivity(intent);

			}
		});

	}

}

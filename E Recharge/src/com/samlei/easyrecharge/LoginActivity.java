package com.samlei.easyrecharge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {

	Button btn;
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_in);
		btn = (Button) findViewById(R.id.btn_login);
		tv = (TextView)findViewById(R.id.forgotpassword);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Login Button Clicked!", Toast.LENGTH_LONG).show();
			}
		});
		tv.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(LoginActivity.this,
						ForgotPasswordActivity.class);
				startActivity(intent);
			}
		});
	}

}

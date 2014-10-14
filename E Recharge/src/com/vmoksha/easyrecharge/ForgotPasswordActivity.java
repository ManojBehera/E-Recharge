package com.vmoksha.easyrecharge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ForgotPasswordActivity extends Activity {
	Button btn;
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reset_password);
		btn = (Button) findViewById(R.id.btn_reset_password);
		tv = (TextView) findViewById(R.id.link_sign_in);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ForgotPasswordActivity.this,
						PasswordResetConrfm.class);
				startActivity(intent);

			}
		});
		tv.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
//				finish();

			}
		});
	}
}

package com.vmoksha.easyrecharge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PasswordResetConrfm extends Activity {
	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reset_confirmation);
		btn = (Button) findViewById(R.id.back);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(PasswordResetConrfm.this,
						LoginActivity.class);
				startActivity(intent);

			}
		});
	}
}

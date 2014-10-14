package com.vmoksha.easyrecharge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class MainActivity extends ActionBarActivity {

	private ViewSwitcher viewSwitcher;
	private Animation slide_in_up, slide_out_down;
	private Button btnSignUp,btnRecharge;
	private TextView mTextViewTerm;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		
		mTextViewTerm = (TextView) findViewById(R.id.disclaimer);
		

		viewSwitcher = (ViewSwitcher) findViewById(R.id.view_switcher);

		slide_in_up = AnimationUtils.loadAnimation(this,
				R.anim.receipt_slide_in_up);
		slide_out_down = AnimationUtils.loadAnimation(this,
				R.anim.receipt_slide_out_down);

		viewSwitcher.setInAnimation(slide_in_up);
		viewSwitcher.setOutAnimation(slide_out_down);
		viewSwitcher.showNext();
		btnSignUp = (Button)findViewById(R.id.btn_sign_in_email);
		btnRecharge = (Button) findViewById(R.id.btn_sign_in_skip);
		mTextViewTerm.setText(Html.fromHtml(getString(R.string.lbl_disclaimer)));
		btnSignUp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,SignUpActivity.class);
				startActivity(intent);
				
			}
		});
		btnRecharge.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,RechargeActivity.class);
				startActivity(intent);
				
			}
		});
		

	}

}

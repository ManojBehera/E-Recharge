package com.samlei.easyrecharge;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class RechargeActivity extends Activity implements
		OnItemSelectedListener {

	private String[] operator = { "Select Operator", "Aircel,Airtel", "BSNL",
			"Tata Docomo GSM", "Idea", "Indicom Walky", "Loop Mobile",
			"MTNL Delhi", "Relience CDMA", "Relience GSM", "Tata Indicom",
			"Uninor", "Vodafone", "MTS", "Videocon Mobile", "Virgin GSM",
			"Virgin CDMA", "Tata DOCOMO CDMA", "T24", "MTNL Mumbai" };

	private Spinner spinnerOperator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recharge);

		spinnerOperator = (Spinner) findViewById(R.id.input_last_name);
		ArrayAdapter<String> adapter_state = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, operator);
		adapter_state
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerOperator.setAdapter(adapter_state);
		spinnerOperator.setOnItemSelectedListener(RechargeActivity.this);
	}

	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		spinnerOperator.setSelection(position);
		String selState = (String) spinnerOperator.getSelectedItem();
		Toast.makeText(getApplicationContext(), "Operator is: " + selState,
				Toast.LENGTH_LONG).show();
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}

}

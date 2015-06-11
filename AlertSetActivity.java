package com.huanleduo.birthday.activity;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

public class AlertSetActivity extends Activity {

    EditText minute;
    TextView text;
    EditText hour;
    TextView text1;
    EditText day;
    TextView text2;
    RelativeLayout rl0;
    CheckBox cb0;
    RelativeLayout rl1;
    CheckBox cb1;
    RelativeLayout rl3;
    CheckBox cb3;
    RelativeLayout rl7;
    CheckBox cb7;
    RelativeLayout rl15;
    CheckBox cb15;
    RelativeLayout rl30;
    CheckBox cb30;
    RelativeLayout rl_no;
    CheckBox cb_no;
    RelativeLayout rl_shuangli;
    TextView text1;
    CheckBox cb_shuangli;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alertset);
        
        initView();
	}

	private void initView() {
        minute = (EditText) findViewById(R.id.minute);
        text = (TextView) findViewById(R.id.text);
        hour = (EditText) findViewById(R.id.hour);
        text1 = (TextView) findViewById(R.id.text1);
        day = (EditText) findViewById(R.id.day);
        text2 = (TextView) findViewById(R.id.text2);
        rl0 = (RelativeLayout) findViewById(R.id.rl0);
        cb0 = (CheckBox) findViewById(R.id.cb0);
        rl1 = (RelativeLayout) findViewById(R.id.rl1);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        rl3 = (RelativeLayout) findViewById(R.id.rl3);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        rl7 = (RelativeLayout) findViewById(R.id.rl7);
        cb7 = (CheckBox) findViewById(R.id.cb7);
        rl15 = (RelativeLayout) findViewById(R.id.rl15);
        cb15 = (CheckBox) findViewById(R.id.cb15);
        rl30 = (RelativeLayout) findViewById(R.id.rl30);
        cb30 = (CheckBox) findViewById(R.id.cb30);
        rl_no = (RelativeLayout) findViewById(R.id.rl_no);
        cb_no = (CheckBox) findViewById(R.id.cb_no);
        rl_shuangli = (RelativeLayout) findViewById(R.id.rl_shuangli);
        text1 = (TextView) findViewById(R.id.text1);
        cb_shuangli = (CheckBox) findViewById(R.id.cb_shuangli);

	}

}

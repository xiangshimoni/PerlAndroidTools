package com.huanleduo.birthday;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

public class ChooseCityActivity extends Activity {

    TextView label1;
    Spinner chooseProvince;
    TextView label2;
    Spinner chooseCity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choose_city);
        
        initView();
	}

	private void initView() {
        label1 = (TextView) findViewById(R.id.label1);
        chooseProvince = (Spinner) findViewById(R.id.chooseProvince);
        chooseProvince.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //TODO 按钮点击处理
                
            }
        });
        label2 = (TextView) findViewById(R.id.label2);
        chooseCity = (Spinner) findViewById(R.id.chooseCity);
        chooseCity.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //TODO 按钮点击处理
                
            }
        });

	}

}

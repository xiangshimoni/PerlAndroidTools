package #PACKAGE_NAME#;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

public class #ACTIVITY_NAME# extends Activity {

#DEFINE_AREA#
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.#LAYOUT_NAME#);
        
        initView();
	}

	private void initView() {
#INIT_AREA#
	}

}

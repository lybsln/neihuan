package lyb.sln.neihan;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class NeiHanActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nei_han);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nei_han, menu);
		return true;
	}

}

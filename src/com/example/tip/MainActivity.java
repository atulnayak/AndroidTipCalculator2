package com.example.tip;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

	public void calculate(View view) {
		EditText et = (EditText)findViewById(R.id.billAmount);
		TextView tv = (TextView)findViewById(R.id.tipAmount);
		int id = view.getId();
		
		Button b10 = (Button)findViewById(R.id.button10);
		Button b15 = (Button)findViewById(R.id.button15);
		Button b20 = (Button)findViewById(R.id.button20);

		String s = et.getText().toString();
		float f = Float.valueOf(s).floatValue();
		
		if ( id == b10.getId() )
			f *= 0.1;
		if ( id == b15.getId() )
			f *= 0.15;
		if ( id == b20.getId() )
			f *= 0.2;
		
		tv.setText("$" + Float.toString(f));

	}

}

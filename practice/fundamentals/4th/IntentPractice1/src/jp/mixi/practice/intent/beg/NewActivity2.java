package jp.mixi.practice.intent.beg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class NewActivity2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activyty2);
    }
    @Override
    protected void onStart(){
    	super.onStart();
    Intent received = getIntent();
    String toastMessage = received.getStringExtra("toast_message");
    Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();
    }
}

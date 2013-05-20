package jp.mixi.assignment.test.target;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button verifyButton = (Button) findViewById(R.id.VerifyButton);
        EditText editText = (EditText) findViewById(R.id.IdentityEditor);
        verifyButton.setEnabled(false);

        editText.addTextChangedListener(new TextWatcher(){
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count){
                int length = s.length();
                if(length < 0 || length > 20){
                    verifyButton.setEnabled(false);
                }else{
                    verifyButton.setEnabled(true);
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}

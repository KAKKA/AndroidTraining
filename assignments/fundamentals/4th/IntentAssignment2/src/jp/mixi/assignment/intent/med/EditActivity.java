package jp.mixi.assignment.intent.med;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EditActivity extends Activity{    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        Button button = (Button) findViewById(R.id.Submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText = (TextView) findViewById(R.id.MyEdit);
                Intent intent = new Intent();
                intent.putExtra("editText", editText.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
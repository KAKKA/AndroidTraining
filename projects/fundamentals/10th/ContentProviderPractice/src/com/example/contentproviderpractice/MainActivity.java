
package com.example.contentproviderpractice;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Uri uri = Uri.parse("content://" + "jp.mixi.sample.contentprovider.Book" + "/book");
                TextView textView = (TextView) findViewById(R.id.text_view);
                Cursor cursor = getContentResolver().query(uri, null, null, null, null);
                while (cursor.moveToNext()) {
                    Log.d("unko", cursor.getString(cursor.getColumnIndexOrThrow("title")));
                    textView.setText(cursor.getString(cursor.getColumnIndexOrThrow("title")));
                }
                // 処理が完了したらCursorを閉じます
                cursor.close();
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

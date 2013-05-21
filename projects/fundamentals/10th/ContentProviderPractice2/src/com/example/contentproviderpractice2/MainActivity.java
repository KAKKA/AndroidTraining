
package com.example.contentproviderpractice2;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.contentproviderpractice2.*;
import com.example.contentproviderpractice2.R;

public class MainActivity extends Activity {


    @SuppressWarnings("unused")
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.Insert).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                insert();
            }
        });
    }

    private void insert() {
        ContentValues values = new ContentValues();
        for (int i = 0; i < 3; i++) {
            values.clear();
            values.put(Voice.COLUMN_NAME_VOICE_BODY, "BODY" + i);
            values.put(Voice.COLUMN_NAME_VOICE_PUBLISHER, "PUBLISHER" + i);
            values.put(Voice.COLUMN_NAME_VOICE_PRICE, "PRICE" + i);

            Uri insert = getContentResolver().insert(Voice.CONTENT_URI, values);
            Log.d(TAG, insert.toString());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}

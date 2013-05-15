package jp.mixi.practice.network.networkpractice2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import jp.mixi.practice.network.networkpractice2.R;
//import org.apache.http.client.methods.HttpGet;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View buttonGet = (Button)findViewById(R.id.buttonGet);

        buttonGet.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // http getの処理を書く
                EditText text = (EditText) findViewById(R.id.accessUrl);
                HttpClient client = new DefaultHttpClient();
                try {
                    HttpGet httpGet = new HttpGet("http://mixi.jp");
                    HttpResponse httpResponse = client.execute(httpGet);
                    if(httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(httpResponse.getEntity().getContent())
                                );
                        StringBuilder response = new StringBuilder();
                        String line;
                        while((line = reader.readLine()) != null) {
                            response.append(line);
                        }
                        reader.close();
                        text.setText(response.toString());
                    } else {
                        text.setText(httpResponse.getStatusLine().toString());
                    }
                }
         catch (IOException e) {
            e.printStackTrace();
        }

    }
});

View buttonPost = findViewById(R.id.buttonPost);
buttonPost.setOnClickListener(new OnClickListener() {

    public void onClick(View v) {
        // http postの処理を書く
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

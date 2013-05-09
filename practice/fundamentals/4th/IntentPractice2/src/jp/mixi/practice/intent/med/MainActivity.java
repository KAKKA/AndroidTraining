
package jp.mixi.practice.intent.med;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    public static final String ACTION_FIRST = "jp.mixi.practice.intent.med.android.intent.action.FIRST";
    public static final String ACTION_SECOND = "jp.mixi.practice.intent.med.android.intent.action.SECOND";
    public static final String ACTION_THIRD = "jp.mixi.practice.intent.med.android.intent.action.THIRD";
    private BroadcastReceiver mMyReceiver = new MyBroadcastReceiver();
    //(実習) 画面に複数のボタンが配置されています。
    //各ボタンのクリックイベントを拾う処理の中で、コメントに記述された Action を実行させるコードを書き、
    //そのIntentオブジェクトを受け取るためのBroadcastReceiverを作成し、AndroidManifest に記述してください。
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View button1 = findViewById(R.id.CallAction1);
        View button2 = findViewById(R.id.CallAction2);
        View button3 = findViewById(R.id.CallAction3);

        // TODO それぞれ、Broadcast を受け取ったら Log.v(String, String) を利用して、
        // ログ出力にどの Action を受信したかを表示する処理を書くこと
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO ここに、ACTION_FIRST を呼び出す処理を書く わかりました。
                Intent intentFirst = new Intent();
                intentFirst.putExtra("message", "11111111!!!!!!!");
                intentFirst.setAction(ACTION_FIRST);
                sendBroadcast(intentFirst);                
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO ここに、ACTION_SECOND を呼び出す処理を書く わかりました。
                Intent intentSecond = new Intent();
                intentSecond.putExtra("message", "22222222!!!!!!!");
                intentSecond.setAction(ACTION_SECOND);
                sendBroadcast(intentSecond);                

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO ここに、ACTION_THIRD を呼び出す処理を書く わかりました。
                Intent intentThird = new Intent();
                intentThird.putExtra("message", "3333333!!!!!!!");
                intentThird.setAction(ACTION_THIRD);
                sendBroadcast(intentThird);                

            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        // ACTION_PACKAGE_ADDED の Action を通す IntentFilter オブジェクトを作成
        IntentFilter filter = new IntentFilter(ACTION_FIRST);
        filter.addAction(ACTION_SECOND);
        filter.addAction(ACTION_THIRD);
        Toast.makeText(this, "receiverrrrr", Toast.LENGTH_SHORT).show();
        // MyBroadcastReceiver オブジェクトを、指定した IntentFilter オブジェクトで、Activity の Context に登録
        registerReceiver(mMyReceiver, filter);
    }
}
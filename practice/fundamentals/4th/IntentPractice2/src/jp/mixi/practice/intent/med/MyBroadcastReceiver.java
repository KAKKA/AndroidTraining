package jp.mixi.practice.intent.med;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Log.e("message", intent.getStringExtra("message"));
        Toast.makeText(context, intent.getStringExtra("message"), Toast.LENGTH_SHORT).show();
    }

}

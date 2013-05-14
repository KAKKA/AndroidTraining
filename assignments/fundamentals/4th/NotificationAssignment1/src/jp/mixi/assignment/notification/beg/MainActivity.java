
package jp.mixi.assignment.notification.beg;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;

import jp.mixi.assignment.*;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent = new Intent(this, SubActivity.class);
        final PendingIntent activityIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        final NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

        View button = findViewById(R.id.sikko);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO ここで通知を表示する

                // PendingIntent オブジェクトの生成。このオブジェクトを他のアプリに渡すことで、引数に渡した Intent の送信を委ねることができる
                // PendingIntent は、Intent の送信先のコンポーネントの種類によって使い分けること
                Notification notification = builder.setWhen(System.currentTimeMillis())
                        .setContentTitle("unko")
                        .setContentText("どぅえええ！？")
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setTicker("おんどれあ　やんのかこらあ　ぶっ殺す！")
                        .setContentIntent(activityIntent)
                        .setOnlyAlertOnce(false)
                        .setDefaults(Notification.DEFAULT_VIBRATE)
                        .setAutoCancel(true)
                        .build();

                NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(0, notification);
            }
        });
    }
}
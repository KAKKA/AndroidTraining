package jp.mixi.sample.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

public class BoundService extends Service {
    public static final String TAG = BoundService.class.getSimpleName();
    private final IBinder mBinder = new ServiceBinder();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.v(TAG, "onCreate");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        Log.v(TAG, "onRebind");
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.v(TAG, "onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "onDestroy");
    }

    public class ServiceBinder extends Binder {
        public BoundService getService() {
            return BoundService.this;
        }

        @Override
        protected boolean onTransact(int code, Parcel data, Parcel reply,
                int flags) throws RemoteException {
            Log.v(TAG, "onTransact");
            return super.onTransact(code, data, reply, flags);
        }
    }
}
//-----report-----
//
//(i)Started Service Controll
//[start]
//StartedService onCreate
//StartedService onStartCommand
//[start]
//StartedService onStartCommand
//[home]
// --
//[exit]
// --
//[stop]
//StartedService onDestroy
//
//(ii)Bound Service Controll
//[bind]
//BoundService onCreate
//MainActivity onServiceConnected
//[home]
// --
//[exit]
//BoundService onUnbind
//BoundService onDestroy
//[unbind]
//BoundService onUnbind
//BoundService onDestroy
//
//(iii)Intent Service Controll
//[Call IntentService]
//MyIntentService onCreate
//MyIntentService onStartCommand
//MyIntentService onHandleIntent
//MyIntentService onDestroy

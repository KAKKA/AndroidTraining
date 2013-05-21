
package com.example.contentproviderpractice2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class VoiceOpenHelper extends SQLiteOpenHelper {

    @SuppressWarnings("unused")
    private static final String TAG = VoiceOpenHelper.class.getSimpleName();

    // データーベースのバージョン
    // データベーススキーマを変える場合は、バージョンを上げること
    private static final int DATABASE_VERSION = 1;

    public static final String DATABASE_NAME = "Voice.db";

    private static final String Voice_TABLE_CREATE =
            "CREATE TABLE " + Voice.Voice_TABLE_NAME + " (" +
                    Voice._ID + " INTEGER PRIMARY KEY," +
                    Voice.COLUMN_NAME_VOICE_BODY + " TEXT NOT NULL, " +
                    Voice.COLUMN_NAME_VOICE_PUBLISHER + " TEXT, " +
                    Voice.COLUMN_NAME_VOICE_PRICE + " TEXT);";

    private static final String Voice_TABLE_DELETE =
            "DROP TABLE IF EXISTS " + Voice.Voice_TABLE_NAME;

    public VoiceOpenHelper(Context context) {
        // データベース名、バージョンを指定する
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // テーブル作成
        db.execSQL(Voice_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // ここでアップデート条件を判定する
        db.execSQL(Voice_TABLE_DELETE);
        onCreate(db);
    }

}

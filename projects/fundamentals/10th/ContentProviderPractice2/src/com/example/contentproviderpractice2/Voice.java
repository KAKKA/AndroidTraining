
package com.example.contentproviderpractice2;

import android.net.Uri;
import android.provider.BaseColumns;

public class Voice implements BaseColumns {

    @SuppressWarnings("unused")
    private static final String TAG = Voice.class.getSimpleName();

    // 一意となる識別子にする
    public static final String AUTHORITY = "com.example.contentproviderpractice2.Voice";

    // Voiceテーブル用のConentURI
    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/Voice");

    public static final int Voice = 1;

    public static final String Voice_TABLE_NAME = "Voice";

    public static final String COLUMN_NAME_VOICE_BODY = "body";
    public static final String COLUMN_NAME_VOICE_PUBLISHER = "publisher";
    public static final String COLUMN_NAME_VOICE_PRICE = "price";

    private String mBody;
    private String mPublisher;
    private int mPrice;

    public Voice(String body, String publisher, int price) {
        super();
        mBody = body;
        mPublisher = publisher;
        mPrice = price;
    }

    public String getBody() {
        return mBody;
    }

    public void setTitle(String body) {
        mBody = body;
    }

    public String getPublisher() {
        return mPublisher;
    }

    public void setPublisher(String publisher) {
        mPublisher = publisher;
    }

    public int getPrice() {
        return mPrice;
    }

    public void setPrice(int price) {
        mPrice = price;
    }

}

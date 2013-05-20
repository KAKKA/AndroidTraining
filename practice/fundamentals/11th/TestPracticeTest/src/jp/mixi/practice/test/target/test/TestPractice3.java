package jp.mixi.practice.test.target.test;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import jp.mixi.practice.test.target.TestTarget3;
import jp.mixi.practice.test.target.R;

// ActivityInstrumentationTestCase2 を継承して、機能テストを書く
public class TestPractice3 extends ActivityInstrumentationTestCase2<TestTarget3> {
    public TestPractice3(Class<TestTarget3> activityClass) {
        super(activityClass);
    }

    public TestPractice3() {
        this(TestTarget3.class);
    }

    public void testInitialStatus() throws Exception {
        // getActivity() の呼び出しで、テスト対象の Activity が立ち上がる
        Activity activity = getActivity();
        // UI 操作による View の状態を見るために、View のインスタンスを取り出す
        TextView title = (TextView) activity.findViewById(R.id.TitleLabel);
        TextView content = (TextView) activity.findViewById(R.id.ContentLabel);
        assertEquals(title.getText().toString(), "タイトル");
        assertEquals(content.getText().toString(), "本文");
    }
}
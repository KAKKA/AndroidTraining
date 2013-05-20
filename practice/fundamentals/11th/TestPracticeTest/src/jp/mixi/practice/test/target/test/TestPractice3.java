package jp.mixi.practice.test.target.test;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import com.jayway.android.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

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
        Solo solo = new Solo(getInstrumentation(), activity);

        TextView titleCounter = (TextView) activity.findViewById(R.id.TitleCounter);
        EditText titleEditor = (EditText) activity.findViewById(R.id.TitleEditor);
        TextView contentCounter = (TextView) activity.findViewById(R.id.ContentCounter);
        EditText contentEditor = (EditText) activity.findViewById(R.id.ContentEditor);

        solo.assertCurrentActivity("TestTarget3 now.", TestTarget3.class);
        solo.enterText(titleEditor, "うんこ");
        solo.enterText(contentEditor, "おじさんおじさん");
        solo.clickOnButton("完了");
        assertEquals("3 / 10", titleCounter.getText().toString());
        assertEquals("8 / 10000", contentCounter.getText().toString());
    }
}

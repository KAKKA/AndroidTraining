package jp.mixi.assignment.test.target.test;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;

import com.jayway.android.robotium.solo.Solo;

import jp.mixi.assignment.test.target.MainActivity;
import jp.mixi.assignment.test.target.R;


public class MainActivityInstrumentationTestCaseRobotium
extends ActivityInstrumentationTestCase2<MainActivity>{
    public MainActivityInstrumentationTestCaseRobotium() {
        this(MainActivity.class);
    }
    public MainActivityInstrumentationTestCaseRobotium(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    public void testUnkomark() throws Exception {
        Activity activity = getActivity();
        Solo solo = new Solo(getInstrumentation(), activity);
        
        EditText identityEditor = (EditText) activity.findViewById(R.id.IdentityEditor);
        Button verify = (Button) activity.findViewById(R.id.VerifyButton);

        assertNotNull(identityEditor);
        assertNotNull(verify);
        assertFalse(verify.isEnabled());

        solo.enterText(identityEditor, "うんこ");
        assertTrue(verify.isEnabled());
        solo.enterText(identityEditor, "うんこうんこうんこうんこうんこうんこうんこ");
        assertFalse(verify.isEnabled());
        

    }

}

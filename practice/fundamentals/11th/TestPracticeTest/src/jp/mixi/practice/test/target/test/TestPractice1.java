package jp.mixi.practice.test.target.test;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.test.AndroidTestCase;
import android.test.mock.MockContext;

import jp.mixi.practice.test.target.SubActivity;
import jp.mixi.practice.test.target.TestTarget1;

public class TestPractice1 extends AndroidTestCase {
    // startSubActivity() を呼び出すテスト
    public void testStartSubActivity() throws Exception {
        TestTarget1 target = new TestTarget1();
        // AndroidTestCase が持っている ActivityContext ではなく、自分でモックした Context
        target.startSubActivity(new TestTarget1Context(getContext()), "hogehogeなうんこ");
    }
    public void testisValidIntent() throws Exception {
        TestTarget1 target = new TestTarget1();
        Intent intent = new Intent();
        assertFalse(target.isValidIntent(intent));
        intent.putExtra(Intent.EXTRA_TEXT, "うんこ");
        assertFalse(target.isValidIntent(intent));
        intent.setData(Uri.parse("http://mixi.jp"));
        assertTrue(target.isValidIntent(intent));
    }

    // Context#startActivity() が、期待通りのコンポーネントに Intent を投げているかテストするための
    // MockContext
    private static class TestTarget1Context extends MockContext {
        private Context mContext;

        public TestTarget1Context(Context baseContext) {
            mContext = baseContext;
        }

        @Override
        public String getPackageName() {
            return mContext.getPackageName();
        }

        @Override
        public void startActivity(Intent intent) {
            // Intent から、Intent の送り先のコンポーネント情報を取り出して、期待値と一致するか確認する
            ComponentName component = intent.getComponent();
            assertEquals(SubActivity.class.getCanonicalName(), component.getClassName());
            // Extra に期待するものが有るか確認する
            assertEquals(intent.getStringExtra(Intent.EXTRA_SUBJECT), "hogehogeなうんこ");
            assertEquals(intent.getFlags(), Intent.FLAG_ACTIVITY_FORWARD_RESULT | Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            assertEquals(intent.getData(), Uri.parse("http://mixi.jp"));
        }
    }
}

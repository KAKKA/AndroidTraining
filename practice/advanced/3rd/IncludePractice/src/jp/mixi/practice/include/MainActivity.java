
package jp.mixi.practice.include;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
//(実習) include を使用したレイアウトを作成し、
//merge の有り無しで View の階層がどのようになるのかを Hierarchy View で確認してレポートしてください。

//mergeなしだと、LinearLayoutのタグが入り（includeするxmlをLinearLayoutで書いた）階層が一段階深くなった。
//mergeありだと、textViewと同じレイヤーにボタンが配置された

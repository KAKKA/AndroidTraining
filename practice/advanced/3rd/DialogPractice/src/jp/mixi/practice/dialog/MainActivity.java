
package jp.mixi.practice.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.show_practice_dialog).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showPracticeDialog();
            }
        });
    }

    private void showPracticeDialog() {
        // TODO:ダイアログを表示する処理を実装してください
        DialogFragment myDialogFragment = new PracticeDialogFragment();
        // 引数にFramentManagerとtagを設定します
        myDialogFragment.show(getSupportFragmentManager(), "practice_dialog_fragment");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    // TODO:独自DialogFragmentを実装してください
    public static class PracticeDialogFragment extends DialogFragment {
        /**
         * Dialogを使用して、コンテンツ領域に独自レイアウトは表示するサンプルです。
         */
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            // 独自のレイアウトをコンテンツ領域表示する場合、ここでViewをinfrateして返却する
            return inflater.inflate(R.layout.my_dialog_fragment, container, false);
        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Dialogを生成
            Dialog dialog = super.onCreateDialog(savedInstanceState);
            // タイトルを設定
            dialog.setTitle(R.string.paractice);
            return dialog;
        }

    }
}

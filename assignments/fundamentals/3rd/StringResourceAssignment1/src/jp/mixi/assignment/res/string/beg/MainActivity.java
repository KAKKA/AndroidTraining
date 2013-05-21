
package jp.mixi.assignment.res.string.beg;

import android.R.layout;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// TODO 1 個のものと、複数個のものの両方を並べて表示するため、両方用の TextView を取り出し、リソースへアクセスして表示する
		// フォーマットも定義する場合は、複数形のquantityを第2引数に渡し、フォーマットに当てはめる変数を第3引数以降に指定する
		String quantityOne = getResources().getQuantityString(R.plurals.my_apple, 1, 1);
		String quantityOther = getResources().getQuantityString(R.plurals.my_apple, 2, 2);
		TextView textView1 = (TextView)this.findViewById(R.id.PluralsTextForOne);
		TextView textView2 = (TextView)this.findViewById(R.id.PluralsTextForOther);
		textView1.setText(quantityOne);
		textView2.setText(quantityOther);
	}
}


package jp.mixi.practice.actionbar.beg;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.actionbarsherlock.app.SherlockActivity;

import android.os.Bundle;
import android.app.FragmentTransaction;

public class MainActivity extends SherlockActivity implements TabListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// タブナビゲーションモードに設定
		getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		// タブを作成して追加。タブの選択・解除・再選択をハンドリングするコールバックの TabListener をセットしないと実行時例外でクラッシュする
		getSupportActionBar().addTab(getSupportActionBar().newTab().setText("堀田").setTabListener(this));
		getSupportActionBar().addTab(getSupportActionBar().newTab().setText("佐野").setTabListener(this));
		getSupportActionBar().addTab(getSupportActionBar().newTab().setText("takeny").setTabListener(this));
	}
	
	// タブナビゲーションの Tab が選択された時のコールバック
	public void onTabSelected(Tab tab, FragmentTransaction ft) {

	}

	// タブナビゲーションの Tab が選択解除された時のコールバック
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {

	}

	// タブナビゲーションの Tab が再度選択された時のコールバック
	public void onTabReselected(Tab tab, FragmentTransaction ft) {

	}

	@Override
	public void onTabReselected(Tab tab,
			android.support.v4.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabSelected(Tab tab,
			android.support.v4.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabUnselected(Tab tab,
			android.support.v4.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

}

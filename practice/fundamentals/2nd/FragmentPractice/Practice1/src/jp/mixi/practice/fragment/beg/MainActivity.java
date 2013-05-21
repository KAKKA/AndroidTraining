package jp.mixi.practice.fragment.beg;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		FragmentManager manager = getSupportFragmentManager();
		// FragmentTransaction ���J�n
		FragmentTransaction transaction = manager.beginTransaction();

		// FragmentContainer �̃��C�A�E�g�ɁAMyFragment �������Ă�
		transaction.add(R.id.FragmentContainer, MyFragment.createInstance());

		// �ύX���m�肵�� FragmentTransaction ���I����
		transaction.commit();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}



package jp.mixi.assignment.controller.adv;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentButton extends Fragment {
	public FragmentButton() {}

	public static Fragment createInstance() {
		Fragment fragment = new FragmentButton();
		Bundle args = new Bundle();
		args.putString("var", "hoge");

		fragment.setArguments(args);

		return fragment;
	}
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_button, container, false);
        return view;
    }

}
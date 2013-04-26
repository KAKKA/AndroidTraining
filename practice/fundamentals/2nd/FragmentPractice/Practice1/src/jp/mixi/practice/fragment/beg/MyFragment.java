package jp.mixi.practice.fragment.beg;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends Fragment {
	public MyFragment() {}

	// ��������p�̃��\�b�h�BFragment �ɑ΂��鏉�����p�̈����͂����ŊǗ�����
	public static Fragment createInstance() {
		Fragment fragment = new MyFragment();
		// Fragment �ɓn���������l�߂��ރI�u�W�F�N�g
		Bundle args = new Bundle();
		args.putString("var", "hoge");

		// �l�ߍ��񂾃I�u�W�F�N�g�� Fragment �ɓn��
		fragment.setArguments(args);

		// �V�����C���X�^���X��Ԃ�
		return fragment;
	}
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // LayoutInflater �𗘗p���āA���C�A�E�g�����\�[�X�Ƃ��ēǂݍ���
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

}
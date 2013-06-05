package jp.mixi.practice.dialog.med;

<<<<<<< HEAD
=======
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
>>>>>>> dev12
import android.support.v4.app.DialogFragment;

/**
 * TODO: ダイアログで、はい・いいえ の選択肢を表示する
 * TODO: はい、を選択したら、リストの項目を削除する
 * @author keishin.yokomaku
 *
 */
public class ListItemSelectionDialogFragment extends DialogFragment {
<<<<<<< HEAD

=======
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
 
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("どぅええええええ！？");
        builder.setMessage("おじさんしますか！？");
        builder.setPositiveButton(android.R.string.ok, null);
        builder.setNegativeButton(android.R.string.cancel, null);
 
        return builder.create();
    }
 
>>>>>>> dev12
}
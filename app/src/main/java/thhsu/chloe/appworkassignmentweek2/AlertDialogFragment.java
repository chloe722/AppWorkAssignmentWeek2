package thhsu.chloe.appworkassignmentweek2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.app.DialogFragment;
import android.content.Context;


/**
 * Created by Chloe on 3/2/2018.
 */

public class AlertDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context) //Build dialog box
                //Delete (Builder.) setTitle and semicolon to chain together
                //Builder is created and configured all at the same time
                    .setTitle(context.getString(R.string.error_title)) // set dialog title
                    .setMessage(context.getString(R.string.error_message)) //set dialog message
                    .setPositiveButton(context.getString(R.string.error_ok), null); //Set listener as null when you dont want to o any specific action when the button is tapped and  just close the dialog

        AlertDialog dialog = builder.create();
        return dialog;
    }
}

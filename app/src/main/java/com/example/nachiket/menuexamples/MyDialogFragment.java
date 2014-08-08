package com.example.nachiket.menuexamples;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.widget.Toast;

/**
 * Created by Nachiket on 8/8/2014.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class MyDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());

        theDialog.setTitle("Sample Dialog");

        theDialog.setMessage("Hello i am a dialog box");

        theDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getActivity(),"Clicked", Toast.LENGTH_SHORT).show();

            }
        });

        theDialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Clicked CANCEL", Toast.LENGTH_SHORT).show();

            }
        });
        return super.onCreateDialog(savedInstanceState);
    }
}

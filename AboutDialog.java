package com.example.ya_.myapplication;
/*summber:https://github.com/itb-prd/membuat-aplikasi-android-dasar-yonasadiel*/
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class AboutDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());

        theDialog.setTitle("About");
        theDialog.setMessage("To Do List");
        theDialog.setPositiveButton("OK", null);

        return theDialog.create();
    }
}

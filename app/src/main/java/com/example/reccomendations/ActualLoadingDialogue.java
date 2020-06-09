package com.example.reccomendations;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class ActualLoadingDialogue {
    private Activity activity;
    private AlertDialog dialog;
    public ActualLoadingDialogue(Activity myActivity){
        activity = myActivity;
    }

    public void startLoadingAnimation(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.custom_dialouge, null));
        builder.setCancelable(false);

        dialog = builder.create();
        dialog.show();

    }

    public void dismissDialogue(){
        dialog.dismiss();
    }
}

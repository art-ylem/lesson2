package com.example.lesson2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public static void startActivity(Context activity) {
        Intent intent = new Intent(activity, SecondActivity.class);
//        intent.addFlags(activity instanceof Activity ? Intent.FLAG_ACTIVITY_CLEAR_TASK : Intent.FLAG_ACTIVITY_NEW_TASK);
//        intent.putExtra(SHOW_CARD_ACTIVATION_OR_INFO_POSTACTION, switchToCardActivationOrInfo);
        activity.startActivity(intent);
    }

}

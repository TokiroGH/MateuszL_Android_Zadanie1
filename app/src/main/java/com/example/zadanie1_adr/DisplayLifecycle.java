package com.example.zadanie1_adr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class DisplayLifecycle extends AppCompatActivity {

    public static String lifeCycleStates3;
    public static TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_lifecycle);

        textView = findViewById(R.id.lifeText);
        textView.setText(lifeCycleStates3);

    }


    @Override
    protected void onStart() {
        super.onStart();
        Date date = new Date();
        lifeCycleStates3 = lifeCycleStates3 + "\n" + date + ": Activiti has started";
        textView.setText(lifeCycleStates3);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Date date = new Date();
        lifeCycleStates3 = lifeCycleStates3 + "\n" + date + ": Activiti has stoped";
        textView.setText(lifeCycleStates3);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Date date = new Date();
        lifeCycleStates3 = lifeCycleStates3 + "\n" + date + ": Activiti has paused";
        textView.setText(lifeCycleStates3);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Date date = new Date();
        lifeCycleStates3 = lifeCycleStates3 + "\n" + date + ": Activiti has resumed";
        textView.setText(lifeCycleStates3);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Date date = new Date();
        lifeCycleStates3 = lifeCycleStates3 + "\n" + date + ": Activiti has destroed";
        textView.setText(lifeCycleStates3);
    }
}
package com.example.zadanie1_adr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.message_txt1);
        TextView emailRej = findViewById(R.id.emailRej);
        emailRej.setText(message);

        String message2 = intent.getStringExtra(MainActivity.message_txt2);
        TextView loginRej = findViewById(R.id.loginRej);
        loginRej.setText(message2);

        String message3 = intent.getStringExtra(MainActivity.message_txt3);
        TextView haslolRej = findViewById(R.id.hasloRej);
        haslolRej.setText(message3);


        boolean listbool1 = intent.getBooleanExtra(MainActivity.check_box1, true);
        //boolean listbool1 = this.getIntent().getBooleanExtra("CB1ID", false);
        CheckBox checkB1 = findViewById(R.id.checkBox3);
        checkB1.setChecked(listbool1);

        boolean listbool2 = intent.getBooleanExtra(MainActivity.check_box2, false);
        //boolean listbool1 = this.getIntent().getBooleanExtra("CB1ID", false);
        CheckBox checkB2 = findViewById(R.id.checkBox4);
        checkB2.setChecked(listbool2);

    }

    public void powrotDoMainActivity (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void zatwierdzDane (View view) {
        Intent intent = new Intent(this, DisplayLifecycle.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
package com.example.zadanie1_adr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public static final String message_txt1 = "email_text";
    public static final String message_txt2 = "login_text";
    public static final String message_txt3 = "haslo_text";
    public static final String check_box1 = "CB1ID";
    public static final String check_box2 = "CB2ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zatweirdzRejestracje (View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText email = (EditText) findViewById(R.id.email);
        String message = email.getText().toString();
        intent.putExtra(message_txt1, message);

        EditText login = (EditText) findViewById(R.id.login);
        String message2 = login.getText().toString();
        intent.putExtra(message_txt2, message2);

        EditText haslo = (EditText) findViewById(R.id.haslo);
        String message3 = haslo.getText().toString();
        intent.putExtra(message_txt3, message3);

        CheckBox checkB1 = findViewById(R.id.checkBox1);
        boolean check1 = checkB1.isChecked();
        intent.putExtra(check_box1, check1);

        CheckBox checkB2 = findViewById(R.id.checkBox2);
        boolean check2 = checkB2.isChecked();
        intent.putExtra(check_box2, check2);

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
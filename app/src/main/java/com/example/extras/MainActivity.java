package com.example.extras;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnClickListener  {
    EditText Login;
    Button Enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login = (EditText) findViewById(R.id.EditTxtLogin);
        Enter = (Button) findViewById(R.id.BtnEnter);
        Enter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,PasswordActivity.class);
        intent.putExtra("login",Login.getText().toString());
        startActivity(intent);
    }
}
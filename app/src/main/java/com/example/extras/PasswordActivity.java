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

public class PasswordActivity extends AppCompatActivity implements OnClickListener {
    EditText Password;
    Button Enter_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        Password = (EditText) findViewById(R.id.EditTxtPass);
        Enter_2 = (Button) findViewById(R.id.enter_2);
        Enter_2.setOnClickListener(this);
        Intent intent = getIntent();
        String login = intent.getStringExtra("login");
    }

    @Override
    public void onClick(View v) {
        Intent intent = getIntent();
        String login = intent.getStringExtra("login");
        Intent intent_2 = new Intent(this,NameActivity.class);
        intent_2.putExtra("login",login);
        intent_2.putExtra("password",Password.getText().toString());
        startActivity(intent_2);
    }
}
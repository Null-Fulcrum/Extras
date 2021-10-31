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

public class EmailActivity extends AppCompatActivity implements OnClickListener{
    EditText EditTextEmail;
    Button BtnEnter_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        EditTextEmail = (EditText) findViewById(R.id.EditTextEmail);
        BtnEnter_4 = (Button) findViewById(R.id.BtnEnter_4);
        BtnEnter_4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = getIntent();
        String login = intent.getStringExtra("login");
        String pass = intent.getStringExtra("password");
        String name = intent.getStringExtra("Name");
        Intent intent_4 = new Intent(this,UserInfoActivity.class);
        intent_4.putExtra("login",login);
        intent_4.putExtra("password",pass);
        intent_4.putExtra("name",name);
        intent_4.putExtra("email",EditTextEmail.getText().toString());
        startActivity(intent_4);
    }
}
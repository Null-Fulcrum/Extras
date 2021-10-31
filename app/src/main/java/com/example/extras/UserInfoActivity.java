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
import android.widget.TextView;

public class UserInfoActivity extends AppCompatActivity implements OnClickListener{
    TextView TextViewLogin;
    TextView TextViewPassword;
    TextView TextViewName;
    TextView TextViewEmail;
    Button BtnReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        TextViewLogin = (TextView) findViewById(R.id.TxtViewLogin);
        TextViewPassword = (TextView) findViewById(R.id.TxtViewPassword);
        TextViewName = (TextView) findViewById(R.id.TxtViewName);
        TextViewEmail = (TextView) findViewById(R.id.TxtViewEmail);
        Intent intent = getIntent();
        String logo = intent.getStringExtra("login");
        String pass = intent.getStringExtra("password");
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        TextViewLogin.setText("Your Logo: " + logo);
        TextViewPassword.setText("Your Password: " + pass);
        TextViewName.setText("Your Name: " + name);
        TextViewEmail.setText("Your Email: " + email);
        BtnReturn = (Button) findViewById(R.id.BtnReturn);
        BtnReturn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    Intent intent_5 = new Intent(this,MainActivity.class);
    startActivity(intent_5);
    }
}
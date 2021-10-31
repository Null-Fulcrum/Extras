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

public class NameActivity extends AppCompatActivity implements OnClickListener {
    EditText Name;
    Button enter_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        Name = (EditText) findViewById(R.id.EditTextName);
        enter_3 = (Button) findViewById(R.id.enter_3);
        enter_3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = getIntent();
        String login = intent.getStringExtra("login");
        String password = intent.getStringExtra("password");
        Intent intent_3 =  new Intent(this,EmailActivity.class);
        intent_3.putExtra("login",login);
        intent_3.putExtra("password",password);
        intent_3.putExtra("Name",Name.getText().toString());
        startActivity(intent_3);
    }
}
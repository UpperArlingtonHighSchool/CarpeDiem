package com.example.carpediem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class ResponderLogin extends AppCompatActivity {

    Map<String, String> userPass = new Hashtable<String, String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responder_login);
    }

    public void userLogin() {
        EditText userInfo  = (EditText) findViewById(R.id.username);
        EditText passwordInfo = findViewById(R.id.password);

        String username = userInfo.getText().toString();
        String password = passwordInfo.getText().toString();

    }

    public void addUser() {

    }
}
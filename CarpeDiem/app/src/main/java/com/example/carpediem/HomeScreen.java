package com.example.carpediem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }
    public void policeClick(View view) {
        Intent policeClick = new Intent(this, PoliceHelp.class);
        startActivity(policeClick);
    }

    public void ambulanceClick(View view) {
        Intent ambulanceClick = new Intent(this, AmbulanceHelp.class);
        startActivity(ambulanceClick);
    }

    public void fireClick(View view) {
        Intent fireClick = new Intent (this, FireHelp.class);
        startActivity(fireClick);
    }

    public void utilityClick (View view) {
        Intent utilityClick = new Intent (this, Utility.class);
        startActivity(utilityClick);
    }

    public void infoClick(View view) {
        Intent infoClick = new Intent (this, AboutCarpeDiem.class);
        startActivity(infoClick);
    }

    public void login(View view) {
        Intent login = new Intent(this, ResponderLogin.class);
        startActivity(login);
    }
}

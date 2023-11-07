package com.example.sportify;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.profile);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if (id == R.id.home) {
                    startActivity(new Intent(getApplicationContext(), MainApp.class));
                    overridePendingTransition(0, 0);
                    return true;
                } else if (id == R.id.timer) {
                    startActivity(new Intent(getApplicationContext(), timer.class));
                    overridePendingTransition(0, 0);
                    return true;
                }else if (id == R.id.profile){

                    return true;
                }
                return false;
            }
        });
    }
}
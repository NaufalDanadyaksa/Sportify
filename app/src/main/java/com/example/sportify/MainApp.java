package com.example.sportify;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if (id == R.id.home) {
                    return true;
                } else if (id == R.id.timer) {
                    startActivity(new Intent(getApplicationContext(), timer.class));
                    overridePendingTransition(0, 0);
                    return true;
                }else if (id == R.id.profile){
                    startActivity(new Intent(getApplicationContext(), profile.class));
                    overridePendingTransition(0, 0);
                    return true;
                }
                return false;
            }
        });
    }

    public void lari(View view) {
        String url="https://www.kompas.com/sports/read/2021/07/14/18000018/tips-lari-12-menit-tembus-3200-meter";
        Uri webpage= Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void renang(View view) {
        String url="https://www.kompas.com/sports/read/2021/07/16/10300098/tips-latihan-renang-untuk-pemula";
        Uri webpage= Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
    public void sepeda(View view) {
        String url="https://lifestyle.kompas.com/read/2020/08/29/200000520/6-tips-bersepeda-aman-di-jalan-raya-kamu-sudah-tahu-?utm_source=Whatsapp&utm_medium=Referral&utm_campaign=Bottom_Mobile";
        Uri webpage= Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
    public void gym(View view) {
        String url="https://health.kompas.com/read/23J02073100468/tak-perlu-malu-begini-tips-memulai-olahraga-di-gym-untuk-pemula";
        Uri webpage= Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}
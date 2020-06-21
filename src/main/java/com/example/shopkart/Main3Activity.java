package com.example.shopkart;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
private DrawerLayout mDrawerLayout;
private ActionBarDrawerToggle mToogle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        NotificationManager notificationManager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification notification= new Notification.Builder(Main3Activity.this)
        .setContentTitle("Shopkart")
                .setContentText("Thank you for Downloading the app")
                .setSmallIcon(R.drawable.thu)
                .setAutoCancel(true)
                .build();
        notificationManager.notify(4129,notification);
        CardView cv1, cv2, cv3;
        mDrawerLayout=(DrawerLayout) findViewById(R.id.ly);
        mToogle=new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToogle);
        mToogle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cv1 = findViewById(R.id.card_view4);
        cv3 = findViewById(R.id.card_view2);
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
        cv2 = findViewById(R.id.card_view5);
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }

    public void openActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
        finish();
    }
    public void openActivity3() {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
        finish();
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.abc, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        if(mToogle.onOptionsItemSelected(item)){
            return true;
        }
        switch (item.getItemId()) {
            case R.id.item3:
                Intent intent3 = new Intent(this, MainActivity.class);
                startActivity(intent3);
                return true;
            case R.id.item4:
                Intent intent1 = new Intent(this, Main4Activity.class);
                startActivity(intent1);
                return true;
            case R.id.item5:
                Intent intent2 = new Intent(this, Main5Activity.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
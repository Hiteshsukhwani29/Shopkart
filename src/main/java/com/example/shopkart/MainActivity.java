package com.example.shopkart;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import xyz.hanks.library.bang.SmallBangView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1,b2;

        final SmallBangView like_heart=findViewById(R.id.likeheart);
        like_heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(like_heart.isSelected()){
                    like_heart.setSelected(false);
                }
                else{
                    like_heart.setSelected(true);
                    like_heart.likeAnimation(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            super.onAnimationEnd(animation);
                        }
                    });
                }
            }
        });
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main8Activity.class);
                startActivity(intent);
            }
        });
        Button alertdialog = (Button) findViewById(R.id.button3);
        alertdialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
                adb.setTitle("Alert");
                adb.setMessage("Do you want to call?");
                adb.setCancelable(false);
                String yesButtonText = "Yes";
                String noButtonText = "No";
                adb.setPositiveButton(yesButtonText, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent Call_s1 = new Intent(Intent.ACTION_CALL);
                        Call_s1.setData(Uri.parse("tel:0"));

                        startActivity(Call_s1);
                    }
                });
                adb.setNegativeButton(noButtonText, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                adb.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.abc, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
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
            case R.id.item6:
                Intent intent4 = new Intent(this, Main7Activity.class);
                startActivity(intent4);
                return true;
            case R.id.item7:
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_TEXT, "Want to order online download now!!");
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Shopkart");
                startActivity(Intent.createChooser(sharingIntent, "Share Via"));
            default:
                return super.onOptionsItemSelected(item);
        }

    }
    }

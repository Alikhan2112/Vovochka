package com.example.myapplication;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity
{

    ImageView art;
    int[] drawable={R.drawable.art1,R.drawable.art2,R.drawable.art3,R.drawable.art4,R.drawable.art5,R.drawable.art6,R.drawable.art7,R.drawable.art8,R.drawable.art9,R.drawable.art10,R.drawable.art11,R.drawable.art12,R.drawable.art13,R.drawable.art14,R.drawable.art15,R.drawable.art16,R.drawable.art17,R.drawable.art18,R.drawable.art19,R.drawable.art20,R.drawable.art21,R.drawable.art22,R.drawable.art23,R.drawable.art24,R.drawable.art25,R.drawable.art26,R.drawable.art27,R.drawable.art28,R.drawable.art29,R.drawable.art30,R.drawable.art31,R.drawable.art32,R.drawable.art33,R.drawable.art34,R.drawable.art35,R.drawable.art36,R.drawable.art37,R.drawable.art38,R.drawable.art39,R.drawable.art40,R.drawable.art41,R.drawable.art42,R.drawable.art43,R.drawable.art44,R.drawable.art45,R.drawable.art46,R.drawable.art47,R.drawable.art48,R.drawable.art49,R.drawable.art50,R.drawable.art51,R.drawable.art52,R.drawable.art53,R.drawable.art54,R.drawable.art55};//картинки
    int i=0;

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        art = findViewById(R.id.imageView1);
        art.setOnClickListener(new View.OnClickListener() {//ствиг картинки

            @Override
            public void onClick(View p1) {
                i++;
                if (i == drawable.length) {//если закончатся картинки начнет показывать сначала
                    i = 0;
                }
                art.setImageResource(drawable[i]);
            }
        });
    }
}
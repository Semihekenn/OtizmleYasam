package com.balikesirbitirme.otizmleyasam.Gamepage.MathGamePage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.balikesirbitirme.otizmleyasam.R;

public class MathGameActivity extends AppCompatActivity {
    ImageView imgMain1, imgMain2, imgMain3, imgMain4;
    ImageView imgSelecter1,imgSelecter2,imgSelecter3,imgSelecter4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_game2);
        Init();
    }
    private void Init(){
        imgMain1=findViewById(R.id.math_Main_Img1);
        imgMain2=findViewById(R.id.math_Main_Img2);
        imgMain3=findViewById(R.id.math_Main_Img3);
        imgMain4=findViewById(R.id.math_Main_Img4);

        imgSelecter1=findViewById(R.id.math_Selecter_Img1);
        imgSelecter2=findViewById(R.id.math_Selecter_Img2);
        imgSelecter3=findViewById(R.id.math_Selecter_Img3);
        imgSelecter4=findViewById(R.id.math_Selecter_Img4);

    }
}

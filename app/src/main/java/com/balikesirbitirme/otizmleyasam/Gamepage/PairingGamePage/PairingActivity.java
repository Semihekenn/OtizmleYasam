package com.balikesirbitirme.otizmleyasam.Gamepage.PairingGamePage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ImageView;

import com.balikesirbitirme.otizmleyasam.R;

public class PairingActivity extends AppCompatActivity {
    ImageView imgMain;
    ImageView imgSelecter1,imgSelecter2,imgSelecter3,imgSelecter4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_pairing);

    }
    private void Init(){
        imgMain=findViewById(R.id.img_pairing_main);

        imgSelecter1=findViewById(R.id.img_pairing_selecter1);
        imgSelecter2=findViewById(R.id.img_pairing_selecter2);
        imgSelecter3=findViewById(R.id.img_pairing_selecter3);
        imgSelecter4=findViewById(R.id.img_pairing_selecter4);

    }
}

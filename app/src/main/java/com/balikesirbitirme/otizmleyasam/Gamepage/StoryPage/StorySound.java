package com.balikesirbitirme.otizmleyasam.Gamepage.StoryPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.balikesirbitirme.otizmleyasam.Gamepage.StoryPage.StoryAdapter.Story;
import com.balikesirbitirme.otizmleyasam.Gamepage.StoryPage.StoryAdapter.StoryDb;
import com.balikesirbitirme.otizmleyasam.R;

import java.io.IOException;

public class StorySound extends AppCompatActivity {
    int imgStory;
    String soundStory;
    MediaPlayer player;
    Context context=this;
    VideoView videoView;
    MediaController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//hikaye sadece yatayda çalışsın.
        setContentView(R.layout.activity_story_sound);
        Init();
        getData();




    }
    private void Init()
    {
        videoView=findViewById(R.id.videoView);
    }
    private void startVideo(){
        try {
            controller=new MediaController(getApplicationContext());

            Uri uri=Uri.parse(soundStory);
            videoView.setVideoURI(uri);
            //controller.setMediaPlayer(videoView);
            //controller.setAnchorView(videoView);
            //videoView.setMediaController(controller);
            //videoView.setVideoPath("URI");
            //videoView.setMediaController(controller);
            //controller.setAnchorView(videoView);
            videoView.start();
        }catch (Exception e){

        }
    }


    private void startSound(){
        player=new MediaPlayer();
        Uri uri=Uri.parse(soundStory);
        try
        {//çalıştı
            player.setDataSource(context,uri);
            player.setAudioStreamType(AudioManager.STREAM_ALARM);
            player.setLooping(true);
            player.prepare();
            player.start();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void getData(){
        Intent intent=getIntent();
       // imgStory=intent.getIntExtra(Story.KEY_İMG);
        soundStory=intent.getStringExtra(Story.KEY_SOUND);


    }

    @Override
    protected void onPause() {
        super.onPause();
        //player.pause();
        videoView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //startSound();
        startVideo();
    }
}

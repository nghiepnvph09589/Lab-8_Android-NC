package com.example.buoi15;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;

public class Mp3Activity extends AppCompatActivity {
    SeekBar seekBar;int duration;
    int currentTime;
    MediaPlayer mediaPlayer;
    String link;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp3);
        seekBar =(SeekBar) findViewById(R.id.seekBar);
        seekBar.setClickable(false);
        link = "https://data25.chiasenhac.com/downloads/2102/5/2101834/128/Buon%20Lam%20Chi%20Em%20Oi%20-%20Nguyen%20Minh%20Cuong.mp3";
        mediaPlayer = MediaPlayer.create(Mp3Activity.this, R.raw.buon);
    }

    public void MediaPlayer(View view){

//        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, Uri.parse(link));

        try {
            mediaPlayer.start();
            duration = mediaPlayer.getDuration();
            currentTime = mediaPlayer.getCurrentPosition();
            seekBar.setMax(duration);
            seekBar.setProgress( currentTime);
        }catch (Exception e){
            Log.e("A", e.toString());
        }
        currentTime = mediaPlayer.getCurrentPosition();
        seekBar.setProgress(currentTime);
        handler.postDelayed(update,100);



    }
    public void Pause(View view) {
        mediaPlayer.pause();
    }
    private Runnable update = new Runnable() {
        @Override
        public void run() {
            currentTime = mediaPlayer.getCurrentPosition();
            seekBar.setProgress(currentTime);
        }
    };
}
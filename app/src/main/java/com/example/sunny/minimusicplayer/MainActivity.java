package com.example.sunny.minimusicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button play,stop,pause;
    public MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (Button) findViewById(R.id.playMusic);
        pause = (Button) findViewById(R.id.pauseMusic);
        stop  = (Button) findViewById(R.id.stopMusic);

        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.songss);


    }

    public void playDemo(View view){
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
    }
    public void pauseDemo(View view){
        mediaPlayer.pause();
    }


    public void stopDemo(View view){
        if (mediaPlayer.isPlaying()){
            mediaPlayer.stop();
        }
        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.songss);
    }
}

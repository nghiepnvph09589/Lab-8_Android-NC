package com.example.buoi15;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.google.common.util.concurrent.ListenableFuture;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
//    private ImageView photo;
    int duration;
    int currentTime;
    private SeekBar seekBar;
    MediaPlayer mediaPlayer;
    String link;
    private Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        photo = findViewById(R.id.Photo);
//        seekBar =(SeekBar) findViewById(R.id.seekBar);
//        seekBar.setClickable(false);

//        link = "https://data25.chiasenhac.com/downloads/2102/5/2101834/128/Buon%20Lam%20Chi%20Em%20Oi%20-%20Nguyen%20Minh%20Cuong.mp3";
//        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.buon);
    }

    public void Camera(View view) {
//        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        if(takePictureIntent.resolveActivity(getPackageManager())!=null){
//            startActivityForResult(takePictureIntent,999);
//        }
        Intent intent = new Intent(MainActivity.this, MoCameraActivity.class);
        startActivity(intent);
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode==999 && resultCode==RESULT_OK){
//            Bundle extras = data.getExtras();
//            Bitmap imageBitmap = (Bitmap)extras.get("data");
//            photo.setImageBitmap(imageBitmap);
//        }
//    }

    public void MediaPlayer(View view){

//        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, Uri.parse(link));

//        try {
//            mediaPlayer.start();
//            duration = mediaPlayer.getDuration();
//            currentTime = mediaPlayer.getCurrentPosition();
//            seekBar.setMax(duration);
//            seekBar.setProgress( currentTime);
//        }catch (Exception e){
//            Log.e("A", e.toString());
//        }
//        currentTime = mediaPlayer.getCurrentPosition();
//        seekBar.setProgress(currentTime);
//        handler.postDelayed(update,100);
        Intent intent = new Intent(MainActivity.this, Mp3Activity.class);
        startActivity(intent);



    }

    public void cameraPreview(View view) {
//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) !=
//                PackageManager.PERMISSION_GRANTED) {
//            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CAMERA}, 888);
//        } else {
//            startCameraPreview();
//        }
        Intent intent = new Intent(MainActivity.this, CameraPreviewActivity.class);
        startActivity(intent);
    }

//    private PreviewView previewView;

//    private void startCameraPreview() {
//
//        previewView = findViewById(R.id.viewFinder);
//
//        final ListenableFuture instance = ProcessCameraProvider.getInstance(this);
//
//        instance.addListener(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    ProcessCameraProvider cameraProvider = (ProcessCameraProvider) instance.get();
//
//                    Preview preview = new Preview.Builder().build();
//                    preview.setSurfaceProvider(previewView.createSurfaceProvider());
//
//                    CameraSelector cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
//
//                    cameraProvider.unbindAll();
//
//                    cameraProvider.bindToLifecycle((LifecycleOwner) MainActivity.this, cameraSelector, preview);
//
//                } catch (ExecutionException e) {
//                    e.printStackTrace();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }, ContextCompat.getMainExecutor(this));
//
//
//    }

//    public void Pause(View view) {
//        mediaPlayer.pause();
//    }
//    private Runnable update = new Runnable() {
//        @Override
//        public void run() {
//            currentTime = mediaPlayer.getCurrentPosition();
//            seekBar.setProgress(currentTime);
//        }
//    };
}
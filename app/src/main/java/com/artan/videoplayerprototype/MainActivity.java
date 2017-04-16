package com.artan.videoplayerprototype;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    Button mBtnStart;
    VideoView mVidV;
    MediaController mMediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnStart = (Button)findViewById(R.id.btn_start);
        mVidV = (VideoView)findViewById(R.id.vid_v);
        mMediaController = new MediaController(this);

        mBtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String videoPath = "android.resource://com.artan.videoplayerprototype/"+R.raw.noizy;
                Uri uri = Uri.parse(videoPath);

                mVidV.setVideoURI(uri);
                mVidV.setMediaController(mMediaController);
                mMediaController.setAnchorView(mVidV);
                mVidV.start();


            }
        });
    }
}

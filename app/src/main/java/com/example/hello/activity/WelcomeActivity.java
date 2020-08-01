package com.example.hello.activity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hello.R;
import com.example.hello.widget.CustomVideoView;

public class WelcomeActivity extends BaseActivity {
    private Button welcomebutton;
    private CustomVideoView videoview;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcom_activity);
        welcomebutton = (Button)this.findViewById(R.id.welcome_button);
        videoview = (CustomVideoView)this.findViewById(R.id.welcome_videoview);
        videoview.setVideoURI(Uri.parse("android.resource://"+this.getPackageName()+"/"+R.raw.kr36));//为什么要这样写
        videoview.start();
        videoview.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {//这里设置的是循环播放
                videoview.start();
            }
        });
        welcomebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(videoview.isPlaying()){
                    videoview.stopPlayback();
                    videoview=null;
                }
                openActivity(MainActivity.class);
                WelcomeActivity.this.finish();
            }
        });

    }
    /*
    private  String getAppVersionName(Context context) {
        String versionName = "";
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(this.getPackageName(), 0);
            versionName = packageInfo.versionName;
            if (TextUtils.isEmpty(versionName)) {
                return "";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return versionName;
    }
    */
}


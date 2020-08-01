package com.example.hello.widget;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.VideoView;


/*
    自定义VideoView,实现全屏播放
 */

public class CustomVideoView extends VideoView {
    public CustomVideoView(Context context){
        super(context);
    }
    public CustomVideoView(Context context, AttributeSet attr){
        super(context, attr);
    }
    public CustomVideoView(Context context,AttributeSet attr,int defStyle){
        super(context,attr,defStyle);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec ,int heightMeasureSpec){
        int width = getDefaultSize(0,widthMeasureSpec);
        int height = getDefaultSize(0,heightMeasureSpec);
        setMeasuredDimension(width,height);
    }

    @Override
    public void setOnPreparedListener(MediaPlayer.OnPreparedListener listener){
        super.setOnPreparedListener(listener);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        return super.onKeyDown(keyCode,event);
    }
}

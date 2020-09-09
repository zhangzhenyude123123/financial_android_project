package com.example.hello.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;


public class BaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        //当系统版本为4.4或者4.4以上时可以使用沉浸式状态栏  这个直接使用就可以，这是系统默认的一种方法。
        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
         //   getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
         //   getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        //}
    }

    protected void openActivity(Class<?> some_class){//这里使用了类的泛化
        Intent intent = new Intent(this,some_class);
        this.startActivity(intent);//这样可以更方便的进行传递
    }
}

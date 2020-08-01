package com.example.hello.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

public class BaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

    }

    protected void openActivity(Class<?> some_class){//这里使用了类的泛化
        Intent intent = new Intent(this,some_class);
        this.startActivity(intent);
    }
}

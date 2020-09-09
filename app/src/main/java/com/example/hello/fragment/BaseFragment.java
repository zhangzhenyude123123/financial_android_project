package com.example.hello.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * Fragment基类，主要封装了一些Fragment的公共操作
 */
public class BaseFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState){
        return super.onCreateView(inflater,container,savedInstanceState);
    }
}

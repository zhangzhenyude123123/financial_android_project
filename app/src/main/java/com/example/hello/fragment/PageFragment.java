package com.example.hello.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hello.R;
import com.example.hello.common.DefineView;

public class PageFragment extends BaseFragment implements DefineView {
    private View view;
    private static final String KEY="EXTRA";
    //private CategoriesBean categoriesBean;//Class to hold title information
    private String message;
    private TextView tv_Page;
    public static PageFragment newInstance(String extra){
        Bundle bundle = new Bundle();
        bundle.putString(KEY,extra);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if(bundle != null){
            //categoriesBean =(CategoriesBean)bundle.getSerializable(KEY);
            message = bundle.getString(KEY);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(view==null){
            view=inflater.inflate(R.layout.page_fragment,container,false);
            initView();
            initValidata();
            initListener();
            bindData();
        }
        return view;
    }

    @Override
    public void initView() {
        tv_Page = (TextView)view.findViewById(R.id.tv_page);
        //tv_Page.setText(categoriesBean.getTitle());
        if(message!=null){
            tv_Page.setText(message);
        }
    }

    @Override
    public void initValidata() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void bindData() {

    }
}

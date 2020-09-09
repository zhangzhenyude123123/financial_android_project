package com.example.hello.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.viewpager.widget.ViewPager;

import com.example.hello.R;
import com.example.hello.adapter.FixedPagerAdapter;
import com.example.hello.common.DefineView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class MainInfoFragment extends BaseFragment implements DefineView {
    private View mView;
    private TabLayout tab_layout;
    private ViewPager info_viewpager;
    private FixedPagerAdapter fixedPagerAdapter;
    private List<BaseFragment>fragments;
    private String[] titles = new String[]{"全部","020","Fun","企业服务"};
    //private List<Fragment> fragments;
    //private static List<CategoriesBean> categoriesBeans = CategoryDataUtils.getCategoryBeans();
    private static final String KEY="EXTRA";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        if(mView==null){
            mView = inflater.inflate(R.layout.main_info_fragment,container,false);
            initView();
            initValidata();
            initListener();
            bindData();
        }
        return mView;
    }
    /*@Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        Bundle bundle = getArguments();
        if(bundle != null){
            categoriesBean = (CategoriesBean)bundle.getSerializable(KEY);
        }
    }
    */
    @Override
    public void initView() {
        //tv_page = (TextView)mView.findViewById(R.id.tv_page);
        //tv_page.setText(categoriesBean.getTitle());
        tab_layout =(TabLayout)mView.findViewById(R.id.tab_layout);
        info_viewpager = (ViewPager)mView.findViewById(R.id.info_viewpager);
    }

    @Override
    public void initValidata() {
        fixedPagerAdapter = new FixedPagerAdapter(getChildFragmentManager());
        //fixedPagerAdapter.setCategoriesBeans(categoriesBeans);
        //fragments = new ArrayList<Fragment>();
        fixedPagerAdapter.setTitles(titles);//传进文本信息
        fragments = new ArrayList<BaseFragment>();
        /*
        for(int i = 0;i<categoriesBeans.size();i++){
            fragments.add(PageFragment.newInstance(titles[i]));
        }*/
        for(int i=0;i<titles.length;i++){
            fragments.add(PageFragment.newInstance(titles[i]));
        }

        fixedPagerAdapter.setFragments(fragments);

        tab_layout.setTabMode(TabLayout.MODE_SCROLLABLE);
        info_viewpager.setAdapter(fixedPagerAdapter);
        tab_layout.setupWithViewPager(info_viewpager);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void bindData() {

    }
}

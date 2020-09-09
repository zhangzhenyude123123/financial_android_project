package com.example.hello.adapter;

import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.hello.fragment.BaseFragment;

import java.util.List;
/*
* 当前类注释:ViewPager Fragment自定义适配器，其中管理每个页面(Fragment集合)和Tab显示标题
*/

public class FixedPagerAdapter extends FragmentStatePagerAdapter {
    //private List<CategoriesBean> categoriesBeans;
    /*public void setCategoriesBeans(List<CategoriesBean>categoriesBeans){
        this.categoriesBeans = categoriesBeans;
    }
    */
    private String[]titles;//标题信息
    //private  List<Fragment>fragments;
    private List<BaseFragment>fragments;

    public void setTitles(String[]titles){
        this.titles = titles;
    }
    public void setFragments(List<BaseFragment>fragments){
        this.fragments = fragments;
    }
    public FixedPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }
    @Override
    public Fragment getItem(int position){
        return fragments.get(position);
    }
    @Override
    public int getCount(){
        return fragments.size();
    }

    @Override//这是一个固定写法
    public Object instantiateItem(ViewGroup container,int position){
        Fragment fragment = null;
        try{
            fragment = (Fragment)super.instantiateItem(container,position);
        }catch (Exception e){

        }
        return fragment;
    }

    @Override
    public void destroyItem(ViewGroup container,int position,Object object){

    }

    @Override
    public CharSequence getPageTitle(int position){
        //return categoriesBeans.get(position%categoriesBeans.size()).getTitle();
        return titles[position];
    }

}

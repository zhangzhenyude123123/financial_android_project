package com.example.hello.common;

/**
 * 所有的Activity，Fragment可以实现这个接口，来进行一些公共的操作
 *
 */
public interface DefineView {

    public void initView();//初始化页面数据
    public void initValidata();//初始化变量
    public void initListener();//初始化监听器
    public void bindData();//绑定数据
}

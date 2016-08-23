package com.z.zdev.views;

import com.z.zdev.bean.HomeBean;

/**
 * mvp 中的view
 */
public interface HomeDataView {

    /**
     * 加载
     */
    public void onLoad(HomeBean homeBean);

    /**
     * 更新
     */
    public void onRefresh();

    /**
     * 更新
     */
    public void onReset();

    /**
     * 提交
     */
    public void onCommit();


    /**
     * 显示错误
     *
     * @param msg
     */
    void showError(String msg);

    /**
     * 显示进度条
     */
    void showProgressDialog();

    /**
     * 隐藏进度条
     */
    void hideProgressDialog();

}

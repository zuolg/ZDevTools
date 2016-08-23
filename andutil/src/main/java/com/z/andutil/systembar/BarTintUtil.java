
package com.z.andutil.systembar;

import android.app.Activity;
import android.os.Build;

public class BarTintUtil {

    /**
     * 设置状态栏透明
     * @Title: setStatusBar
     * @Description: TODO
     * @param @param id    设定文件
     * @return void    返回类型
     */
   /* public void setStatusBar(Activity activity,int id)
    {
        if(Build.VERSION.SDK_INT >=14)
        {
            // 布局内容会从actionbar以下开始
            setFitsSystemWindows(true);

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                // 状态栏透明 需要在创建SystemBarTintManager 之前调用。
                setTranslucentStatus(true);
            }

            SystemBarTintManager tintManager = new SystemBarTintManager(activity);
            tintManager.setStatusBarTintEnabled(true);
            // 使StatusBarTintView 和 actionbar的颜色保持一致，风格统一。
            tintManager.setStatusBarTintResource(id);
            // 设置状态栏的文字颜色
            tintManager.setStatusBarDarkMode(false, activity);
        }
    }*/

}
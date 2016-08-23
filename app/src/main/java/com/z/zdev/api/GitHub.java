package com.z.zdev.api;

import com.z.zdev.bean.HomeBean;
import com.z.zdev.bean.UserBean;

import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Zz on 2016/3/28.
 */
public interface  GitHub {

    @GET("app/login/1")
    Call<UserBean> getUser();

    @GET("app/getAll/1")
    Call<HomeBean> getAllData();

    @GET("app/getAll/1")
    Observable<HomeBean> getAllDataObs();

}

package com.z.zdev.model;

import com.z.zdev.api.GitHubService;
import com.z.zdev.bean.HomeBean;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Zz on 2016/3/30.
 */
public class HomeDataModel {

    public void getHomeData(String phone, Subscriber<HomeBean> subscriber) {
        Observable<HomeBean> myObservable = Observable.create(new Observable.OnSubscribe<HomeBean>() {
            @Override
            public void call(Subscriber<? super HomeBean> subscriber) {
                Call<HomeBean> call = GitHubService.getService().getAllData();
                try {
                    Response<HomeBean> response = call.execute();
                    subscriber.onNext(response.body());
                } catch (IOException e) {
                    e.printStackTrace();
                    subscriber.onError(e);
                } finally {
                    subscriber.onCompleted();
                }
            }
        }).subscribeOn(Schedulers.io()) // 指定 subscribe() 发生在 IO 线程
                .observeOn(AndroidSchedulers.mainThread()); // 指定 Subscriber 的回调发生在主线程
        myObservable.subscribe(subscriber);
    }


    public void getHomeData2(String phone, Subscriber<HomeBean> subscriber) {
        Observable<HomeBean> myObservable = GitHubService.getService().getAllDataObs()
                .subscribeOn(Schedulers.io())// 指定 subscribe() 发生在 IO 线程
                .observeOn(AndroidSchedulers.mainThread()); // 指定 Subscriber 的回调发生在主线程

        myObservable.subscribe(subscriber);
    }

}

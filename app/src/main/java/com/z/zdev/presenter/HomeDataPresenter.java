package com.z.zdev.presenter;

import com.z.zdev.bean.HomeBean;
import com.z.zdev.model.HomeDataModel;
import com.z.zdev.views.HomeDataView;

import rx.Subscriber;

/**
 * Created by Zz on 2016/3/30.
 */
public class HomeDataPresenter {

    private HomeDataView homeDataView;
    private HomeDataModel homeDataModel;

    public HomeDataPresenter(HomeDataView homeDataView) {
        this.homeDataView = homeDataView;
        homeDataModel = new HomeDataModel();

    }

    public void getDataHome(String phone) {
        Subscriber<HomeBean> mySubscriber = new Subscriber<HomeBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                homeDataView.hideProgressDialog();
                homeDataView.showError(e.getMessage());
            }

            @Override
            public void onNext(HomeBean homeBean) {
                homeDataView.hideProgressDialog();
                homeDataView.onLoad(homeBean);
            }
        };

        homeDataModel.getHomeData2(phone, mySubscriber);

    }
}

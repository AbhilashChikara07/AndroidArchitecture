package com.example.abhilash.androidachetacture.ModelViewPresenter;

import android.content.Context;

public class PresenterClass {
    private ViewInterface mView;
    private ModelClass mModelClass;

    PresenterClass(ViewInterface mView) {
        this.mView = mView;
        this.mModelClass = new ModelClass();
    }

    void setUserMobile(String mUserMobile) {
        mModelClass.setmUserMobile(mUserMobile);
    }

    void setUserPassword(String mUserPassword) {
        mModelClass.setmUserMobile(mUserPassword);
    }

    protected void makeServerCommunication(Context mContext, String API) {
/***
 * This function is used to make server communication.
 * After succ
 * */

        if (true) {
            ModelClass mTempObj = new ModelClass();
            mTempObj.setmUserMobile(mModelClass.getmUserMobile());
            mTempObj.setmUserPassword(mModelClass.getmUserPassword());

            mView.onSuccess(mTempObj);

        } else {
            mView.showError("Some error has occur");

        }

    }

    interface ViewInterface {
        void initlizeData();

        void showProgressBar();

        void hideProgressBar();

        void showError(String mErrorMessage);

        void onSuccess(ModelClass mModelClassData);

    }

}

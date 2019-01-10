package com.example.abhilash.androidachetacture.ModelViewPresenter;

import android.util.Log;

public class ModelClass {
    private String mUserMobile;
    private String mUserPassword;

    public String getmUserMobile() {
        return mUserMobile;
    }

    public void setmUserMobile(String mUserMobile) {
        this.mUserMobile = mUserMobile;
    }

    public String getmUserPassword() {
        return mUserPassword;
    }

    public void setmUserPassword(String mUserPassword) {
        this.mUserPassword = mUserPassword;
    }

    @Override
    public String toString() {
        Log.e("Model hasbeen called", "Model hasbeen called");
        return super.toString();
    }
}

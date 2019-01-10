package com.example.abhilash.androidachetacture.ModelViewPresenter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import com.example.abhilash.androidachetacture.R


class ViewClass : AppCompatActivity(), PresenterClass.ViewInterface {

    var mPresenterClassObj: PresenterClass? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPresenterClassObj = PresenterClass(this)
        mPresenterClassObj!!.makeServerCommunication(ViewClass.this, "")
        initlizeData()
    }


    override fun initlizeData() {
        /***
         * This function is used to initialize data.
         * */
        findViewById<EditText>(R.id.mMobileNo).addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s!!.length == 10)
                    mPresenterClassObj!!.setUserMobile(s.toString())
            }

        })

        findViewById<EditText>(R.id.mPassword).addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s!!.length == 4)
                    mPresenterClassObj!!.setUserPassword(s.toString())
            }

        })

        findViewById<Button>(R.id.mSubmitBTN).setOnClickListener {
            mPresenterClassObj!!.makeServerCommunication(this, "")
        }

    }


    override fun showProgressBar() {
        /***
         * This function is used to show progressbar.
         * */
    }

    override fun hideProgressBar() {
        /***
         * This function is used to hide progressbar.
         * */
    }

    override fun showError(mErrorMessage: String?) {
        /***
         * This function is used to show error message.
         * */
    }

    override fun onSuccess(mModelClassData: ModelClass?) {
        /***
         * This function is used to proceed data for success.
         * */
    }

}
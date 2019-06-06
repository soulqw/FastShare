package com.testshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.test.tools.CommonTools;
import com.test.tools.KtTools;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        KtTools.showToast(this, "this method is from tools lib");
        //        CommonTools.showToast(this,"this method is from tools lib");
    }
}

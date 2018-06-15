package com.yang.designsupportdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by yangle on 2018/6/15.
 */

public class MaterialButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_button);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.MaterialButton)
    public void onViewClicked() {
    }
}

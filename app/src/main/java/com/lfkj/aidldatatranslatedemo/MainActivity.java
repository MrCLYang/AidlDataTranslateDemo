package com.lfkj.aidldatatranslatedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //git 合并测试
        System.out.println("分支V1.02，为合并分支测试");
    }
}
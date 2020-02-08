package com.zachrawi.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, new FragmentIklan())
                .commit();
    }
}

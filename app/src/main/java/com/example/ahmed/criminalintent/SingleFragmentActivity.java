package com.example.ahmed.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;


public abstract class SingleFragmentActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContianer);
        if (fragment == null) {
            fragment = createFragment();
            ft.add(R.id.fragmentContianer, fragment);
            ft.commit();
        }
    }

    protected abstract Fragment createFragment() ;


}

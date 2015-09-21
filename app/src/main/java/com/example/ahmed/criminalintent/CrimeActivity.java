package com.example.ahmed.criminalintent;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;


public class CrimeActivity extends FragmentActivity {

    private static final String CRIME_FRAGMENT_TAG = "com.example.ahmed.criminalintent.CrimeFragment" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContianer);
        if (fragment == null) {
            fragment = new CrimeFragment();
            ft.add(R.id.fragmentContianer, fragment, CRIME_FRAGMENT_TAG);
            ft.commit();
        }
    }


}

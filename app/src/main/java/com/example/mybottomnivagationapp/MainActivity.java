package com.example.mybottomnivagationapp;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.mybottomnivagationapp.fragments.HelpFragment;
import com.example.mybottomnivagationapp.fragments.HomeFragment;
import com.example.mybottomnivagationapp.fragments.ListFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new HomeFragment());
        bottomNav = findViewById(R.id.navigation);
        bottomNav.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.homeFragment:
                fragment = new HomeFragment();
                break;

            case R.id.listFragment:
                fragment = new ListFragment();
                break;

            case R.id.helpFragment:
                fragment = new HelpFragment();
                break;
        }

        return loadFragment(fragment);

    }


    private boolean loadFragment(Fragment fragment) {

        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;

    }


}

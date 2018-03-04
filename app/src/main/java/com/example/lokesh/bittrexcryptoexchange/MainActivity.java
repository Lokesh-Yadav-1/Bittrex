package com.example.lokesh.bittrexcryptoexchange;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private SectionsPageAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private Button marketButtom,accountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        marketButtom = findViewById(R.id.marketButton);
        accountButton = findViewById(R.id.accountButton);


        MarketFragment marketFragment = new MarketFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, marketFragment).commit();

        marketButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MarketFragment marketFragment = new MarketFragment();
                FragmentTransaction tranx = getSupportFragmentManager().beginTransaction();
                tranx.replace(R.id.fragment_container, marketFragment);
                tranx.addToBackStack(null);
                tranx.commit();
            }
        });

        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AccountFragment accountFragment = new AccountFragment();
                FragmentTransaction tranx = getSupportFragmentManager().beginTransaction();
                tranx.replace(R.id.fragment_container, accountFragment);
                tranx.addToBackStack(null);
                tranx.commit();
            }
        });

 /*       toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       mSectionsPagerAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container);
        setupViewPager(mViewPager);
        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }
    private void setupViewPager(ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter((getSupportFragmentManager()));
        adapter.addFragment(new MarketFragment(),"Bitcoin Market");
        adapter.addFragment(new ETHFragment(),"Ether Market");
        adapter.addFragment(new USDFragment(),"USD Market");
        viewPager.setAdapter(adapter);
    }  */
    }

}
package com.example.lokesh.bittrexcryptoexchange;



import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private SectionsPageAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
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
        adapter.addFragment(new BalanceFragment(), "Balance");
        adapter.addFragment(new MarketFragment(),"open Order");
        adapter.addFragment(new CompletedFragment(),"Completed" );
        adapter.addFragment(new HistoryFragment(),"History" );

        viewPager.setAdapter(adapter);
    }
}

package com.jay.unitconverter;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.jay.unitconverter.Fragments.AreaFragment;
import com.jay.unitconverter.Fragments.DataTransferRateFragment;
import com.jay.unitconverter.Fragments.DigitalStorageFragment;
import com.jay.unitconverter.Fragments.EnergyFragment;
import com.jay.unitconverter.Fragments.FrequencyFragment;
import com.jay.unitconverter.Fragments.FuelEconomyFragment;
import com.jay.unitconverter.Fragments.LengthFragment;
import com.jay.unitconverter.Fragments.MassFragment;
import com.jay.unitconverter.Fragments.PlaneAngleFragment;
import com.jay.unitconverter.Fragments.PressureFragment;
import com.jay.unitconverter.Fragments.SpeedFragment;
import com.jay.unitconverter.Fragments.TemperatureFragment;
import com.jay.unitconverter.Fragments.TimeFragment;
import com.jay.unitconverter.Fragments.VolumeFragment;

import java.util.ArrayList;
import java.util.List;

public class ScrollableTabsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, RewardedVideoAdListener {

    private InterstitialAd mInterstitialAd;
    private RewardedVideoAd mAd;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollable_tabs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                mAdView.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when when the user is about to return
                // to the app after tapping on an ad.
            }
        });


        // Use an activity context to get the Interstitial Ad instance.
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7577307801270101/2454530036");
        // Use an activity context to get the rewarded video instance.
        mAd = MobileAds.getRewardedVideoAdInstance(this);
        mAd.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
        loadInterstitialAd();
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new AreaFragment(), getString(R.string.area));
        adapter.addFrag(new DataTransferRateFragment(), getString(R.string.data_transfer_rate));
        adapter.addFrag(new DigitalStorageFragment(), getString(R.string.digital_storage));
        adapter.addFrag(new EnergyFragment(), getString(R.string.energy));
        adapter.addFrag(new FrequencyFragment(), getString(R.string.frequency));
        adapter.addFrag(new FuelEconomyFragment(), getString(R.string.fuel_economy));
        adapter.addFrag(new LengthFragment(), getString(R.string.length));
        adapter.addFrag(new MassFragment(), getString(R.string.mass));
        adapter.addFrag(new PlaneAngleFragment(), getString(R.string.plane_angel));
        adapter.addFrag(new PressureFragment(), getString(R.string.pressure));
        adapter.addFrag(new SpeedFragment(), getString(R.string.speed));
        adapter.addFrag(new TemperatureFragment(), getString(R.string.temperature));
        adapter.addFrag(new TimeFragment(), getString(R.string.time));
        adapter.addFrag(new VolumeFragment(), getString(R.string.volume));
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();

            if (mAd.isLoaded()) {
                mAd.show();
            } else {
                loadRewardedVideoAd();
                if (mAd.isLoaded()) {
                    mAd.show();
                }
                mAd.show();
            }
            loadInterstitialAd();
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
            }
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdLoaded() {
                    super.onAdLoaded();
                    mInterstitialAd.show();
                }
            });
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.scrollable_tabs, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
        if (id == R.id.action_exit) {
            if (mAd.isLoaded()) {
                mAd.show();
            } else {
                loadRewardedVideoAd();
                if (mAd.isLoaded()) {
                    mAd.show();
                }
                mAd.show();
            }
        }

        return super.onOptionsItemSelected(item);
    }

    private void loadInterstitialAd() {
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }
    private void loadRewardedVideoAd() {
        mAd.loadAd("ca-app-pub-7577307801270101/5102095863", new AdRequest.Builder().build());
    }

    @Override
    protected void onResume() {
        mAd.resume(this);
        super.onResume();
    }

    @Override
    protected void onPause() {
        mAd.pause(this);
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        if (mAd.isLoaded()) {
            mAd.show();
        } else {
            loadRewardedVideoAd();
            if (mAd.isLoaded()) {
                mAd.show();
            }
            mAd.show();
        }
//        loadInterstitialAd();
//        if (mInterstitialAd.isLoaded()) {
//            mInterstitialAd.show();
//        }
//        mInterstitialAd.setAdListener(new AdListener() {
//            @Override
//            public void onAdLoaded() {
//                super.onAdLoaded();
//                mInterstitialAd.show();
//            }
//        });
        mAd.destroy(this);
        super.onDestroy();
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_area) {
            // Handle the camera action
            ((ViewPager) findViewById(R.id.viewpager)).setCurrentItem(0);
        } else if (id == R.id.nav_data_transfer_rate) {
            ((ViewPager) findViewById(R.id.viewpager)).setCurrentItem(1);
        } else if (id == R.id.nav_digital_storage) {
            ((ViewPager) findViewById(R.id.viewpager)).setCurrentItem(2);
        } else if (id == R.id.nav_energy) {
            ((ViewPager) findViewById(R.id.viewpager)).setCurrentItem(3);
        } else if (id == R.id.nav_frequency) {
            ((ViewPager) findViewById(R.id.viewpager)).setCurrentItem(4);
        } else if (id == R.id.nav_fuel_economy) {
            ((ViewPager) findViewById(R.id.viewpager)).setCurrentItem(5);
        } else if (id == R.id.nav_length) {
            ((ViewPager) findViewById(R.id.viewpager)).setCurrentItem(6);
        } else if (id == R.id.nav_mass) {
            ((ViewPager) findViewById(R.id.viewpager)).setCurrentItem(7);
        } else if (id == R.id.nav_plane_angel) {
            ((ViewPager) findViewById(R.id.viewpager)).setCurrentItem(8);
        } else if (id == R.id.nav_pressure) {
            ((ViewPager) findViewById(R.id.viewpager)).setCurrentItem(9);
        } else if (id == R.id.nav_speed) {
            ((ViewPager) findViewById(R.id.viewpager)).setCurrentItem(10);
        } else if (id == R.id.nav_temperature) {
            ((ViewPager) findViewById(R.id.viewpager)).setCurrentItem(11);
        } else if (id == R.id.nav_time) {
            ((ViewPager) findViewById(R.id.viewpager)).setCurrentItem(12);
        } else if (id == R.id.nav_volume) {
            ((ViewPager) findViewById(R.id.viewpager)).setCurrentItem(13);
        }
//        else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {
//
//        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onRewardedVideoAdLoaded() {
//        FirebaseCrash.log("onRewardedVideoAdLoaded");
    }

    @Override
    public void onRewardedVideoAdOpened() {
//        FirebaseCrash.log("onRewardedVideoAdOpened");
    }

    @Override
    public void onRewardedVideoStarted() {
//        FirebaseCrash.log("onRewardedVideoStarted");
    }

    @Override
    public void onRewardedVideoAdClosed() {
//        FirebaseCrash.log("onRewardedVideoAdClosed");
    }

    @Override
    public void onRewarded(RewardItem rewardItem) {
//        FirebaseCrash.log("onRewarded! currency: " + rewardItem.getType() + "  amount: " + rewardItem.getAmount());
        Toast.makeText(this, "Thanks for watching ad:)", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {
//        FirebaseCrash.log("onRewardedVideoAdLeftApplication");
    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {
//        FirebaseCrash.log("onRewardedVideoAdFailedToLoad");
    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}

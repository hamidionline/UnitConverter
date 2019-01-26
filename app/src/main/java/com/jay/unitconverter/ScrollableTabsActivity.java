package com.jay.unitconverter;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
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

import com.crashlytics.android.Crashlytics;
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
import com.mopub.common.MoPub;
import com.mopub.common.SdkConfiguration;
import com.mopub.common.SdkInitializationListener;
import com.mopub.mobileads.MoPubErrorCode;
import com.mopub.mobileads.MoPubView;

import java.util.ArrayList;
import java.util.List;

//import com.google.android.gms.ads.AdListener;
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdView;
//import com.google.android.gms.ads.InterstitialAd;
//import com.google.android.gms.ads.MobileAds;
//import com.google.android.gms.ads.reward.RewardItem;
//import com.google.android.gms.ads.reward.RewardedVideoAd;
//import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class ScrollableTabsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, MoPubView.BannerAdListener/*, RewardedVideoAdListener*/ {

    //    private InterstitialAd mInterstitialAd;
//    private RewardedVideoAd mRewardedVideoAd;
//    private AdView mBannerAdView;
    private MoPubView moPubView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences pref = getApplicationContext().getSharedPreferences("ThemePref", MODE_PRIVATE);
        if (pref.getBoolean("dark_theme", false)) {
            setTheme(R.style.AppThemeDark);
        } else {
            setTheme(R.style.AppTheme);
        }
        setContentView(R.layout.activity_scrollable_tabs);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ViewPager viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        List<String> networksToInit = new ArrayList<String>();
        networksToInit.add("com.mopub.mobileads.VungleRewardedVideo");

//        SdkConfiguration sdkConfiguration = new SdkConfiguration.Builder("920b6145fb1546cf8b5cf2ac34638bb7") //Test adUnitId
        SdkConfiguration sdkConfiguration = new SdkConfiguration.Builder("9bbc4f9fa8a046159007a6eed86a964e") // Production adUnitId
//                .withMediationSettings("MEDIATION_SETTINGS")
                .withNetworksToInit(networksToInit)
                .build();

        MoPub.initializeSdk(this, sdkConfiguration, initSdkListener());

        moPubView = findViewById(R.id.adView);
//        moPubView.setAdUnitId("xxxxxxxxxxx"); // Enter your Ad Unit ID from www.mopub.com
//        moPubView.setBannerAdListener(ScrollableTabsActivity.this);
//        moPubView.loadAd();

//        mBannerAdView = findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mBannerAdView.loadAd(adRequest);
//        mBannerAdView.setAdListener(new AdListener() {
//            @Override
//            public void onAdLoaded() {
//                mBannerAdView.setVisibility(View.VISIBLE);
//                Crashlytics.logException(new Throwable("Banner onAdOpened()"));
//            }
//
//            @Override
//            public void onAdFailedToLoad(int errorCode) {
//                Crashlytics.logException(new Throwable("Banner onAdFailedToLoad() errorCode : " + errorCode));
//            }
//
//            @Override
//            public void onAdOpened() {
//                Crashlytics.logException(new Throwable("Banner onAdOpened()"));
//            }
//
//            @Override
//            public void onAdLeftApplication() {
//                Crashlytics.logException(new Throwable("Banner onAdLeftApplication()"));
//            }
//
//            @Override
//            public void onAdClosed() {
//                Crashlytics.logException(new Throwable("Banner onAdClosed()"));
//            }
//        });


        // Use an activity context to get the Interstitial Ad instance.
//        mInterstitialAd = new InterstitialAd(this);
//            mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712"); //Test AD
//        mInterstitialAd.setAdUnitId("ca-app-pub-6404517846683850/8739827235");
        // Use an activity context to get the rewarded video instance.
//        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
//        mRewardedVideoAd.setRewardedVideoAdListener(this);
//        loadRewardedVideoAd();
//        loadInterstitialAd();
//        if (mInterstitialAd.isLoaded()) {
//            mInterstitialAd.show();
//            Crashlytics.logException(new Throwable("InterstitialAd loaded"));
//        }
//        mInterstitialAd.setAdListener(new AdListener() {
//            @Override
//            public void onAdLoaded() {
//                super.onAdLoaded();
//                mInterstitialAd.show();
//                Crashlytics.logException(new Throwable("InterstitialAd loaded"));
//            }
//        });
        MoPub.onCreate(this);
    }

    private SdkInitializationListener initSdkListener() {
        return new SdkInitializationListener() {
            @Override
            public void onInitializationFinished() {
           /* MoPub SDK initialized.
           Check if you should show the consent dialog here, and make your ad requests. */
//                moPubView.setAdUnitId("b195f8dd8ded45fe847ad89ed1d016da"); // Test adUnitId
                moPubView.setAdUnitId("9bbc4f9fa8a046159007a6eed86a964e"); // Production adUnitId
                moPubView.setBannerAdListener(ScrollableTabsActivity.this);
                moPubView.loadAd();
            }
        };
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
//        adapter.addFrag(new CurrencyExchangeFragment(), getString(R.string.currency_exchange));
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();

//            if (mRewardedVideoAd.isLoaded()) {
//                mRewardedVideoAd.show();
//            } else {
//                loadRewardedVideoAd();
//                if (mRewardedVideoAd.isLoaded()) {
//                    mRewardedVideoAd.show();
//                }
//                mRewardedVideoAd.show();
//            }
//            loadInterstitialAd();
//            if (mInterstitialAd.isLoaded()) {
//                mInterstitialAd.show();
//                Crashlytics.logException(new Throwable("InterstitialAd loaded"));
//            }
//            mInterstitialAd.setAdListener(new AdListener() {
//                @Override
//                public void onAdLoaded() {
//                    super.onAdLoaded();
//                    mInterstitialAd.show();
//                    Crashlytics.logException(new Throwable("InterstitialAd loaded"));
//                }
//            });
        }
        MoPub.onBackPressed(this);
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
        if (id == R.id.action_toggle_theme) {
            SharedPreferences pref = getApplicationContext().getSharedPreferences("ThemePref", MODE_PRIVATE);
            if (pref.getBoolean("dark_theme", false)) {
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("dark_theme", false);
                editor.apply();
                recreate();
            } else {
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("dark_theme", true);
                editor.apply();
                recreate();
            }
            return true;
        }
        if (id == R.id.action_video_ad) {
//            MoPubRewardedVideos.loadRewardedVideo("15173ac6d3e54c9389b9a5ddca69b34b");
//            MoPubRewardedVideos.loadRewardedVideo("15173ac6d3e54c9389b9a5ddca69b34b");
//            if (MoPubRewardedVideos.hasRewardedVideo("15173ac6d3e54c9389b9a5ddca69b34b")) {
//                MoPubRewardedVideos.showRewardedVideo("15173ac6d3e54c9389b9a5ddca69b34b");
//            }


//            if (mRewardedVideoAd.isLoaded()) {
//                mRewardedVideoAd.show();
//            } else {
//                loadRewardedVideoAd();
//                if (mRewardedVideoAd.isLoaded()) {
//                    mRewardedVideoAd.show();
//                }
//                mRewardedVideoAd.show();
//            }
        }

        return super.onOptionsItemSelected(item);
    }

//    private void loadInterstitialAd() {
//        mInterstitialAd.loadAd(new AdRequest.Builder().build());
//    }

//    private void loadRewardedVideoAd() {
//        mRewardedVideoAd.loadAd("ca-app-pub-3940256099942544/5224354917", new AdRequest.Builder().build()); //Test AD
//        mRewardedVideoAd.loadAd("ca-app-pub-6404517846683850/6660458801", new AdRequest.Builder().build());
//    }

    @Override
    protected void onResume() {
//        mRewardedVideoAd.resume(this);
        super.onResume();
        MoPub.onResume(this);
    }

    @Override
    protected void onPause() {
//        mRewardedVideoAd.pause(this);
        super.onPause();
        MoPub.onPause(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        MoPub.onStop(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        MoPub.onStart(this);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        MoPub.onRestart(this);
    }

    @Override
    protected void onDestroy() {
//        if (mRewardedVideoAd.isLoaded()) {
//            mRewardedVideoAd.show();
//        } else {
//            loadRewardedVideoAd();
//            if (mRewardedVideoAd.isLoaded()) {
//                mRewardedVideoAd.show();
//            }
//            mRewardedVideoAd.show();
//        }
//        mRewardedVideoAd.destroy(this);
        super.onDestroy();
        moPubView.destroy();
        MoPub.onDestroy(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_area) {
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
        } else if (id == R.id.nav_currency_exchange) {
            ((ViewPager) findViewById(R.id.viewpager)).setCurrentItem(14);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBannerLoaded(MoPubView banner) {
        moPubView.setVisibility(View.VISIBLE);
        Crashlytics.log("onBannerLoaded()" + banner.getAdUnitId());
    }

    @Override
    public void onBannerFailed(MoPubView banner, MoPubErrorCode errorCode) {
        Crashlytics.log("onBannerFailed() errorCode : " + errorCode);
    }

    @Override
    public void onBannerClicked(MoPubView banner) {
        Crashlytics.log("onBannerClicked()" + banner.getAdUnitId());
    }

    @Override
    public void onBannerExpanded(MoPubView banner) {
        Crashlytics.log("onBannerExpanded()" + banner.getAdUnitId());
    }

    @Override
    public void onBannerCollapsed(MoPubView banner) {
        Crashlytics.log("onBannerCollapsed()" + banner.getAdUnitId());
    }

//    @Override
//    public void onRewardedVideoAdLoaded() {
//        Crashlytics.logException(new Throwable("Reward ad onRewardedVideoAdLoaded()"));
//    }
//
//    @Override
//    public void onRewardedVideoAdOpened() {
//        Crashlytics.logException(new Throwable("Reward ad onRewardedVideoAdOpened()"));
//    }
//
//    @Override
//    public void onRewardedVideoStarted() {
//        Crashlytics.logException(new Throwable("Reward ad onRewardedVideoStarted()"));
//    }
//
//    @Override
//    public void onRewardedVideoAdClosed() {
//        Crashlytics.logException(new Throwable("Reward ad onRewardedVideoAdClosed()"));
//    }
//
//    @Override
//    public void onRewarded(RewardItem rewardItem) {
//        Crashlytics.logException(new Throwable("Reward ad onRewarded() rewardItem.getAmount() : " + rewardItem.getAmount()));
//    }
//
//    @Override
//    public void onRewardedVideoAdLeftApplication() {
//        Crashlytics.logException(new Throwable("Reward ad onRewardedVideoAdLeftApplication()"));
//    }
//
//    @Override
//    public void onRewardedVideoAdFailedToLoad(int i) {
//        Crashlytics.logException(new Throwable("Reward ad onRewardedVideoAdFailedToLoad() errorCode : " + i));
//    }
//
//    @Override
//    public void onRewardedVideoCompleted() {
//        Toast.makeText(this, "Thanks for watching ad:)", Toast.LENGTH_LONG).show();
//        Crashlytics.logException(new Throwable("Reward ad onRewardedVideoCompleted()"));
//    }

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

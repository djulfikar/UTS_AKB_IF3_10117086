package com.example.tugas_uts_akb_if3_10117086.View;

import android.content.Intent;


import com.example.tugas_uts_akb_if3_10117086.R;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;
import com.daimajia.androidanimations.library.Techniques;

/** NIM : 10117086
 * Nama : RD Muhammad Djulfikar Bu
 * Kelas : IF 3
 * Tanggal : 12-05-2020**/

public class SplashActivity extends AwesomeSplash {
    @Override
    public void initSplash(ConfigSplash configSplash){

        //menambahkan background
        configSplash.setBackgroundColor(R.color.colorAccent);
        configSplash.setAnimCircularRevealDuration(3000);
        configSplash.setRevealFlagX(Flags.REVEAL_LEFT);
        configSplash.setRevealFlagX(Flags.REVEAL_BOTTOM);

        //menambahkan logo
        configSplash.setLogoSplash(R.drawable.splash);
        configSplash.setAnimLogoSplashDuration(2000);
        configSplash.setAnimTitleTechnique(Techniques.FadeIn);

        //menambahkan title
        configSplash.setTitleSplash("Wanna Be a Friend");
        configSplash.setTitleTextColor(R.color.colorPrimaryDark);
        configSplash.setTitleTextSize(30f);
        configSplash.setAnimTitleDuration(2000);
        configSplash.setAnimTitleTechnique(Techniques.ZoomIn);
    }
    @Override
    public void animationsFinished(){
        startActivity(new Intent(SplashActivity.this, OnBoardView.class));
    }
}

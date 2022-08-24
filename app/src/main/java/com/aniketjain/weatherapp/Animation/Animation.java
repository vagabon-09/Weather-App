package com.aniketjain.weatherapp.Animation;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;

public class Animation {
    int lastPosition = -1;
    public void setAnimation(Context context, View view, int position){
        //Fade in animation to recycler views day cards
        if (position>lastPosition){
            android.view.animation.Animation anim = AnimationUtils.loadAnimation(context, android.R.anim.fade_in);
            view.setAnimation(anim);
            lastPosition = position;
        }

    }
}

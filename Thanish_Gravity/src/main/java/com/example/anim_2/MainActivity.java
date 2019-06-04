package com.example.anim_2;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView rstone,tstone,sstone,pstone,mstone;
    Animation anim1,anim2;

    int y=1,y_c,y_f;

    int count=0;

    LinearLayout screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rstone = findViewById(R.id.rst);
        tstone = findViewById(R.id.tst);
        sstone = findViewById(R.id.sst);
        pstone = findViewById(R.id.space);
        mstone = findViewById(R.id.mind);
        screen = findViewById(R.id.scrn);
        anim1 = AnimationUtils.loadAnimation(this,R.anim.translate);
        anim2 = AnimationUtils.loadAnimation(this,R.anim.translate_1);
        screen.setOnClickListener(o);
    }

    View.OnClickListener o = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(count%2==0){
                animation();
            }

            if(count%2==1){
                animation_2();
            }


        }
    };

    public void animation(){
        rstone.startAnimation(anim1);
        tstone.startAnimation(anim1);
        sstone.startAnimation(anim1);
        pstone.startAnimation(anim1);
        mstone.startAnimation(anim1);
        anim1.setAnimationListener(new AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                count = count+1;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    public void animation_2(){
        rstone.startAnimation(anim2);
        tstone.startAnimation(anim2);
        sstone.startAnimation(anim2);
        pstone.startAnimation(anim2);
        mstone.startAnimation(anim2);
        anim2.setAnimationListener(new AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                count = count+1;

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}






package nnk.com.oots3;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    private TextView title;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final int DELAY=1000;
        setContentView(R.layout.activity_splash);
        title= (TextView) findViewById(R.id.titleText);
        image= (ImageView) findViewById(R.id.splashImage);
        //
        int widthPixels=new DisplayMetrics().widthPixels;
        ObjectAnimator titleAnimator=ObjectAnimator.ofFloat(title, View.TRANSLATION_X,0,widthPixels/2);
        titleAnimator.setRepeatCount(ObjectAnimator.INFINITE);
        titleAnimator.setRepeatMode(ObjectAnimator.REVERSE);
        titleAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        titleAnimator.setDuration(DELAY);

        ObjectAnimator imageAnimatorX=ObjectAnimator.ofFloat(image,View.SCALE_X,0,1.2f);
        imageAnimatorX.setDuration(DELAY)
                .setInterpolator(new LinearInterpolator());

        ObjectAnimator imageAnimatorY=ObjectAnimator.ofFloat(image,View.SCALE_Y,0,1.2f);
        imageAnimatorY.setDuration(DELAY)
                .setInterpolator(new LinearInterpolator());

        AnimatorSet set=new AnimatorSet();
        set.playTogether(titleAnimator,imageAnimatorX,imageAnimatorY);
        set.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        },DELAY);


    }
}

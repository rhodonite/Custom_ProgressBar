package com.rhodonite.custom_progressbar;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
    ImageView imageView;
    AnimationDrawable anim;
    Button bt_start,bt_stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView  = (ImageView)findViewById(R.id.imageView);
        bt_start = (Button) findViewById(R.id.button);
        bt_stop = (Button) findViewById(R.id.button2);
        Object ob = imageView.getBackground();
        anim = (AnimationDrawable) ob;

        bt_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("anim", anim.isRunning() + "");
                anim.start();
            }
        });
        bt_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("anim",anim.isRunning()+"");
                anim.stop();
            }
        });
    }
}

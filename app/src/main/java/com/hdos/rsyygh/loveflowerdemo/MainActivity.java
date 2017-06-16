package com.hdos.rsyygh.loveflowerdemo;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;

import com.hdos.rsyygh.loveflowerdemo.view.LoveLayout;

public class MainActivity extends AppCompatActivity {
    private ImageView imgIcon;//图标
    private Button btnStart;//开始动画
    private LoveLayout loveLayout;//刷鲜花控件

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvent();

    }

    private void initEvent() {
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*ObjectAnimator alpha = ObjectAnimator.ofFloat(imgIcon, "alpha", 0f, 1f);
                alpha.setDuration(2000);//设置动画时间
                alpha.setInterpolator(new DecelerateInterpolator());//设置动画插入器，减速
                alpha.setRepeatCount(-1);//设置动画重复次数，这里-1代表无限
                //alpha.setRepeatMode(Animation.REVERSE);//设置动画循环模式。
                //alpha.setRepeatMode(Animation.RESTART);
                alpha.start();//启动动画。*/
                loveLayout.addLoveIcon();
            }
        });

    }

    private void initView() {
        imgIcon = (ImageView) findViewById(R.id.img_icon);
        btnStart = (Button) findViewById(R.id.btn_start);
        loveLayout = (LoveLayout) findViewById(R.id.love_layout);
    }
}

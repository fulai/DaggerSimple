package com.wen.fulai.daggersimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.wen.fulai.daggersimple.dl.bean.Flower;
import com.wen.fulai.daggersimple.dl.bean.Lily;
import com.wen.fulai.daggersimple.dl.bean.Pony;
import com.wen.fulai.daggersimple.dl.bean.Pot;
import com.wen.fulai.daggersimple.dl.component.DaggerFlowerComponent;
import com.wen.fulai.daggersimple.dl.component.DaggerMainActivityComponent;
import com.wen.fulai.daggersimple.dl.component.DaggerPonyComponent;
import com.wen.fulai.daggersimple.dl.module.PonyModule;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    TextView textView;
//    @Inject
//    Pot pot;
    @Inject
    Pony pony;
//    @Inject
//    Lily lily;
//    @Named("Alise")
//    @Inject
//    Flower flower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "注入开始");
        DaggerMainActivityComponent.builder().build().inject(this);
        DaggerMainActivityComponent.builder().ponyComponent(DaggerPonyComponent.builder()
                .flowerComponent(DaggerFlowerComponent.builder().build()).build()).build().inject
                (this);
        //DaggerFlowerComponent.builder().build().plus(new PonyModule()).plus().inject(this);
        Log.i(TAG, "注入end");
        textView = (TextView) findViewById(R.id.textview);
//        textView.setText(pot.toString());
//        Log.i(TAG, pony.toString());
//        Log.i(TAG, lily.toString());
//        Log.i(TAG, flower.toString());
    }

    @Inject
    public void show() {
        //Toast.makeText(this,"method Inject",Toast.LENGTH_SHORT).show();
        Log.i(TAG, "method Inject");
    }
}

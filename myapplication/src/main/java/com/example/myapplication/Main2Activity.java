package com.example.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.dagger.bean.Person;
import com.example.myapplication.dagger.bean.TestBean;
import com.example.myapplication.dagger.component.AppComponent;
import com.example.myapplication.dagger.component.DaggerActivityComponent;
import com.example.myapplication.dagger.component.DaggerAppComponent;
import com.example.myapplication.dagger.component.DaggerMainComponent;
import com.example.myapplication.dagger.component.DaggerTestComponent;
import com.example.myapplication.dagger.module.AppModule;
import com.example.myapplication.dagger.module.MainModule;
import com.example.myapplication.dagger2.User;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {
    private TextView textView;
    @Inject
    Person person;
    @Inject
    Context context;

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //DaggerMainComponent.builder().mainModule(new MainModule(this)).build().inject(this);
        AppComponent appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        DaggerActivityComponent.builder().appComponent(appComponent).build().inject(this);
        textView = (TextView) findViewById(R.id.textview);
        textView.setText(person.toString() + " " + context.toString());


        //Context context = DaggerAppComponent.builder().appModule(new AppModule(this)).build().proContext();
        //System.out.println(context.toString());

//        TestBean testBean = DaggerTestComponent.builder().build().getTestBean();

    }
}

package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.myapplication.dagger.bean.Login;
import com.example.myapplication.dagger.bean.User;
import com.example.myapplication.dagger.component.DaggerUserComponent;
import com.example.myapplication.dagger.component.UserComponent;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {
    @Inject
    User user;
    @Inject
    User user1;
    @Named("fulai")
    @Inject
    User user2;
    //    @LoginName(name = "fully")
    @Inject
    Login login;
    UserComponent userComponent;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textview);

        userComponent = DaggerUserComponent.builder().build();
        //从当前类DaggerActivity中，找出对应需要初始化的字段，如：user
        userComponent.inject(this);
//        DaggerLoginComponent.builder().build().inject(this);

        //text.setText(user.getName()+" "+user.getAge());
        text.setText(user.toString() + "  " + user1.toString() + "  " + user2.toString());
        if (login != null) {
            Log.i("DaggerActivity", login.toString());
        }
    }
}

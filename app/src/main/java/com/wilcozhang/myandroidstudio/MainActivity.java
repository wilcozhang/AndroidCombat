package com.wilcozhang.myandroidstudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Date;

public class MainActivity extends AppCompatActivity {


    private Date mDate = new Date();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private String saySomething() {
        String result = "SomeThing";
        return result;
    }

    private void addName(String name, Bundle bundle) {
        bundle.putString("Name", name);
    }

    private Date getDate() {
        return mDate;
    }

    private String methodHello() {
        String greet = "Hello";

        return getGreet(greet);
    }

    private String getGreet(String gre) {
        StringBuilder sb = new StringBuilder();
        for (int nc = 0; nc < 10; ++nc) {
            sb.append(gre + nc);
        }

        return sb.toString();
    }

    private void sayHello() {
        System.out.println("Hello World!");
        System.out.println("Hello World, this is brach master.");
    }
}
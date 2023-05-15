package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isEgg=true;
    public void change(View view){
        ImageView imageView2=findViewById(R.id.imageView2);
        ImageView imageView4=findViewById(R.id.imageView4);
        if(isEgg){
            imageView2.animate().alpha(1).setDuration(2000);
            imageView4.animate().alpha(0).setDuration(2000);
            isEgg=false;
        }else{
            imageView2.animate().alpha(0).setDuration(2000);
            imageView4.animate().alpha(1).setDuration(2000);
            isEgg=true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
package com.example.truthdaregame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    //variables
    private ImageView imageView;
    private Button button;
    private Random random = new Random();
    private int lastDirection;//todegree

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button2);
        imageView = findViewById(R.id.imageView);


    }
    public void spin(View view)//method
    {
        int newDirection = random.nextInt(36000);//fromdegree
        float pivotX = imageView.getWidth() / 2;
        float pivotY = imageView.getHeight() / 2;
//lastDirection=newDirection;
        Animation rotate = new RotateAnimation(lastDirection, newDirection, pivotX, pivotY);//4 parameters
        rotate.setDuration(2000);//1s6st
        rotate.setFillAfter(true);//2nd
        imageView.startAnimation(rotate);
    }}




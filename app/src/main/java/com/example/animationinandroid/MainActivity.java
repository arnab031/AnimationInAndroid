package com.example.animationinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    int temp=0;

    private ImageView imgHelloWorld;
    private ImageView imgHiWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld=findViewById(R.id.txtHelloWorld);
        txtHiWorld=findViewById(R.id.txtHiWorld);

        imgHelloWorld=findViewById(R.id.imgHelloWorld);
        imgHiWorld=findViewById(R.id.imgHiWorld);

        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("MyTag","Hello World is tapped");
                if(temp==0) {
                    txtHelloWorld.animate().alpha(0).setDuration(1000);
                    txtHiWorld.animate().alpha(1).setDuration(1000);
                    imgHelloWorld.animate().rotationBy(20f).setDuration(3000);
                    imgHelloWorld.animate().alpha(0).setDuration(1000);
                    imgHiWorld.animate().alpha(1).setDuration(1000);
                    temp=1;
                }else{
                    txtHiWorld.animate().alpha(0).setDuration(1000);
                    txtHelloWorld.animate().alpha(1).setDuration(1000);
                    imgHiWorld.animate().rotationBy(20f).setDuration(3000);
                    imgHelloWorld.animate().alpha(1).setDuration(1000);
                    imgHiWorld.animate().alpha(0).setDuration(1000);
                    temp=0;
                }
            }
        });




    }
}

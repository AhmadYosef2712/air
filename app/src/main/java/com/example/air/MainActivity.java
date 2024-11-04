package com.example.air;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
     private  boolean isOn=true;
     private int mode=1, t;
     private TextView change ,inc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        change=findViewById(R.id.mode);
        inc=findViewById(R.id.temp);
        t=24;


    }

    public void check(View view) {
        if(isOn==true)
            isOn=false;
        else
            isOn=true;
    }

    public void switchMode(View view) {
        if (isOn==true){
            if(mode==1){
                mode=0;
                change.setText("heat");

            }
            else{
                mode=1;
                change.setText("cool");
            }
        }

    }

    public void plus(View view) {
        if(isOn==true&&t<=29&&t>=16){
           t++;
           inc.setText(""+t);
           



        }


    }

    public void min(View view) {
        if(isOn==true&&t<=30&&t>=17){
            t--;
            inc.setText(""+t);




        }
    }
}
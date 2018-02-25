package com.example.idan.idanwasserstb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;
import android.graphics.Color;
public class MainActivity extends AppCompatActivity {
ToggleButton tb;
Switch sw;
LinearLayout lil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton) findViewById(R.id.tob);
        sw = (Switch) findViewById(R.id.swi);
        lil = (LinearLayout) findViewById(R.id.ll);
    }
    public void click (View view){
        if (sw.isChecked()&&(tb.isChecked()))
            lil.setBackgroundColor(Color.GREEN);
        if (sw.isChecked()&&!(tb.isChecked()))
            lil.setBackgroundColor(Color.RED);
        if (!(sw.isChecked())&&(tb.isChecked()))
            lil.setBackgroundColor(Color.BLUE);
        if (!(sw.isChecked())&&!(tb.isChecked()))
            lil.setBackgroundColor(Color.WHITE);
    }
}



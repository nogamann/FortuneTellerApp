package com.example.fo_teller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getResult(View view) {
        // Get random number between 0-100
        Random rand = new Random();
        int resultNumber = rand.nextInt(100);

        // And present it on resultNumber TextView
        TextView resultTextView = (TextView) findViewById(R.id.result);
        resultTextView.setText(Integer.toString(resultNumber) + '%');
    }
}

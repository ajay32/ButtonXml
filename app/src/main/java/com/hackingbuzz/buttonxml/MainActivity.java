package com.hackingbuzz.buttonxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        textView = (TextView) findViewById(R.id.textView);

    }
    // without initilizing a object ..so object would have nothing to do with it...

    public void clickme(View view) {

        textView.setText("Text Changed");
    }
}

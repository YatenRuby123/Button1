package com.button.yatpawjava.button1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    private static final String TAG = MainActivity.class.getSimpleName() ;
    private Button mFirstButton, mSecondButton, mThirdButton, mFourthButton, mFiveButton, mSixButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstButton = (Button)findViewById(R.id.mFristButton);
        mSecondButton = (Button)findViewById(R.id.mSecondButton);
        mThirdButton = (Button)findViewById(R.id.mThirdButton);
        mFourthButton = (Button)findViewById(R.id.mFourthButton);

        mFirstButton.setOnClickListener(MainActivity.this);
        mSecondButton.setOnClickListener(MainActivity.this);
        mThirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"Third button clicked");
            }
        });
        mFourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"Fourth button Clicked");
            }
        });



    }
    public void performStuff(View v ){
        // Codes to perform action
        switch (v.getId()){
            case R.id.mFiveButton:
                Log.d(TAG,"Five was clicked");
                break;

            case R.id.mSixButton:
                Log.d(TAG,"Six was clicked");
                break;

        }
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.mFristButton:
                Log.d(TAG, "First Button Clicked");
                break;

            case R.id.mSecondButton:
                Log.d(TAG, "Second Button Clicked");
                break;
        }
    }
}

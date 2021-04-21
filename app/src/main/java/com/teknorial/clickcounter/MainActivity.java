package com.teknorial.clickcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

//import widget
import android.widget.Button;
import android.widget.TextView;

import android.view.View;



public class MainActivity extends AppCompatActivity {

    //deklarasi variable
    private TextView mTextNumber;
    private Button mButton;

    //mCount menampung nilai awal dengan 0
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //inisialisasi
        mTextNumber = findViewById(R.id.tv_number);
        mButton = findViewById(R.id.btn_click);

        //click listener
        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //mCount akan ditambah dengan 1 setiap klik
                mCount = mCount + 1;

                //mTextNumber akan menampilkan nilai dari mCount
                mTextNumber.setText(String.valueOf(mCount));
            }
        });
    }
}
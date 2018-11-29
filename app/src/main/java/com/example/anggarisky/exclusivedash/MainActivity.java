package com.example.anggarisky.exclusivedash;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titleMedium, titleLight, titleBook, titleAuthor, titlePrice, titleBookNew, titleBookDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        titleLight = (TextView) findViewById(R.id.titleLight);
        titleMedium = (TextView) findViewById(R.id.titleMedium);

        titleBook = (TextView) findViewById(R.id.titleBook);
        titleAuthor = (TextView) findViewById(R.id.titleAuthor);
        titlePrice = (TextView) findViewById(R.id.titlePrice);

        titleBookNew = (TextView) findViewById(R.id.titleBookNew);
        titleBookDesc = (TextView) findViewById(R.id.titleBookDesc);

        Typeface mediumx = Typeface.createFromAsset(getAssets(), "fonts/MontserratMedium.ttf");
        Typeface lightx = Typeface.createFromAsset(getAssets(), "fonts/MontserratLight.ttf");

        titleMedium.setTypeface(mediumx);
        titleLight.setTypeface(lightx);

        titleBook.setTypeface(mediumx);
        titleAuthor.setTypeface(lightx);
        titlePrice.setTypeface(mediumx);

        titleBookNew.setTypeface(mediumx);
        titleBookDesc.setTypeface(lightx);


    }
}

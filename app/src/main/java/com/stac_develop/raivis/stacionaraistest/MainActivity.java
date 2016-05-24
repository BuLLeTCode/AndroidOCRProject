package com.stac_develop.raivis.stacionaraistest;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.googlecode.tesseract.android.TessBaseAPI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap largeIcon = BitmapFactory.decodeResource(getResources(), R.mipmap.text_area);

        TessBaseAPI baseAPI = new TessBaseAPI();
        baseAPI.init("", "eng");
        baseAPI.setImage(largeIcon);
        String recogText = baseAPI.getUTF8Text();
        Log.d("Logs", recogText);
        baseAPI.end();

    }
}

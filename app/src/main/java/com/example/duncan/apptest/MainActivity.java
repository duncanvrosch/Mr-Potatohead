package com.example.duncan.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");

        CheckBox checkbox = (CheckBox) v;

        String text;
        text = checkbox.getText().toString();

        // if checkbox checked
        if (checkbox.isChecked()) {


            if (text.equals("Arms")) {
                ImageView image = (ImageView) findViewById(R.id.Arms1);
                image.setVisibility(View.VISIBLE);
            } else if (text.equals("Ears")) {
                ImageView image = (ImageView) findViewById(R.id.Ears1);
                image.setVisibility(View.VISIBLE);
            } else if (text.equals("Eyebrows")) {
                ImageView image = (ImageView) findViewById(R.id.Eyebrows1);
                image.setVisibility(View.VISIBLE);
            } else if (text.equals("Eyes")) {
                ImageView image = (ImageView) findViewById(R.id.Eyes1);
                image.setVisibility(View.VISIBLE);
            } else if (text.equals("Glasses")) {
                ImageView image = (ImageView) findViewById(R.id.Glasses1);
                image.setVisibility(View.VISIBLE);
            } else if (text.equals("Hat")) {
                ImageView image = (ImageView) findViewById(R.id.Hat1);
                image.setVisibility(View.VISIBLE);
            } else if (text.equals("Mouth")) {
                ImageView image = (ImageView) findViewById(R.id.Mouth1);
                image.setVisibility(View.VISIBLE);
            } else if (text.equals("Mustache")) {
                ImageView image = (ImageView) findViewById(R.id.Mustache1);
                image.setVisibility(View.VISIBLE);
            } else if (text.equals("Nose")) {
                ImageView image = (ImageView) findViewById(R.id.Nose1);
                image.setVisibility(View.VISIBLE);
            } else {
                ImageView image = (ImageView) findViewById(R.id.Shoes1);
                image.setVisibility(View.VISIBLE);
            }
        }

        // if checkbox not checked
        else {
            if (text.equals("Arms")) {
                ImageView image = (ImageView) findViewById(R.id.Arms1);
                image.setVisibility(View.INVISIBLE);
            } else if (text.equals("Ears")) {
                ImageView image = (ImageView) findViewById(R.id.Ears1);
                image.setVisibility(View.INVISIBLE);
            } else if (text.equals("Eyebrows")) {
                ImageView image = (ImageView) findViewById(R.id.Eyebrows1);
                image.setVisibility(View.INVISIBLE);
            } else if (text.equals("Eyes")) {
                ImageView image = (ImageView) findViewById(R.id.Eyes1);
                image.setVisibility(View.INVISIBLE);
            } else if (text.equals("Glasses")) {
                ImageView image = (ImageView) findViewById(R.id.Glasses1);
                image.setVisibility(View.INVISIBLE);
            } else if (text.equals("Hat")) {
                ImageView image = (ImageView) findViewById(R.id.Hat1);
                image.setVisibility(View.INVISIBLE);
            } else if (text.equals("Mouth")) {
                ImageView image = (ImageView) findViewById(R.id.Mouth1);
                image.setVisibility(View.INVISIBLE);
            } else if (text.equals("Mustache")) {
                ImageView image = (ImageView) findViewById(R.id.Mustache1);
                image.setVisibility(View.INVISIBLE);
            } else if (text.equals("Nose")) {
                ImageView image = (ImageView) findViewById(R.id.Nose1);
                image.setVisibility(View.INVISIBLE);
            } else {
                ImageView image = (ImageView) findViewById(R.id.Shoes1);
                image.setVisibility(View.INVISIBLE);
            }
        }
    }
}

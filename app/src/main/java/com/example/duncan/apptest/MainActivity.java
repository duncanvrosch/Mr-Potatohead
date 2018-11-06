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

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // checks if image is visible for every image and puts bool in bundle
        ImageView image = (ImageView) findViewById(R.id.Arms1);
        boolean ArmsBool = image.isShown();
        outState.putBoolean("Arms", ArmsBool);

        image = (ImageView) findViewById(R.id.Ears1);
        boolean EarsBool = image.isShown();
        outState.putBoolean("Ears", EarsBool);

        image = (ImageView) findViewById(R.id.Eyebrows1);
        boolean EyebrowsBool = image.isShown();
        outState.putBoolean("Eyebrows", EyebrowsBool);

        image = (ImageView) findViewById(R.id.Eyes1);
        boolean EyesBool = image.isShown();
        outState.putBoolean("Eyes", EyesBool);

        image = (ImageView) findViewById(R.id.Glasses1);
        boolean GlassesBool = image.isShown();
        outState.putBoolean("Glasses", GlassesBool);

        image = (ImageView) findViewById(R.id.Hat1);
        boolean HatBool = image.isShown();
        outState.putBoolean("Hat", HatBool);

        image = (ImageView) findViewById(R.id.Mouth1);
        boolean MouthBool = image.isShown();
        outState.putBoolean("Mouth", MouthBool);

        image = (ImageView) findViewById(R.id.Mustache1);
        boolean MustacheBool = image.isShown();
        outState.putBoolean("Mustache", MustacheBool);

        image = (ImageView) findViewById(R.id.Nose1);
        boolean NoseBool = image.isShown();
        outState.putBoolean("Nose", NoseBool);

        image = (ImageView) findViewById(R.id.Shoes1);
        boolean ShoesBool = image.isShown();
        outState.putBoolean("Shoes", ShoesBool);
    }
    
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // checks if image is visible and updates it
        boolean ArmsBool = savedInstanceState.getBoolean("Arms");
        if (ArmsBool) {
            ImageView image = (ImageView) findViewById(R.id.Arms1);
            image.setVisibility(View.VISIBLE);
        }
        else {
            ImageView image = (ImageView) findViewById(R.id.Arms1);
            image.setVisibility(View.INVISIBLE);
        }

        boolean EarsBool = savedInstanceState.getBoolean("Ears");
        if (EarsBool) {
            ImageView image = (ImageView) findViewById(R.id.Ears1);
            image.setVisibility(View.VISIBLE);
        }
        else {
            ImageView image = (ImageView) findViewById(R.id.Ears1);
            image.setVisibility(View.INVISIBLE);
        }

        boolean EyebrowsBool = savedInstanceState.getBoolean("Eyebrows");
        if (EyebrowsBool) {
            ImageView image = (ImageView) findViewById(R.id.Eyebrows1);
            image.setVisibility(View.VISIBLE);
        }
        else {
            ImageView image = (ImageView) findViewById(R.id.Eyebrows1);
            image.setVisibility(View.INVISIBLE);
        }

        boolean EyesBool = savedInstanceState.getBoolean("Eyes");
        if (EyesBool) {
            ImageView image = (ImageView) findViewById(R.id.Eyes1);
            image.setVisibility(View.VISIBLE);
        }
        else {
            ImageView image = (ImageView) findViewById(R.id.Eyes1);
            image.setVisibility(View.INVISIBLE);
        }

        boolean GlassesBool = savedInstanceState.getBoolean("Glasses");
        if (GlassesBool) {
            ImageView image = (ImageView) findViewById(R.id.Glasses1);
            image.setVisibility(View.VISIBLE);
        }
        else {
            ImageView image = (ImageView) findViewById(R.id.Glasses1);
            image.setVisibility(View.INVISIBLE);
        }

        boolean HatBool = savedInstanceState.getBoolean("Hat");
        if (HatBool) {
            ImageView image = (ImageView) findViewById(R.id.Hat1);
            image.setVisibility(View.VISIBLE);
        }
        else {
            ImageView image = (ImageView) findViewById(R.id.Hat1);
            image.setVisibility(View.INVISIBLE);
        }

        boolean MouthBool = savedInstanceState.getBoolean("Mouth");
        if (MouthBool) {
            ImageView image = (ImageView) findViewById(R.id.Mouth1);
            image.setVisibility(View.VISIBLE);
        }
        else {
            ImageView image = (ImageView) findViewById(R.id.Mouth1);
            image.setVisibility(View.INVISIBLE);
        }

        boolean MustacheBool = savedInstanceState.getBoolean("Mustache");
        if (MustacheBool) {
            ImageView image = (ImageView) findViewById(R.id.Mustache1);
            image.setVisibility(View.VISIBLE);
        }
        else {
            ImageView image = (ImageView) findViewById(R.id.Mustache1);
            image.setVisibility(View.INVISIBLE);
        }

        boolean NoseBool = savedInstanceState.getBoolean("Nose");
        if (NoseBool) {
            ImageView image = (ImageView) findViewById(R.id.Nose1);
            image.setVisibility(View.VISIBLE);
        }
        else {
            ImageView image = (ImageView) findViewById(R.id.Nose1);
            image.setVisibility(View.INVISIBLE);
        }

        boolean ShoesBool = savedInstanceState.getBoolean("Shoes");
        if (ShoesBool) {
            ImageView image = (ImageView) findViewById(R.id.Shoes1);
            image.setVisibility(View.VISIBLE);
        }
        else {
            ImageView image = (ImageView) findViewById(R.id.Shoes1);
            image.setVisibility(View.INVISIBLE);
        }

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

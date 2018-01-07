package com.example.android.beatlesquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText drummer;
    EditText splitUpYear;
    RadioButton buttonJesus;
    RadioButton buttonHamburg;
    CheckBox checkBoxThreeAlbums;
    CheckBox checkBoxFourAlbums;
    CheckBox checkBoxTwoTeam;
    CheckBox checkBoxFourTeam;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drummer =  findViewById(R.id.drummers_name);
        splitUpYear = findViewById(R.id.split_up_year);
        buttonJesus = findViewById(R.id.jesus_button);
        buttonHamburg = findViewById(R.id.hamburg_button);
        checkBoxThreeAlbums = findViewById(R.id.checkbox_three_albums);
        checkBoxFourAlbums = findViewById(R.id.checkbox_four_albums);
        checkBoxTwoTeam = findViewById(R.id.checkbox_two_team);
        checkBoxFourTeam  = findViewById(R.id.checkbox_four_team);
    }

    /**
     * adds all points from the different input types and displays a toast with reached point
     *
     */
    public void addScores(View view) {
        int score = 0;


        /** handles the Text Edits, adds points when correct
         *
         */
        String peteBest = drummer.getText().toString();
        if (peteBest.equals("Pete Best")) score++;

        String year = splitUpYear.getText().toString();
        if (year.equals("1970")) score++;


        /** handles the radio buttons and adds points when answer is correct
         *
         */
        boolean jesus = buttonJesus.isChecked();
        if (jesus) score++;

        boolean hamburg = buttonHamburg.isChecked();
        if (hamburg) score++;

        /** handles the checkboxes and adds points when answer is correct
         *
        */
        boolean whiteAlbum = checkBoxThreeAlbums.isChecked();
        if (whiteAlbum) score++;

        boolean rubberSoul = checkBoxFourAlbums.isChecked();
        if (rubberSoul) score++;

        boolean brianEpstein = checkBoxTwoTeam.isChecked();
        if (brianEpstein) score++;

        boolean georgeMartin = checkBoxFourTeam.isChecked();
        if (georgeMartin) score++;

        /** different toasts for different reached points get toasted
         *
         */

        if (score <= 3) {
            Context context = getApplicationContext();
            CharSequence text = getResources().getString(R.string.more_into_Bieber) + "\u0020 " + score + "\u0020 " + getResources().getString(R.string.out_of_points);
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        } else if (score <= 5) {
            Context context = getApplicationContext();
            CharSequence text = getResources().getString(R.string.ok_for_20_and_younger) + "\u0020 " + score + "\u0020 " + getResources().getString(R.string.out_of_points);
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else if (score <= 7) {
            Context context = getApplicationContext();
            CharSequence text = getResources().getString(R.string.most_answers_correct) + "\u0020 " + score + "\u0020 " + getResources().getString(R.string.out_of_points);
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else if (score == 8) {
            Context context = getApplicationContext();
            CharSequence text = getResources().getString(R.string.Awesaome__Full_points_) + "\u0020 " + score + "\u0020 " + getResources().getString(R.string.out_of_points);
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}
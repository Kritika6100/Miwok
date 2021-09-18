package com.example.miwok;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void OpenNumberslist(View view) {
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }

    public void OpenFamilylist(View view) {
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }

    public void OpenColorslist(View view) {
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }

    public void OpenPhraseslist(View view) {
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }
}
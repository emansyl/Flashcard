package com.example.rcr13_17.flashcard;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.flash_card_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("button", "pressed");
                findViewById(R.id.question_answer).setVisibility(View.VISIBLE);
                findViewById(R.id.flash_card_question).setVisibility(View.INVISIBLE);
            }
        });

        findViewById(R.id.question_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("button", "pressed");
                findViewById(R.id.question_answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.flash_card_question).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.Wronganswer1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.Wronganswer1).setBackgroundColor(getResources().getColor(R.color.lightcoral));
                findViewById(R.id.CorrectAnswer).setBackgroundColor(getResources().getColor(R.color.mediumseagreen));
            }
        });

        findViewById(R.id.Wronganswer2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.Wronganswer2).setBackgroundColor(getResources().getColor(R.color.lightcoral));
                findViewById(R.id.CorrectAnswer).setBackgroundColor(getResources().getColor(R.color.mediumseagreen));
            }
        });

        findViewById(R.id.CorrectAnswer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.CorrectAnswer).setBackgroundColor(getResources().getColor(R.color.mediumseagreen));
            }
        });

        findViewById(R.id.backgrd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.CorrectAnswer).setBackgroundColor(getResources().getColor(R.color.Yellow));
                findViewById(R.id.Wronganswer2).setBackgroundColor(getResources().getColor(R.color.Yellow));
                findViewById(R.id.Wronganswer1).setBackgroundColor(getResources().getColor(R.color.Yellow));
                findViewById(R.id.question_answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.flash_card_question).setVisibility(View.VISIBLE);
            }


        });

        findViewById(R.id.Addbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                MainActivity.this.startActivityForResult(intent,100);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 100 && data != null) { // this 100 needs to match the 100 we used when we called startActivityForResult!
            String string1 = data.getExtras().getString("New Question"); // 'string1' needs to match the key we used when we put the string in the Intent
            String string2 = data.getExtras().getString("New Answer");
            final TextView textViewToChange = (TextView) findViewById(R.id.flash_card_question);
            textViewToChange.setText(string1);
            final TextView TextViewToChange = (TextView) findViewById(R.id.question_answer);
            TextViewToChange.setText(string2);
        }

    }
}

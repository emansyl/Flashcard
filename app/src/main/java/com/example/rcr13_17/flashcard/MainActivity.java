package com.example.rcr13_17.flashcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

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
    }
}

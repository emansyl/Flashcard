package com.example.rcr13_17.flashcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        findViewById(R.id.SaveButton).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent data = new Intent(); // create a new Intent, this is where we will put our data
                data.putExtra("New Question", ((EditText) findViewById(R.id.Question)).getText().toString()); // puts one string into the Intent, with the key as 'string1'
                data.putExtra("New Answer", ((EditText) findViewById(R.id.Answer)).getText().toString()); // puts another string into the Intent, with the key as 'string2
                setResult(RESULT_OK, data); // set result code and bundle data for response
                finish(); // closes this activity and pass data to the original activity that launched this activity
            }
        });


    }

}

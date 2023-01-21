package com.example.mindsharpener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText answer;
    Button button;

    TextView equestionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer = findViewById(R.id.answer);
        button = findViewById(R.id.button);
        equestionText = findViewById(R.id.equestionText);


        MathQuestion question = new MathQuestion();
        String mathQuestion = question.getQuestion();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent( MainActivity.this, MathQuestion.class));
            }

        });

    }
}
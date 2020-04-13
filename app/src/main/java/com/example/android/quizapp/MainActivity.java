package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {

        score = 0;

        RadioButton ans1_1 = findViewById(R.id.a1_1);

        CheckBox a2_1 = findViewById(R.id.a2_1);
        boolean ans2_1 = a2_1.isChecked();
        CheckBox a2_2 = findViewById(R.id.a2_2);
        boolean ans2_2 = a2_2.isChecked();
        CheckBox a2_3 = findViewById(R.id.a2_3);
        boolean ans2_3 = a2_3.isChecked();
        CheckBox a2_4 = findViewById(R.id.a2_4);
        boolean ans2_4 = a2_4.isChecked();

        EditText a3 = findViewById(R.id.a3);
        String ans3 = a3.getText().toString();

        CheckBox a4_1 = findViewById(R.id.a4_1);
        boolean ans4_1 = a4_1.isChecked();
        CheckBox a4_2 = findViewById(R.id.a4_2);
        boolean ans4_2 = a4_2.isChecked();
        CheckBox a4_3 = findViewById(R.id.a4_3);
        boolean ans4_3 = a4_3.isChecked();
        CheckBox a4_4 = findViewById(R.id.a4_4);
        boolean ans4_4 = a4_4.isChecked();

        RadioButton ans5_4 = findViewById(R.id.a5_4);

        score = calculateScore(ans1_1, ans2_1, ans2_2, ans2_3, ans2_4, ans3, ans4_1, ans4_2, ans4_3, ans4_4, ans5_4);

        if (score == 5)
            Toast.makeText(this, "Congrats 5/5", Toast.LENGTH_SHORT).show();

        else
            Toast.makeText(this, "Score= " + String.valueOf(score) + "/5", Toast.LENGTH_SHORT).show();
    }

    private int calculateScore(RadioButton ans1_1, boolean ans2_1, boolean ans2_2, boolean ans2_3, boolean ans2_4, String ans3,
                               boolean ans4_1, boolean ans4_2, boolean ans4_3, boolean ans4_4, RadioButton ans5_4) {

        score = 0;

        if (ans1_1.isChecked())
            score++;

        if (!ans2_1 && ans2_2 && ans2_3 && ans2_4)
            score++;

        if (ans3.equalsIgnoreCase("String"))
            score++;

        if (ans4_1 && !ans4_2 && ans4_3 && !ans4_4)
            score++;

        if (ans5_4.isChecked())
            score++;

        return score;
    }

}

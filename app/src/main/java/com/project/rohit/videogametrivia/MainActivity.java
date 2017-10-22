package com.project.rohit.videogametrivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitQuiz(View view) {
        RadioButton correctAnswer1 = (RadioButton) findViewById(R.id.correctAns1);
        boolean gotCorrect1 = correctAnswer1.isChecked();

        RadioButton correctAnswer2 = (RadioButton) findViewById(R.id.correctAns2);
        boolean gotCorrect2 = correctAnswer2.isChecked();

        RadioButton correctAnswer3 = (RadioButton) findViewById(R.id.correctAns3);
        boolean gotCorrect3 = correctAnswer3.isChecked();

        RadioButton correctAnswer4 = (RadioButton) findViewById(R.id.correctAns4);
        boolean gotCorrect4 = correctAnswer4.isChecked();

        RadioButton correctAnswer5 = (RadioButton) findViewById(R.id.correctAns5);
        boolean gotCorrect5 = correctAnswer5.isChecked();

        String totalScore = createScoreSummary(gotCorrect1, gotCorrect2, gotCorrect3, gotCorrect4, gotCorrect5);
        displayMessage(totalScore);


    }


    private String createScoreSummary(boolean check1Ans, boolean check2ans, boolean check3ans, boolean check4ans, boolean check5ans) {
        return "1) " + check1Ans + "\n2) " + check2ans + "\n3) " + check3ans + "\n4) " + check4ans + "\n5) " + check5ans;
    }

    public String checkFirstAnswer(boolean gotCorrect1) {
        if (gotCorrect1) {
            return "1) Correct Answer";
        } else {
            return "1) Wrong Answer!";
        }
    }

    public String checkSecondAnswer(boolean gotCorrect2) {
        if (gotCorrect2) {
            return "2) Correct Answer";
        } else {
            return "2) Wrong Answer!";
        }
    }

    public String checkThirdAnswer(boolean gotCorrect3) {
        if (gotCorrect3) {
            return "3) Correct Answer";
        } else {
            return "3) Wrong Answer!";
        }
    }

    public String checkFourthAnswer(boolean gotCorrect4) {
        if (gotCorrect4) {
            return "3) Correct Answer";
        } else {
            return "3) Wrong Answer!";
        }
    }

    public String checkFifthAnswer(boolean gotCorrect5) {
        if (gotCorrect5) {
            return "3) Correct Answer";
        } else {
            return "3) Wrong Answer!";
        }
    }


    private void displayMessage(String message) {
        TextView summary = (TextView) findViewById(R.id.summary);
        summary.setText(message);
    }
}
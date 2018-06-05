package com.technopark.quizzy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean checked_1, checked_2, checked_3, checked_4, checked_5, checked_6;
    String answer_1, answer_2, answer_3, answer_4, answer_5, answer_6, answer_7, answer_8;
    String textCompareYes = "yes", textCompareNo = "No";
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitButton(View view) {

        boolean isChecked_1 = ((RadioButton) findViewById(R.id.radio_1)).isChecked();

        boolean isChecked_2 = ((RadioButton) findViewById(R.id.radio_2)).isChecked();

        boolean isChecked_3 = ((RadioButton) findViewById(R.id.radio_3)).isChecked();

        boolean isChecked_4 = ((RadioButton) findViewById(R.id.radio_4)).isChecked();

        boolean isChecked_5 = ((RadioButton) findViewById(R.id.radio_5)).isChecked();

        boolean isChecked_6 = ((RadioButton) findViewById(R.id.radio_6)).isChecked();

        boolean isChecked_7 = ((RadioButton) findViewById(R.id.radio_7)).isChecked();

        boolean isChecked_8 = ((RadioButton) findViewById(R.id.radio_8)).isChecked();

        boolean isChecked_9 = ((RadioButton) findViewById(R.id.radio_9)).isChecked();

        boolean isChecked_10 = ((RadioButton) findViewById(R.id.radio_10)).isChecked();

        boolean isChecked_11 = ((RadioButton) findViewById(R.id.radio_11)).isChecked();

        boolean isChecked_12 = ((RadioButton) findViewById(R.id.radio_12)).isChecked();

        String textInput = ((EditText) findViewById(R.id.edittext_view)).getText().toString();

        boolean isChecked_13 = ((CheckBox) findViewById(R.id.checkbox_1)).isChecked();

        boolean isChecked_14 = ((CheckBox) findViewById(R.id.checkbox_2)).isChecked();

        // For checking whether all the Questions are Answered or not.
        if ((isChecked_1 || isChecked_2) && (isChecked_3 || isChecked_4) && (isChecked_5 || isChecked_6)
                && (isChecked_7 || isChecked_8) && (isChecked_9 || isChecked_10) && (isChecked_11 || isChecked_12)
                && (!textInput.isEmpty()) && (isChecked_13 || isChecked_14)) {

            // For evaluating the Questions with proper Answers.
            if (!checked_1) {
                answer_1 = "Right";
                score += 1;
            } else {
                answer_1 = "Wrong";
            }

            if (checked_2) {
                answer_2 = "Right";
                score += 1;
            } else {
                answer_2 = "Wrong";
            }

            if (checked_3) {
                answer_3 = "Right";
                score += 1;
            } else {
                answer_3 = "Wrong";
            }

            if (!checked_4) {
                answer_4 = "Right";
                score += 1;
            } else {
                answer_4 = "Wrong";
            }

            if (checked_5) {
                answer_5 = "Right";
                score += 1;
            } else {
                answer_5 = "Wrong";
            }

            if (!checked_6) {
                answer_6 = "Right";
                score += 1;
            } else {
                answer_6 = "Wrong";
            }

            if (textInput.equalsIgnoreCase(textCompareYes)) {
                answer_7 = "Right";
                score += 1;
            } else if (textInput.equalsIgnoreCase(textCompareNo)) {
                answer_7 = "Wrong";
            } else {
                answer_7 = "Invalid entry";
            }

            if (isChecked_13 && isChecked_14) {
                answer_8 = "Invalid entry";
            } else if (isChecked_13) {
                answer_8 = "Right";
                score += 1;
            } else {
                answer_8 = "Wrong";
            }

            displayToast(answer_1, answer_2, answer_3, answer_4, answer_5, answer_6, answer_7, answer_8, score);
        } else {
            Toast.makeText(this, "Please answer all the questions", Toast.LENGTH_LONG).show();
        }
    }

    // For implementing Radio Buttons.
    public void onRadioButtonClicked_1(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_1:
                if (checked) {
                    checked_1 = true;
                    break;
                }

            case R.id.radio_2:
                if (checked) {
                    checked_1 = false;
                    break;
                }
        }
    }

    public void onRadioButtonClicked_2(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_3:
                if (checked) {
                    checked_2 = true;
                    break;
                }

            case R.id.radio_4:
                if (checked) {
                    checked_2 = false;
                    break;
                }
        }
    }

    public void onRadioButtonClicked_3(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_5:
                if (checked) {
                    checked_3 = true;
                    break;
                }

            case R.id.radio_6:
                if (checked) {
                    checked_3 = false;
                    break;
                }
        }
    }

    public void onRadioButtonClicked_4(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_7:
                if (checked) {
                    checked_4 = true;
                    break;
                }

            case R.id.radio_8:
                if (checked) {
                    checked_4 = false;
                    break;
                }
        }
    }

    public void onRadioButtonClicked_5(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_9:
                if (checked) {
                    checked_5 = true;
                    break;
                }

            case R.id.radio_10:
                if (checked) {
                    checked_5 = false;
                    break;
                }
        }
    }

    public void onRadioButtonClicked_6(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_11:
                if (checked) {
                    checked_6 = true;
                    break;
                }

            case R.id.radio_12:
                if (checked) {
                    checked_6 = false;
                    break;
                }
        }
    }

    // For displaying the final results as toast messages.
    public void displayToast(String toast_1, String toast_2, String toast_3, String toast_4, String toast_5, String toast_6, String toast_7, String toast_8, int totalScore) {
        Toast.makeText(this, "The Answer to Question 1 is " + toast_1, Toast.LENGTH_LONG).show();
        Toast.makeText(this, "The Answer to Question 2 is " + toast_2, Toast.LENGTH_LONG).show();
        Toast.makeText(this, "The Answer to Question 3 is " + toast_3, Toast.LENGTH_LONG).show();
        Toast.makeText(this, "The Answer to Question 4 is " + toast_4, Toast.LENGTH_LONG).show();
        Toast.makeText(this, "The Answer to Question 5 is " + toast_5, Toast.LENGTH_LONG).show();
        Toast.makeText(this, "The Answer to Question 6 is " + toast_6, Toast.LENGTH_LONG).show();
        Toast.makeText(this, "The Answer to Question 7 is " + toast_7, Toast.LENGTH_LONG).show();
        Toast.makeText(this, "The Answer to Question 8 is " + toast_8, Toast.LENGTH_LONG).show();
        Toast.makeText(this, "The total score is " + totalScore + " out of 8", Toast.LENGTH_LONG).show();

        //For displaying Grades.
        if (totalScore == 1 || totalScore == 2 || totalScore == 3) {
            Toast.makeText(this, "Better luck next time", Toast.LENGTH_LONG).show();
        } else if (totalScore == 4 || totalScore == 5 || totalScore == 6) {
            Toast.makeText(this, "Keep up the Good work", Toast.LENGTH_LONG).show();
        } else if (totalScore == 7) {
            Toast.makeText(this, "Great! You did it", Toast.LENGTH_LONG).show();
        } else if (totalScore == 8) {
            Toast.makeText(this, "Wow! Perfect score", Toast.LENGTH_LONG).show();
        }

        // For resetting the score counter.
        score = 0;
    }
}
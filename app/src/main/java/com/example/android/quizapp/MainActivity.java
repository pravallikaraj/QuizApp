package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submitQuiz(View view) {

        EditText editText = (EditText) findViewById(R.id.blank_8);
        String writeAnswer_8 = editText.getText().toString();

        EditText editText1 = (EditText) findViewById(R.id.blank_9);
        String writeAnswer_9 = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.blank_10);
        String writeAnswer_10 = editText2.getText().toString();

        EditText editText3 = (EditText) findViewById(R.id.name_edittext);
        String nameBlank = editText3.getText().toString();

        EditText editText4 = (EditText) findViewById(R.id.email_edittext);
        String emailBlank = editText4.getText().toString();

        RadioButton radioButton_1b = (RadioButton) findViewById(R.id.radio_1b);
        boolean checkRadio_1b = radioButton_1b.isChecked();

        RadioButton radioButton_2b = (RadioButton) findViewById(R.id.radio_2b);
        boolean checkRadio_2b = radioButton_2b.isChecked();

        RadioButton radioButton_3c = (RadioButton) findViewById(R.id.radio_3c);
        boolean checkRadio_3c = radioButton_3c.isChecked();

        RadioButton radioButton_4b = (RadioButton) findViewById(R.id.radio_4b);
        boolean checkRadio_4b = radioButton_4b.isChecked();

        RadioButton radioButton_5d = (RadioButton) findViewById(R.id.radio_5d);
        boolean checkRadio_5d = radioButton_5d.isChecked();

        CheckBox checkBox_6a = (CheckBox) findViewById(R.id.checkbox_6a);
        boolean checkCheckBox_6a = checkBox_6a.isChecked();

        CheckBox checkBox_6b = (CheckBox) findViewById(R.id.checkbox_6b);
        boolean checkCheckBox_6b = checkBox_6b.isChecked();

        CheckBox checkBox_6c = (CheckBox) findViewById(R.id.checkbox_6c);
        boolean checkCheckBox_6c = checkBox_6c.isChecked();

        CheckBox checkBox_6d = (CheckBox) findViewById(R.id.checkbox_6d);
        boolean checkCheckBox_6d = checkBox_6d.isChecked();

        CheckBox checkBox_6e = (CheckBox) findViewById(R.id.checkbox_6e);
        boolean checkCheckBox_6e = checkBox_6e.isChecked();

        CheckBox checkBox_7a = (CheckBox) findViewById(R.id.checkbox_7a);
        boolean checkCheckBox_7a = checkBox_7a.isChecked();

        CheckBox checkBox_7b = (CheckBox) findViewById(R.id.checkbox_7b);
        boolean checkCheckBox_7b = checkBox_7b.isChecked();

        CheckBox checkBox_7c = (CheckBox) findViewById(R.id.checkbox_7c);
        boolean checkCheckBox_7c = checkBox_7c.isChecked();

        CheckBox checkBox_7d = (CheckBox) findViewById(R.id.checkbox_7d);
        boolean checkCheckBox_7d = checkBox_7d.isChecked();

        CheckBox checkBox_7e = (CheckBox) findViewById(R.id.checkbox_7e);
        boolean checkCheckBox_7e = checkBox_7e.isChecked();

        int score = calculateScore(checkRadio_1b, checkRadio_2b, checkRadio_3c, checkRadio_4b, checkRadio_5d, checkCheckBox_6a, checkCheckBox_6b, checkCheckBox_6c, checkCheckBox_6d, checkCheckBox_6e, checkCheckBox_7a, checkCheckBox_7b, checkCheckBox_7c,checkCheckBox_7d, checkCheckBox_7e, writeAnswer_8, writeAnswer_9, writeAnswer_10);
        Toast.makeText(this, nameBlank +" your score is: " + score, Toast.LENGTH_SHORT).show();
        String scoreMessage = "Thanks for completing Java quiz";
        scoreMessage = scoreMessage+"\n Your score is: "+score;
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + emailBlank));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Quiz Score");
        intent.putExtra(Intent.EXTRA_TEXT, scoreMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    private int calculateScore(boolean ifCheckRadio_1b, boolean ifCheckRadio_2b, boolean ifCheckRadio_3c, boolean ifCheckRadio_4b, boolean ifCheckRadio_5d, boolean ifCheckCheckBox_6a, boolean ifCheckCheckBox_6b, boolean ifCheckCheckBox_6c, boolean ifCheckCheckBox_6d, boolean ifCheckCheckBox_6e, boolean ifCheckCheckBox_7a, boolean ifCheckCheckBox_7b, boolean ifCheckCheckBox_7c, boolean ifCheckCheckBox_7d, boolean ifCheckCheckBox_7e, String ifWriteAnswer_8, String ifWriteAnswer_9, String ifWriteAnswer_10) {
        int baseScore = 0;
        if (ifCheckRadio_1b)
            baseScore = baseScore + 1;
        if (ifCheckRadio_2b)
            baseScore = baseScore + 1;
        if (ifCheckRadio_3c)
            baseScore = baseScore + 1;
        if (ifCheckRadio_4b)
            baseScore = baseScore + 1;
        if (ifCheckRadio_5d)
            baseScore = baseScore + 1;
        if((ifCheckCheckBox_6a&&ifCheckCheckBox_6b&&ifCheckCheckBox_6c)&&!(ifCheckCheckBox_6a && ifCheckCheckBox_6b && ifCheckCheckBox_6c&&ifCheckCheckBox_6d && ifCheckCheckBox_6e))
        {
            if(!(ifCheckCheckBox_6d||ifCheckCheckBox_6e))
                baseScore = baseScore + 1;
        }
        if((ifCheckCheckBox_7b && ifCheckCheckBox_7c && ifCheckCheckBox_7e)&&!(ifCheckCheckBox_7a && ifCheckCheckBox_7b && ifCheckCheckBox_7c && ifCheckCheckBox_7d && ifCheckCheckBox_7e))
        {
            if(!(ifCheckCheckBox_7a||ifCheckCheckBox_7d))
            baseScore = baseScore + 1;
        }
        if (ifWriteAnswer_8.equalsIgnoreCase("main"))
            baseScore = baseScore + 1;
        if (ifWriteAnswer_9.equalsIgnoreCase("syntax"))
            baseScore = baseScore + 1;
        if (ifWriteAnswer_10.equalsIgnoreCase("comment"))
            baseScore = baseScore + 1;
        return baseScore;

    }
    public void displayRadioGroup_1()
    {
        RadioGroup radioGroup_1 = (RadioGroup) findViewById(R.id.radiogroup_1);
        radioGroup_1.clearCheck();
    }

    public void displayRadioGroup_2()
    {
        RadioGroup radioGroup_2 = (RadioGroup) findViewById(R.id.radiogroup_2);
        radioGroup_2.clearCheck();
    }

    public void displayRadioGroup_3()
    {
        RadioGroup radioGroup_3 = (RadioGroup) findViewById(R.id.radiogroup_3);
        radioGroup_3.clearCheck();
    }

    public void displayRadioGroup_4()
    {
        RadioGroup radioGroup_4 = (RadioGroup) findViewById(R.id.radiogroup_4);
        radioGroup_4.clearCheck();
    }

    public void displayRadioGroup_5()
    {
        RadioGroup radioGroup_5 = (RadioGroup) findViewById(R.id.radiogroup_5);
        radioGroup_5.clearCheck();
    }

    public void displayCheckBox_6a()
    {
        CheckBox checkBox_6a = (CheckBox) findViewById(R.id.checkbox_6a);
        checkBox_6a.setChecked(false);
    }

    public void displayCheckBox_6b()
    {
        CheckBox checkBox_6b = (CheckBox) findViewById(R.id.checkbox_6b);
        checkBox_6b.setChecked(false);
    }

    public void displayCheckBox_6c()
    {
        CheckBox checkBox_6c = (CheckBox) findViewById(R.id.checkbox_6c);
        checkBox_6c.setChecked(false);
    }

    public void displayCheckBox_6d()
    {
        CheckBox checkBox_6d = (CheckBox) findViewById(R.id.checkbox_6d);
        checkBox_6d.setChecked(false);
    }

    public void displayCheckBox_6e()
    {
        CheckBox checkBox_6e = (CheckBox) findViewById(R.id.checkbox_6e);
        checkBox_6e.setChecked(false);
    }

    public void displayCheckBox_7a()
    {
        CheckBox checkBox_7a = (CheckBox) findViewById(R.id.checkbox_7a);
        checkBox_7a.setChecked(false);
    }

    public void displayCheckBox_7b()
    {
        CheckBox checkBox_7b = (CheckBox) findViewById(R.id.checkbox_7b);
        checkBox_7b.setChecked(false);
    }

    public void displayCheckBox_7c()
    {
        CheckBox checkBox_7c = (CheckBox) findViewById(R.id.checkbox_7c);
        checkBox_7c.setChecked(false);
    }

    public void displayCheckBox_7d()
    {
        CheckBox checkBox_7d = (CheckBox) findViewById(R.id.checkbox_7d);
        checkBox_7d.setChecked(false);
    }

    public void displayCheckBox_7e()
    {
        CheckBox checkBox_7e = (CheckBox) findViewById(R.id.checkbox_7e);
        checkBox_7e.setChecked(false);
    }

    public void displayEditText()
    {
        EditText editText = (EditText) findViewById(R.id.blank_8);
        editText.getText().clear();
    }

    public void displayEditText1()
    {
        EditText editText1 = (EditText) findViewById(R.id.blank_9);
        editText1.getText().clear();
    }

    public void displayEditText2()
    {
        EditText editText2 = (EditText) findViewById(R.id.blank_10);
        editText2.getText().clear();
    }

    public void clear(View view)
    {
        EditText editText3 = (EditText) findViewById(R.id.name_edittext);
        editText3.setText("");
        EditText editText4 = (EditText) findViewById(R.id.email_edittext);
        editText4.setText("");
    }

    public void resetQuiz(View view) {
        displayRadioGroup_1();
        displayRadioGroup_2();
        displayRadioGroup_3();
        displayRadioGroup_4();
        displayRadioGroup_5();
        displayCheckBox_6a();
        displayCheckBox_6b();
        displayCheckBox_6c();
        displayCheckBox_6d();
        displayCheckBox_6e();
        displayCheckBox_7a();
        displayCheckBox_7b();
        displayCheckBox_7c();
        displayCheckBox_7d();
        displayCheckBox_7e();
        displayEditText();
        displayEditText1();
        displayEditText2();
        clear(view);
    }

}
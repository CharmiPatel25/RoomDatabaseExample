package com.example.roomdatabaseexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewWordActivity extends AppCompatActivity {

    public static final String FIRST_NAME = "first-name";
    public static final String LAST_NAME = "last-name";
    public static final String TITLE = "title";
    public static final String DEPARTMENT = "department";

    private  EditText edit_employee_firstname, edit_employee_lastname, edit_employee_title, edit_employee_department;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word);
        edit_employee_firstname = findViewById(R.id.edit_employee_firstname);
        edit_employee_lastname = findViewById(R.id.edit_employee_lastname);
        edit_employee_title = findViewById(R.id.edit_employee_title);
        edit_employee_department = findViewById(R.id.edit_employee_department);


        final Button button = findViewById(R.id.button_save);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                if (TextUtils.isEmpty(edit_employee_firstname.getText()) || TextUtils.isEmpty(edit_employee_lastname.getText())
                        || TextUtils.isEmpty(edit_employee_title.getText()) || TextUtils.isEmpty(edit_employee_department.getText())) {
                    setResult(RESULT_CANCELED, replyIntent);
                } else {
                    String first_name = edit_employee_firstname.getText().toString();
                    String last_name = edit_employee_lastname.getText().toString();
                    String title = edit_employee_title.getText().toString();
                    String department = edit_employee_department.getText().toString();

                    replyIntent.putExtra(FIRST_NAME, first_name);
                    replyIntent.putExtra(LAST_NAME, last_name);
                    replyIntent.putExtra(TITLE, title);
                    replyIntent.putExtra(DEPARTMENT, department);
                    setResult(RESULT_OK, replyIntent);
                }
                finish();
            }
        });
    }
}

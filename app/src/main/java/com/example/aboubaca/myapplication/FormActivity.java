package com.example.aboubaca.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText edittext;
    private Button buttonvalidate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        initViews();
    }

    private void initViews(){
        edittext = findViewById(R.id.form_edittext);
        buttonvalidate = findViewById(R.id.form_buttonval);

        buttonvalidate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.form_buttonval :
                saveData();
                break;
        }

    }

    private void saveData(){
        String name = edittext.getText().toString();
        if(!name.isEmpty()){
            DataManager.getInstance().addName(name);
        }
        finish();
    }
}

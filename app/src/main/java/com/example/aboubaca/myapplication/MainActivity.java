package com.example.aboubaca.myapplication;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView textViewName;
    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            if(resultCode == RESULT_OK && data.getExtras() != null){
                Bundle args = data.getExtras();
                String username =args.getString(FormActivity.NAME_KEY);
                textViewName.setText(username);
            }
        }
    }

    private void initViews(){
        textViewName = findViewById(R.id.main_textview);
        buttonNext = findViewById(R.id.main_button_next);

        textViewName.setText(R.string.main_bt_text);

        buttonNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_button_next :
                Intent intent = new Intent(this, FormActivity.class);
                startActivityForResult(intent,1);
                break;
        }

    }
}

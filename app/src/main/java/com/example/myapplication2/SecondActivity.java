package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Button b1, b2;
    TextView tv1;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();
    }

    private void init(){
        b1 = findViewById(R.id.btnBack);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callBack();
            }
        });


        tv1 = findViewById(R.id.tv);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        tv1.setText(msg);


        b2 = findViewById(R.id.btnMsg2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callSendMsg();
            }
        });
        e1 =findViewById(R.id.etMsg);

    }
    private void callSendMsg() {
        Intent intent = new Intent(this, FirstActivity.class);
        intent.putExtra("msg", e1.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }

    private void callBack() {
        finish();
    }
}
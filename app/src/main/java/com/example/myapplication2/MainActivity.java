package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //클래스 선언
    TextView textView;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        //세팅 ? 연결 ?
        textView=findViewById(R.id.txtCount);


    }

    public void onToastClick(View view){
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }

    public void onCountClick(View view){
       count++;
       textView.setText(count+""); //TextView 클래스에는 기본적으로 setter, getter가 선언되어있다.


    }
}
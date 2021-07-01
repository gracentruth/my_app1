package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {



    EditText on1;
    EditText on2;
    EditText on3;

    TextView val1;
    TextView val2;
    TextView val3;

    CheckBox cb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        on1 = findViewById(R.id.on1);
        on2 = findViewById(R.id.on2);
        on3 = findViewById(R.id.on3);

        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);
        val3 = findViewById(R.id.val3);

        cb = findViewById(R.id.checkBox);


    }

    //    public void onAAA(View view) {
//        //1. edittext 생년 가져오기
//        String year = et.getText().toString();
//        int iyear = Integer.parseInt(year);
//
//        //2. 생년을 나이로 바꾸기
//        int age = 2021 - iyear + 1;
//
//        //3. 나이를 토스트로 띄우기
//        Toast.makeText(this, "당신의 나이는 " + age + "입니다.", Toast.LENGTH_SHORT).show();
//    }
    public void calculate(View view){
        String a=on1.getText().toString();
        int ia=Integer.parseInt(a);

        String a2=on2.getText().toString();
        int ia2=Integer.parseInt(a2);

        String a3=on3.getText().toString();
        int ia3=Integer.parseInt(a3);

        //String c=cb.get
        //int ic=Integer.parseInt(c);

        double dis=0;
        double result=1000*ia+1500*ia2+1700*ia3;

        //Toast.makeText(this,"총 가격은"+result+"입니다",Toast.LENGTH_LONG).show();

        if(cb.isChecked()){
            dis=result*0.1;
            result=result*0.9;
        }

        //수
        int result2=ia+ia2+ia3;

        val1.setText("주문개수: "+result2+"개");
        val2.setText("할인 금액: "+dis+"원");
        val3.setText("결제금액: "+result+"원");
        //val3.setText(ia3);



    }
}


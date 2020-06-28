package com.example.cheesss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    EditText et;
    TextView tv1,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et=findViewById(R.id.editText);
        tv1=findViewById(R.id.textView1);
        tv3=findViewById(R.id.textView3);

    }


    public  void  onk(View v){



        String fromTag=et.getText().toString();
        char fRow = fromTag.charAt(0);
        char tRow = fromTag.charAt(2);

        tv1.setText(String.valueOf(fRow));
        tv3.setText(String.valueOf(tRow));
    }
}

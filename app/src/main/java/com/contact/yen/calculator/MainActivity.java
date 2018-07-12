package com.contact.yen.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tvInput, tvResult;
    Button btnAC, btn, btnRate, btnDiv;
    Button btn7,btn8, btn9, btnMul;
    Button btn4, btn5, btn6, btnSub;
    Button btn1, btn2, btn3, btnAdd;
    Button btn0, btnDot, btnEqual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setEvenClick();
    }
    public void init(){
        tvInput = findViewById(R.id.tv_input);
        tvResult = findViewById(R.id.tv_result);

        btnAC = findViewById(R.id.btn_ac);
        btnRate = findViewById(R.id.btn_phantram);
        btnDiv = findViewById(R.id.btn_chia);
        btn = findViewById(R.id.btn_amduong);
        btnDot = findViewById(R.id.btn_cham);
        btnAdd = findViewById(R.id.btn_cong);
        btnSub = findViewById(R.id.btn_tru);
        btnEqual = findViewById(R.id.btn_bang);
        btnMul = findViewById(R.id.btn_nhan);

        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btn6 = findViewById(R.id.btn_6);
        btn5 = findViewById(R.id.btn_5);
        btn4 = findViewById(R.id.btn_4);
        btn3 = findViewById(R.id.btn_3);
        btn2 = findViewById(R.id.btn_2);
        btn1 = findViewById(R.id.btn_1);
        btn0 = findViewById(R.id.btn_0);

    }
    public void setEvenClick(){
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btn.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btnRate.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnDot.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_0:{
                tvInput.append("0");
                break;
            }
            case R.id.btn_1:{
                tvInput.append("1");
                break;
            }
            case R.id.btn_2:{
                tvInput.append("2");
                break;
            }
            case R.id.btn_3:{
                tvInput.append("3");
                break;
            }
            case R.id.btn_4:{
                tvInput.append("4");
                break;
            }
            case R.id.btn_5:{
                tvInput.append("5");
                break;
            }
            case R.id.btn_6:{
                tvInput.append("6");
                break;
            }
            case R.id.btn_7:{
                tvInput.append("7");
                break;
            }
            case R.id.btn_8:{
                tvInput.append("8");
                break;
            }
            case R.id.btn_9:{
                tvInput.append("9");
                break;
            }
            case R.id.btn_cong:{
                tvInput.append("+");
                break;
            }
            case R.id.btn_tru:{
                tvInput.append("-");
                break;
            }
            case R.id.btn_nhan:{
                tvInput.append("x");
                break;
            }
            case R.id.btn_chia:{
                tvInput.append("/");
                break;
            }
            case R.id.btn_ac:{
                tvInput.setText(" ");
                break;
            }
            case R.id.btn_phantram:{
                tvInput.append("%");
                break;
            }

        }
    }
}

package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static protected String smath="";
    static protected String temsmath="";
    double a,b;
    TextView window;
    TextView ans;
    Button ButZero;
    Button ButDot;
    Button ButAdd;
    Button ButMinus;
    Button ButMul;
    Button ButDiv;
    Button ButAns;
    Button ButOne;
    Button ButTwo;
    Button ButThree;
    Button ButFour;
    Button ButFive;
    Button ButSix;
    Button ButSeven;
    Button ButEight;
    Button ButNine;
    Button del;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButAdd = findViewById(R.id.add);
        ButAns = findViewById(R.id.Butans);
        ButDiv = findViewById(R.id.div);
        ButEight = findViewById(R.id.eight);
        ButZero = findViewById(R.id.zero);
        ButDot = findViewById(R.id.dot);
        ButMinus = findViewById(R.id.minus);
        ButMul = findViewById(R.id.multi);
        ButOne = findViewById(R.id.one);
        ButTwo = findViewById(R.id.two);
        ButThree = findViewById(R.id.three);
        ButFour = findViewById(R.id.four);
        ButFive = findViewById(R.id.five);
        ButSix = findViewById(R.id.six);
        ButSeven = findViewById(R.id.seven);
        ButNine = findViewById(R.id.nine);
        window = findViewById(R.id.show);
        ans = findViewById(R.id.ansText);
        del = findViewById(R.id.del);

        ButAdd.setOnClickListener(ButAddClick);
        ButDiv.setOnClickListener(ButDivClick);
        ButEight.setOnClickListener(ButEightClick);
        ButZero.setOnClickListener(ButZeroClick);
        ButDot.setOnClickListener(ButDotClick);
        ButMinus.setOnClickListener(ButMinusClick);
        ButMul.setOnClickListener(ButMulClick);
        ButOne.setOnClickListener(ButOneClick);
        ButThree.setOnClickListener(ButThreeClick);
        ButFour.setOnClickListener(ButFourClick);
        ButFive.setOnClickListener(ButFiveClick);
        ButSix.setOnClickListener(ButSixClick);
        ButSeven.setOnClickListener(ButSevenClick);
        ButNine.setOnClickListener(ButNineClick);
        del.setOnClickListener(ButDelClick);
        ButTwo.setOnClickListener(ButTwoClick);
        ButAns.setOnClickListener(ButAnsClick);
    }
    View.OnClickListener ButAddClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            a = Double.parseDouble(smath);
            smath+="+";
            temsmath=smath;
            window.setText(smath);
        }
    };
    View.OnClickListener ButAnsClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String temB = smath.replace(temsmath,"");
            double answer=0;
            b = Double.parseDouble(temB);
            if(temsmath.contains("+")){
                answer = a+b;
            }
            if(temsmath.contains("-")){
                answer = a-b;
            }
            if(temsmath.contains("x")){
                answer = a*b;
            }
            if(temsmath.contains("/")){
                answer = a/b;
            }
            String s = ""+answer;
            ans.setText(s);
        }
    };
    View.OnClickListener ButDivClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            a = Double.parseDouble(smath);
            smath+="/";
            temsmath=smath;
            window.setText(smath);
        }
    };
    View.OnClickListener ButEightClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            smath+="8";
            window.setText(smath);
        }
    };
    View.OnClickListener ButZeroClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            smath+="0";
            window.setText(smath);
        }
    };
    View.OnClickListener ButDotClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            smath+=".";
            window.setText(smath);
        }

    };
    View.OnClickListener ButMinusClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            a = Double.parseDouble(smath);
            smath+="-";
            temsmath=smath;
            window.setText(smath);
        }
    };
    View.OnClickListener ButMulClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            a = Double.parseDouble(smath);

            smath+="x";
            temsmath=smath;
            window.setText(smath);
        }
    };
    View.OnClickListener ButOneClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            smath+="1";
            window.setText(smath);
        }
    };
    View.OnClickListener ButTwoClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            smath+="2";
            window.setText(smath);
        }
    };
    View.OnClickListener ButThreeClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            smath+="3";
            window.setText(smath);
        }
    };
    View.OnClickListener ButFourClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            smath+="4";
            window.setText(smath);
        }
    };
    View.OnClickListener ButFiveClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            smath+="5";
            window.setText(smath);
        }
    };
    View.OnClickListener ButSixClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            smath+="6";
            window.setText(smath);
        }
    };
    View.OnClickListener ButSevenClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            smath+="7";
            window.setText(smath);
        }
    };
    View.OnClickListener ButNineClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            smath+="9";
            window.setText(smath);
        }
    };
    View.OnClickListener ButDelClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            smath="";
            window.setText(smath);
            ans.setText(smath);
        }
    };
}
package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editA,editB;
    Button btnAdd,btnSub,btnMult,btnDiv;
    TextView textResult;
    String num1,num2;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//뷰이미지를생성

        //기능을 구현하기 위해서 id를가져오기
        editA=(EditText)findViewById(R.id.A);
        editB=(EditText)findViewById(R.id.B);

        btnAdd=(Button)findViewById(R.id.add);
        btnSub=(Button)findViewById(R.id.sub);
        btnMult=(Button)findViewById(R.id.mult);
        btnDiv=(Button)findViewById(R.id.div);

        textResult=(TextView)findViewById(R.id.Textresult);




            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1=editA.getText().toString();
                    num2=editB.getText().toString();

                    result=Integer.parseInt(num1)+Integer.parseInt(num2);

                    textResult.setText("계산 결과: "+ result+"");

                    Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT).show();

                    return ;
                }
            });

            btnSub.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1=editA.getText().toString();
                    num2=editB.getText().toString();

                    result=Integer.parseInt(num1)-Integer.parseInt(num2);

                    textResult.setText("계산 결과 : "+ result);

                    return;
                }
            }));

            btnMult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1=editA.getText().toString();
                    num2=editB.getText().toString();

                    result=Integer.parseInt(num1)*Integer.parseInt(num2);

                    textResult.setText("계산 결과: "+result);

                    return;
                }
            });

            btnDiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1=editA.getText().toString();
                    num2=editB.getText().toString();

                    result=Integer.parseInt(num1)/Integer.parseInt(num2);

                    textResult.setText("계산 결과: "+result);

                    return;
                }
            });


    }
}

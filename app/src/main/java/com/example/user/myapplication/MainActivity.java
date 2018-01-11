
package com.example.user.myapplication;

/*import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
*/



/*public class MainActivity extends AppCompatActivity {

    EditText editA,editB;
    Button btnAdd,btnSub,btnMult,btnDiv;
    TextView textResult;
    String num1,num2;
    int result;
    Button intentbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//뷰이미지를생성

        //기능을 구현하기 위해서 id를가져오기
        editA=(EditText)findViewById(R.id.A);
        editB=(EditText)findViewById(R.id.B);
//ㅁ
        btnAdd=(Button)findViewById(R.id.add);
        btnSub=(Button)findViewById(R.id.sub);
        btnMult=(Button)findViewById(R.id.mult);
        btnDiv=(Button)findViewById(R.id.div);

        textResult=(TextView)findViewById(R.id.Textresult);
        intentbtn=(Button)findViewById(R.id.intent);

        num1="강상연";

        intentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ForIntent.class);
                intent.putExtra("container",num1);

                startActivity(intent);
            }
        });


/*
            버튼 동작
            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1=editA.getText().toString();
                    num2=editB.getText().toString();//간결하게

                    result=Integer.parseInt(num1)+Integer.parseInt(num2);//buttonadd의 역할

                    textResult.setText("계산 결과: "+ result+"");//Text결과

                    Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT).show();//toast메세지

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
            */




//}
/*
    public void Op(View v){

        int Op=v.getId();

        switch (Op)
        {
            case R.id.add :

                num1=editA.getText().toString();
                num2=editB.getText().toString();//간결하게

                result=Integer.parseInt(num1)+Integer.parseInt(num2);//buttonadd의 역할

                textResult.setText("계산 결과: "+ result+"");//Text결과

                Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT).show();//toast메세지


                break;

            case R.id.sub:

                num1=editA.getText().toString();
                num2=editB.getText().toString();//간결하게

                result=Integer.parseInt(num1)-Integer.parseInt(num2);//buttonadd의 역할

                textResult.setText("계산 결과: "+ result+"");//Text결과

                Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT).show();//toast메세지

                break;

            case R.id.mult:

                num1=editA.getText().toString();
                num2=editB.getText().toString();//간결하게

                result=Integer.parseInt(num1)*Integer.parseInt(num2);//buttonadd의 역할

                textResult.setText("계산 결과: "+ result+"");//Text결과

                Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT).show();//toast메세지

                break ;

            case R.id.div:

                num1=editA.getText().toString();
                num2=editB.getText().toString();//간결하게

                result=Integer.parseInt(num1)/Integer.parseInt(num2);//buttonadd의 역할

                textResult.setText("계산 결과: "+ result+"");//Text결과

                Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT).show();//toast메세지

                break;

        }



    }

}
*/

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//뷰이미지를생


        AlertDialog.Builder dig = new AlertDialog.Builder(MainActivity.this);
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view2 = (LinearLayout) inflater.inflate(R.layout.dialogbox, null);
        dig.setView(view2);
      final AlertDialog ad = dig.create();//자세히 알아야하는 부분107~211 책 참고


      final  Button btncancel=(Button)view2.findViewById(R.id.buttonCancel);
      final Button btnOk=(Button)view2.findViewById(R.id.buttonOK);

        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ad.dismiss();

            }
        });

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ad.dismiss();
            }
        });

        ad.show();
//dd
    }


}

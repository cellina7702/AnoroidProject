package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by user on 2018-01-15.
 */

public class main extends AppCompatActivity{
    private EditText editname,editid,editdepart;
    private Button btnok;
    private TextView textname,textid,textdepart;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentinfo);//뷰이미지를생

        editname=(EditText)findViewById(R.id.editname);
        editid=(EditText)findViewById(R.id.editid);
        editdepart=(EditText)findViewById(R.id.editdepart);

        textname=(TextView)findViewById(R.id.textname);
        textid=(TextView)findViewById(R.id.textid);
        textdepart=(TextView)findViewById(R.id.textdepart);

        btnok=(Button)findViewById(R.id.btnok);


       btnok.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent= new Intent(main.this,ForIntent.class);

               intent.putExtra("editname",String.valueOf(editname.getText()));
               intent.putExtra("editid",String.valueOf(editid.getText()));
               intent.putExtra("editdepart",String.valueOf(editdepart.getText()));

               startActivity(intent);
           }
       });


    }
}

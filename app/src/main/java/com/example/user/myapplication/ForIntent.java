package com.example.user.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 2018-01-10.
 */

public class ForIntent extends AppCompatActivity {

    myDBHeiper sqldb;//이 db가 쓰이는 class의 context가 필요하다:this
    private TextView textresultname,itextname,itextdepart,itextid;
    private EditText editresultname,ieditname,ieditdepart,ieditid;
    private Button btninsert,btndelete,btnupdate,btnselect;
    private Cursor cursor;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forintent);//뷰이미지를생성

        sqldb = new myDBHeiper(getApplicationContext(),"StDBcontainer7",null,1);
        textresultname=(TextView)findViewById(R.id.textresultname);
        itextdepart=(TextView)findViewById(R.id.itextdepart);
        itextname=(TextView)findViewById(R.id.itextname);
        itextid=(TextView)findViewById(R.id.itextid);

        editresultname=(EditText)findViewById(R.id.editresultname);
        ieditdepart=(EditText)findViewById(R.id.ieditdepart);
        ieditid=(EditText)findViewById(R.id.ieditid);
        ieditname=(EditText)findViewById(R.id.ieditname);

        btndelete=(Button)findViewById(R.id.btndelete);
        btninsert=(Button)findViewById(R.id.btninsert);
        btnselect=(Button)findViewById(R.id.btnselect);
        btnupdate=(Button)findViewById(R.id.btnupdate);
        db = sqldb.getReadableDatabase();





        /*
        Intent intent = getIntent();
        get=intent.getStringExtra("container");

        TxtV = (TextView) findViewById(R.id.textview);
        Btn = (Button) findViewById(R.id.button);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TxtV.setText(get);
            }
        });
*/


        //Intent intent=getIntent();
        //final String intentname=intent.getStringExtra("editname");
        //final String intentdepart=intent.getStringExtra("editdepart");
        //final String intentid=intent.getStringExtra("editid");

        btninsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           //     sqldb.insert(intentname, intentid,intentdepart);


                String eid = ieditid.getText().toString();
                String ename = ieditname.getText().toString();
                String edepart = ieditdepart.getText().toString();

                sqldb.insert(ename, eid, edepart);

                //ieditname.setText(intentname);
               // ieditdepart.setText(intentdepart);
               // ieditid.setText(intentid);
            }

        });


        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=ieditid.getText().toString();
                sqldb. delete(str);

            }
        });



        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String str=ieditid.getText().toString();
                    String strname=ieditname.getText().toString();
                    sqldb.update(str, strname);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }


        });



        btnselect.setOnClickListener(  new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try {

                    String tmpid = ieditid.getText().toString();
                    String sql = "select * from infoTBL where sID = "+tmpid+"";
                    //String sql = "select * from infoTBL;";
                    cursor = db.rawQuery(sql, null);
                    cursor.moveToFirst();

                    while(cursor.moveToNext()) {
                        String str2 = cursor.getString(0);
                        editresultname.setText(str2);
                    }

                    cursor.close();

                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}
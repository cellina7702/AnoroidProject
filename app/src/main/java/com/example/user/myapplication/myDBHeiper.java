package com.example.user.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteAbortException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 2018-01-15.
 */

public class myDBHeiper  extends SQLiteOpenHelper {


    private StringBuilder string=new StringBuilder();


    public myDBHeiper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
       // db.execSQL("CREATE TABLE infoTBL(sName char(20) , sID int(10) PRIMARY KEY, sDepart char(20));");
        string.append("CREATE TABLE infoTBL if not exists(");
        string.append("sName varchar(20),");
        string.append("sID int PRIMARY KEY not null,");
        string.append("sDepart varchar(20));");
        db.execSQL(string.toString());//toString: string객체에 저장된 문자열을 다 불러오겠다
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


     public void insert(String name,int id, String depart)
     {

         SQLiteDatabase db = getWritableDatabase();
       //  db.execSQL("INSERT INTO infoTBL VALUES("'"+"';");

         string.append("INSERT INTO infoTBL VALUES( ");
         string.append("'"+name+"', '"+id+"', '"+depart+"' ");
         string.append(")");//따옴표 나야말로 ";;;"
         db.execSQL(string.toString());

     }


    public void update(int id, String str)
     {
            SQLiteDatabase db=getWritableDatabase();
            string.append("UPDATE infoTBL SET sName= '"+ str+"' where id='"+id+"'");
            db.execSQL(string.toString());
     }

     public  void delete(int id)
     {
         SQLiteDatabase db=getReadableDatabase();
         string.append("DELETE FROM infoTBL where id='"+id+"'");
         db.execSQL(string.toString());
     }


}



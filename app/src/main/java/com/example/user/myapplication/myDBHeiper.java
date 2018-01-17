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


    public void init()
    {
        string.delete(0, string.length());
        string.trimToSize();
    }

   public myDBHeiper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        init();

        try {
            // db.execSQL("CREATE TABLE infoTBL(sName char(20) , sID int(10) PRIMARY KEY, sDepart char(20));");
            string.append("CREATE TABLE if not exists infoTBL(");
            string.append("sName varchar(20),");
            string.append("sID varchar(20),");
            string.append("sDepart varchar(20))");
            db.execSQL(string.toString());//toString: string객체에 저장된 문자열을 다 불러오겠다
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


     public void insert(String name, String id, String depart)
     {
         init();

         try {
             SQLiteDatabase db = getWritableDatabase();
             //  db.execSQL("INSERT INTO infoTBL VALUES("'"+"';");

             string.append("INSERT INTO infoTBL VALUES( ");
             string.append("'" + name + "', '" + id + "', '" + depart + "' ");
             string.append(")");//따옴표 나야말로 ";;;"
             db.execSQL(string.toString());

         }

         catch(Exception e)
         {
             e.printStackTrace();
         }
     }


    public void update(String id, String str)
     {
         init();
         try {

             SQLiteDatabase db = getWritableDatabase();
             string.append("UPDATE infoTBL SET sName= '" + str + "' where sID='" + id + "'");
             db.execSQL(string.toString());

         }
         catch (Exception e)
         {
             e.printStackTrace();
         }
     }

     public  void delete(String id)
     {
         init();
         try {
             SQLiteDatabase db = getReadableDatabase();
             string.append("DELETE FROM infoTBL where sID='" + id + "'");
             db.execSQL(string.toString());

         }
         catch (Exception e)
         {
             e.printStackTrace();
         }

         }



}



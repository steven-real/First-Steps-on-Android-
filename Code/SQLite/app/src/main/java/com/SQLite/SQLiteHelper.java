/*
package com.SQLite;

import static android.view.textclassifier.ConversationActions.Message.*;

import android.app.Notification;
import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;



public class SQLiteHelper extends SQLiteOpenHelper {

        private static final String DATABASE_NAME ="MyDataBase.db";
        private static final String PASSWORD = "Password";
        private static final String TABLE_NAME ="Table1";
        private static final String NAME ="Name";
        private static final int DATABASE_VERSION = 1;
        private static final String UID="_id";
        private static final String createTable="CREATE TABLE "+TABLE_NAME+"("+UID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+NAME+" VARCHAR(255));";
        private static final String dropTable="DROP TABLE IF exists "+TABLE_NAME+";";
        private Context context;




        public SQLiteHelper(Context context) {

            super(context, TABLE_NAME, null, DATABASE_VERSION);
            this.context=context;
            Toast.makeText(context,"constructor called",Toast.LENGTH_SHORT).show();
        }



        @Override
        public void onCreate(SQLiteDatabase db) {

            try{
                Toast.makeText(context,"onCreate called",Toast.LENGTH_SHORT).show();
                db.execSQL(createTable);
                db.execSQL("INSERT INTO "+TABLE_NAME+" VALUES (\"john\" )");
                db.execSQL("CREATE TABLE table1 (_id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(255));");

            }
            catch (SQLException e) {
                e.printStackTrace();
            }

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE if exists table1;");

            try {
                db.execSQL(dropTable);
                onCreate(db);
                Toast.makeText(context, "onUpgrade called", Toast.LENGTH_SHORT).show();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

}


*/

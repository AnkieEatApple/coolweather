package com.example.ankie.contentproviderdemo;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri bookUri = Uri.parse("content://com.czy.contentproviderdemo.BookProvider/book");
        ContentValues contentValues = new ContentValues();
        contentValues.put("bookName", "叫什么名字好呢");
        getContentResolver().insert(bookUri, contentValues);
        Cursor bookCursor = getContentResolver().query(bookUri, new String[]{"_id", "bookName"}, null, null, null);
        if (bookCursor != null) {
            while (bookCursor.moveToNext()) {
                Log.e(TAG, "ID:" + bookCursor.getInt(bookCursor.getColumnIndex("_id"))
                        + "  BookName:" + bookCursor.getString(bookCursor.getColumnIndex("bookName")));
            }
            bookCursor.close();
        }

        Uri userUri = Uri.parse("content://com.czy.contentproviderdemo.BookProvider/user");
        contentValues.clear();
        contentValues.put("userName", "叶叶叶");
        contentValues.put("sex", "男");
        getContentResolver().insert(userUri, contentValues);
        Cursor userCursor = getContentResolver().query(userUri, new String[]{"_id", "userName", "sex"}, null, null, null);
        if (userCursor != null) {
            while (userCursor.moveToNext()) {
                Log.e(TAG, "ID:" + userCursor.getInt(userCursor.getColumnIndex("_id"))
                        + "  UserName:" + userCursor.getString(userCursor.getColumnIndex("userName"))
                        + "  Sex:" + userCursor.getString(userCursor.getColumnIndex("sex")));
            }
            userCursor.close();
        }
    }


}

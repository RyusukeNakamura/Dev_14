package com.lifeistech.android.dev_14;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ExplainActivity extends AppCompatActivity {
    SharedPreferences pref;
    Boolean b=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain);
        pref=getSharedPreferences("pref_explain",MODE_PRIVATE);


    }
    public void tutorialEnd(View v){

        SharedPreferences.Editor editor=pref.edit();
        editor.putBoolean("key_tutorial",true);
        editor.commit();
        finish();
        //Intent intent=new Intent(this,MainActivity.class);
        //startActivity(intent);
    }
}

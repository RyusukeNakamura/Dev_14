package com.lifeistech.android.dev_14;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.prefs.PreferenceChangeEvent;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pref = getSharedPreferences("pref_explain",MODE_PRIVATE);
        if(pref.getBoolean("key_tutorial",false)){
            intent = new Intent(this, ExplainActivity.class);
            startActivity(intent);
        }else{

        }




    }

    public void memo(View v) {
        Intent intent = new Intent(this, MemoActivity.class);
        startActivity(intent);
    }
    public void tutorial(View v){
        intent = new Intent(this, ExplainActivity.class);
        startActivity(intent);
    }
}

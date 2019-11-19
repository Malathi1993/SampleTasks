package com.example.sampletasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnclick;
    Button btnnext;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences("malathi",MODE_PRIVATE);
        editor = preferences.edit();

        btnnext = (Button) findViewById(R.id.btnnext);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this,DisplayActivity.class));

            }
        });
        btnclick = (Button) findViewById(R.id.btnclick);
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            editor.putString("name","vijay");
            editor.putString("address","palakollu");
            editor.commit();

                Toast.makeText(MainActivity.this, "Data saved", Toast.LENGTH_SHORT).show();

            }
        });
    }
}

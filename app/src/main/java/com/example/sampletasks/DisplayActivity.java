package com.example.sampletasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayActivity extends AppCompatActivity {

    TextView txtdisplayName,txtdisplayAddress;
    Button btnget;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        preferences = getSharedPreferences("malathi",MODE_PRIVATE);



        txtdisplayName =(TextView) findViewById(R.id.txtdisplayName);
        txtdisplayAddress =(TextView) findViewById(R.id.txtdisplayAddress);
        btnget = (Button)findViewById(R.id.btnclick);
        btnget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                String  name  = preferences.getString("name","");
                String  address  = preferences.getString("address","");

                txtdisplayName.setText(""+name);
                txtdisplayAddress.setText(""+address);
            }
        });

    }
}

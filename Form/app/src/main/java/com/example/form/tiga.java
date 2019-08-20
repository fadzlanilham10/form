package com.example.form;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class tiga extends AppCompatActivity {
    String get_nama, get_nim, get_pass;
    TextView nama, nim, passwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiga);

        nama=findViewById(R.id.user);
        nim=findViewById(R.id.nama1);
        passwd=findViewById(R.id.nama2);

        Bundle yi=getIntent().getExtras();
        get_nama=yi.getString("1");
        get_nim=yi.getString("2");
        get_pass=yi.getString("3");

        nama.setText("nama="+get_nama);
        nim.setText("nim="+get_nim);
        passwd.setText("pass="+get_pass);

    }
}

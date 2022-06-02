package com.example.practical8;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button b1;
    CheckBox c1,c2,c3,c4,c5;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        c5=findViewById(R.id.c5);
    }
    public void select(View view) {
        s="";
        if (c1.isChecked())
        {
            s=s + " " +c1.getText().toString();
        }
        if (c2.isChecked())
        {
            s=s + " " +c2.getText().toString();
        }
        if (c3.isChecked())
        {
            s=s + " " +c3.getText().toString();
        }
        if (c4.isChecked())
        {
            s=s + " " +c4.getText().toString();
        }
        if (c5.isChecked())
        {
            s=s + " " +c5.getText().toString();
        }
        s="Following subjects are selected"+"\n"+s;
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
    }
}
package com.prowid.owner.prowid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Visitor extends AppCompatActivity {
    private Button visitorsendbutton;
    private EditText studentadminmunber;
    private EditText visitorname;
    private EditText visitorrelation;
    private EditText studantname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitor);
        visitorsendbutton = (Button) findViewById(R.id.button12);
        studentadminmunber = (EditText) findViewById(R.id.editText11);
        visitorname = (EditText) findViewById(R.id.editText8);
        visitorrelation = (EditText) findViewById(R.id.editText10);
        studantname = (EditText) findViewById(R.id.editText9);
        visitorsendbutton.setOnClickListener(new View.OnClickListener() {
            int counter=3;
            @Override
            public void onClick(View v) {
                if(studantname.getText().toString().equals("Mathu A S") &&
                        ( visitorname.getText().toString().equals("Sudharsanan A S") || visitorname.getText().toString().equals("Leena Sudharsanan")) && studentadminmunber.getText().toString().equals("6235")  && visitorrelation.getText().toString().equals("Parent") ) {
                    Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Department.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();



                    if (counter == 0) {
                        visitorsendbutton.setEnabled(false);
                    }
                }
                if(studantname.getText().toString().equals("Mathu A S") &&
                        ( visitorname.getText().toString().equals("Sudharsanan A S") || visitorname.getText().toString().equals("Leena Sudharsanan")) && studentadminmunber.getText().toString().equals("6235")  && visitorrelation.getText().toString().equals("Parent") ) {
                    Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Department.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();



                    if (counter == 0) {
                        visitorsendbutton.setEnabled(false);
                    }
                }
                if(studantname.getText().toString().equals("Elvis Varghese") &&
                        ( visitorname.getText().toString().equals("Varghese") || visitorname.getText().toString().equals("Betsy")) && studentadminmunber.getText().toString().equals("5899")  && visitorrelation.getText().toString().equals("Parent") ) {
                    Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Department.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();



                    if (counter == 0) {
                        visitorsendbutton.setEnabled(false);
                    }
                }
                if(studantname.getText().toString().equals("Amrutha Sunil") &&
                        ( visitorname.getText().toString().equals("Sunil Kumar N P") || visitorname.getText().toString().equals("Sushama Sunil")) && studentadminmunber.getText().toString().equals("6182")  && visitorrelation.getText().toString().equals("Parent") ) {
                    Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Department.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();



                    if (counter == 0) {
                        visitorsendbutton.setEnabled(false);
                    }
                }
                if(studantname.getText().toString().equals("Aarsha S") &&
                        ( visitorname.getText().toString().equals("Satish") || visitorname.getText().toString().equals("Usha")) && studentadminmunber.getText().toString().equals("6200")  && visitorrelation.getText().toString().equals("Parent") ) {
                    Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Department.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();



                    if (counter == 0) {
                        visitorsendbutton.setEnabled(false);
                    }
                }
            }
        });

    }
}

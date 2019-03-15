package com.prowid.owner.prowid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Student extends AppCompatActivity {
private Button studsendbutton;
    private EditText studname;
    private EditText studdepartment;
    private EditText studadmnumber;
    int counter=3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        studsendbutton = (Button) findViewById(R.id.button8);
        studname = (EditText) findViewById(R.id.editText2);
        studdepartment = (EditText) findViewById(R.id.editText);
        studadmnumber = (EditText) findViewById(R.id.editText3);


        studsendbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(studname.getText().toString().equals("Mathu A S") &&
                        studdepartment.getText().toString().equals("CSE") && studadmnumber.getText().toString().equals("6235")  ) {
                    Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Department.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();



                    if (counter == 0) {
                        studsendbutton.setEnabled(false);
                    }
                }
                if(studname.getText().toString().equals("Elvis Varghese") &&
                        studdepartment.getText().toString().equals("CSE") && studadmnumber.getText().toString().equals("5899")  ) {
                    Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Department.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();



                    if (counter == 0) {
                        studsendbutton.setEnabled(false);
                    }
                }


                if(studname.getText().toString().equals("Amrutha Sunil") &&
                    studdepartment.getText().toString().equals("CSE") && studadmnumber.getText().toString().equals("6182")  ) {
                Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Department.class);
                startActivity(intent);

            }else{
                Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();



                if (counter == 0) {
                    studsendbutton.setEnabled(false);
                }
            }
                if(studname.getText().toString().equals("Aarsha S") &&
                        studdepartment.getText().toString().equals("CSE") && studadmnumber.getText().toString().equals("6200")  ) {
                    Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Department.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();



                    if (counter == 0) {
                        studsendbutton.setEnabled(false);
                    }
                }
            }




        });









    }
}

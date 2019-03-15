package com.prowid.owner.prowid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Staff extends AppCompatActivity {
    private Button staffsendbutton;
    private EditText staffname;
    private EditText staffid;
    private EditText staffdepartment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);
        staffsendbutton = (Button)findViewById(R.id.button9);
        staffname = (EditText) findViewById(R.id.editText5);
        staffdepartment = (EditText)findViewById(R.id.editText6);
        staffid = (EditText) findViewById(R.id.editText7);
        staffsendbutton.setOnClickListener(new View.OnClickListener() {
            int counter=3;
            @Override
            public void onClick(View v) {
                if(staffname.getText().toString().equals("SREERESMI T S") &&
                        staffdepartment.getText().toString().equals("CSE") && staffid.getText().toString().equals("0001")  ) {
                    Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Staffview.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();



                    if (counter == 0) {
                        staffsendbutton.setEnabled(false);
                    }
                }
            }
        });



    }
}

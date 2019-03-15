package com.prowid.owner.prowid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button buttonstudent =(Button) findViewById(R.id.b3);
        buttonstudent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Student.class);
                startActivity(intent);
            }

        });
        Button buttonstaff =(Button) findViewById(R.id.b2);
        buttonstaff.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Staff.class);
                startActivity(intent);
            }

        });
        Button buttonvisitor =(Button) findViewById(R.id.b1);
        buttonvisitor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Visitor.class);
                startActivity(intent);
            }

        });
    }
}

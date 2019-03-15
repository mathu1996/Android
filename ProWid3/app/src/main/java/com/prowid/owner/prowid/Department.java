package com.prowid.owner.prowid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Department extends AppCompatActivity {
    private Button csebutton;
    private Button cebutton;
    private Button mebutton;
    private Button itbutton;
    private Button eeebutton;
    private Button ecbutton;
    private Button aebutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
        csebutton = (Button) findViewById(R.id.button7);
        cebutton = (Button) findViewById(R.id.button5);
        mebutton = (Button) findViewById(R.id.button4);
        itbutton = (Button) findViewById(R.id.button6);
        eeebutton = (Button) findViewById(R.id.button2);
        ecbutton = (Button) findViewById(R.id.button3);
        aebutton = (Button) findViewById(R.id.button);
        csebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Option.class);
                startActivity(intent);
            }

        });
        cebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Comingsoon.class);
                startActivity(intent);
            }

        });
        mebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Comingsoon.class);
                startActivity(intent);
            }

        });
        itbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Comingsoon.class);
                startActivity(intent);
            }

        });
        eeebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Comingsoon.class);
                startActivity(intent);
            }

        });
        ecbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Comingsoon.class);
                startActivity(intent);
            }

        });
        aebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Comingsoon.class);
                startActivity(intent);
            }

        });

    }
}

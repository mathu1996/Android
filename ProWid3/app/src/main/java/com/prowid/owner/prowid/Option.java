package com.prowid.owner.prowid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Option extends AppCompatActivity {
    private Button listbutton;
    private Button detailsbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        listbutton = (Button)findViewById(R.id.button13);
        detailsbutton = (Button) findViewById(R.id.button14);
        listbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Cse.class);
                startActivity(intent);
            }

        });
        detailsbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Csestaffdetails.class);
                startActivity(intent);
            }

        });
    }
}

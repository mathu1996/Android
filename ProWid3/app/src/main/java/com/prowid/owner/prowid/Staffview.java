package com.prowid.owner.prowid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Staffview extends AppCompatActivity {
    private Button detailsviewbutton;
    private Button location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staffview);
        detailsviewbutton = (Button) findViewById(R.id.button11);
        location = (Button) findViewById(R.id.button10);
        location.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Department.class);
                startActivity(intent);
            }

        });
        detailsviewbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Details.class);
                startActivity(intent);
            }

        });


    }
}

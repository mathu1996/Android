package com.prowid.owner.prowid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vidya extends AppCompatActivity {
    private Button location;
    private  Button sendnotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidya);
        location = (Button) findViewById(R.id.button10);
        sendnotification = (Button) findViewById(R.id.button11);
        location.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Location.class);
                startActivity(intent);
            }

        });
        sendnotification.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Notificationsend.class);
                startActivity(intent);
            }

        });
    }
}

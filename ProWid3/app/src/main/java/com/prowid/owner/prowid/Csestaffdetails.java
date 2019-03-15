package com.prowid.owner.prowid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Csestaffdetails extends AppCompatActivity {
    ListView lvv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csestaffdetails);
        lvv=(ListView)findViewById(R.id.listViewlvv);
        String[] values={"Dr.M. A. Dorairangaswamy","Sreeresmi T S ","Basil C.Sunny","Divya D","Gripsy Paul","Joseph George","Dr. Manish T I","Dr. Murali P","Neetha K Nataraj","Raghi R Menon","Rosemary Varghese","Sameera K M"," T Sobha","Sunder V","Teena George","Unnikrishnan K N","Vidya Gopinath"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        android.R.layout.activity_list_item,android.R.id.text1,values);
        lvv.setAdapter(adapter);
        lvv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                if(position==0)
                {
                    Intent intent = new Intent(view.getContext(),Dorai.class);
                    startActivityForResult(intent,0);

                }
                if(position==1)
                {
                    Intent intent = new Intent(view.getContext(),Sree.class);
                    startActivityForResult(intent,0);

                }
                if(position==2)
                {
                    Intent intent = new Intent(view.getContext(),Basil.class);
                    startActivityForResult(intent,0);

                }
                if(position==3)
                {
                    Intent intent = new Intent(view.getContext(),Divya.class);
                    startActivityForResult(intent,0);

                }
                if(position==4)
                {
                    Intent intent = new Intent(view.getContext(),Gripsy.class);
                    startActivityForResult(intent,0);

                }
                if(position==8)
                {
                    Intent intent = new Intent(view.getContext(),Neetha.class);
                    startActivityForResult(intent,0);

                }
                if(position==16)
                {
                    Intent intent = new Intent(view.getContext(),Vidya.class);
                    startActivityForResult(intent,0);

                }

            }

            });
    }
}

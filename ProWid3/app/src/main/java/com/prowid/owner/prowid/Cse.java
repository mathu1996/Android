package com.prowid.owner.prowid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Cse extends AppCompatActivity {
    int[] IMAGES = { R.drawable.dorai,R.drawable.sreereshmi,R.drawable.basil,R.drawable.divya,R.drawable.gripsy,R.drawable.joseph,R.drawable.manish,R.drawable.murali,R.drawable.neetha,R.drawable.raghi,R.drawable.rosemary,R.drawable.sameera,R.drawable.sobha,R.drawable.sundar,R.drawable.teena,R.drawable.unnikrishnan,R.drawable.vidya};
final String[] NAMES = {"Dr.M.A.Dorairangaswamy","Sreeresmi T S ","Basil C.Sunny","Divya D","Gripsy Paul","Joseph George","Dr. Manish T I","Dr. Murali P","Neetha K Nataraj","Raghi R Menon","Rosemary Varghese","Sameera K M"," T Sobha","Sunder V","Teena George","Unnikrishnan K N","Vidya Gopinath"};
    String[] DESCRIPTION = { "H.O.D.","Assistant Professor","Assistant Professor","Assistant Professor","Assistant Professor","Assistant Professor","Associate Professor","Associate Professor","Assistant Professor","Assistant Professor","Assistant Professor","Assistant Professor","Associate Professor","Assistant Professor","Assistant Professor","Assistant Professor","Assistant professor"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);
        ListView listView=(ListView) findViewById(R.id.lv);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);


    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.imageView3);
            TextView textView_name = (TextView)view.findViewById(R.id.textView_name);
            TextView textView_description = (TextView)view.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DESCRIPTION[i]);
         return view;
        }
    }
}

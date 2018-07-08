package com.example.tanmay.recipeapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ThaiCategoryActivity extends AppCompatActivity {
    ListView list2;
    String [] title2;
    int [] im={R.drawable.gril,
            R.drawable.papaya,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thai_category);
        Resources rest=getResources();
        title2=rest.getStringArray(R.array.title3);
        list2=(ListView)findViewById(R.id.list4);
        MyAdapter1 adapter1=new MyAdapter1(this,title2,im);
        list2.setAdapter(adapter1);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> listview, View v, int position, long id) {
                if (position == 0) {
                    Intent intent=new Intent(ThaiCategoryActivity.this,ThaiActivity.class);
                    intent.putExtra(ThaiActivity.EXTRA_FOODNO1,(int) id);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent=new Intent(ThaiCategoryActivity.this,ThaiActivity.class);
                    intent.putExtra(ThaiActivity.EXTRA_FOODNO1,(int) id);
                    startActivity(intent);
                }

            }
        };
        list2.setOnItemClickListener(itemClickListener);
    }
    class MyAdapter1 extends ArrayAdapter<String> {
        Context context;
        int[] img;
        String myTitle[];

        MyAdapter1(Context c,String [] title2,int[] img){
            super(c,R.layout.row3,R.id.text5,title2);
            this.context=c;
            this.img=img;

            this.myTitle=title2;

        }
        @Override
        public View getView(int posistion, View convertView, ViewGroup parent){
            LayoutInflater layoutInflater= (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            View row3=layoutInflater.inflate(R.layout.row3,parent,false);

            ImageView image=(ImageView)row3.findViewById(R.id.icon3);
            TextView myTitl=(TextView)row3.findViewById(R.id.text5);

            image.setImageResource(img[posistion]);
            myTitl.setText(title2[posistion]);

            return row3 ;
        }
    }
    }


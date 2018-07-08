package com.example.tanmay.recipeapp;

import android.app.Activity;
import android.app.ListActivity;
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

import static com.example.tanmay.recipeapp.R.array.titles;

public class FoodCategoryActivity extends AppCompatActivity {
    ListView lis;
    String [] title;
    int [] img={R.drawable.karai,
            R.drawable.chicken,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_category);
        Resources re=getResources();
        title=re.getStringArray(R.array.title);
        lis=(ListView)findViewById(R.id.list2);
        MyAdapte adapte=new MyAdapte(this,title,img);
        lis.setAdapter(adapte);
       AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> listview, View v, int position, long id) {
                if (position == 0) {
                    Intent intent=new Intent(FoodCategoryActivity.this,FoodActivity.class);
                    intent.putExtra(FoodActivity.EXTRA_FOODNO,(int) id);
                    startActivity(intent);
               }
                if (position == 1) {
                    Intent intent=new Intent(FoodCategoryActivity.this,FoodActivity.class);
                    intent.putExtra(FoodActivity.EXTRA_FOODNO,(int) id);
                    startActivity(intent);
                }

            }
       };
        lis.setOnItemClickListener(itemClickListener);
        //ListView listfoods=getListView();
        //ArrayAdapter<Food> listAdapter=new ArrayAdapter<Food>(this,android.R.layout.simple_list_item_1,Food.foods);
        //listfoods.setAdapter(listAdapter);
    }

    //}
    class MyAdapte extends ArrayAdapter<String> {
        Context context;
        int[] img;
        String myTitle[];

        MyAdapte(Context c,String [] title,int[] img){
            super(c,R.layout.ro,R.id.tex1,title);
            this.context=c;
            this.img=img;

            this.myTitle=title;

        }
        @Override
        public View getView(int posistion, View convertView, ViewGroup parent){
            LayoutInflater layoutInflater= (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            View ro=layoutInflater.inflate(R.layout.ro,parent,false);

            ImageView image=(ImageView)ro.findViewById(R.id.ico);
            TextView myTitl=(TextView)ro.findViewById(R.id.tex1);

            image.setImageResource(img[posistion]);
            myTitl.setText(title[posistion]);

            return ro  ;
        }
    }

    //@Override
   // protected void onListItemClick(ListView listView, View itemview, int position, long id) {
        //super.onListItemClick(listView, itemview, position, id);
       // Intent intent=new Intent(FoodCategoryActivity.this,FoodActivity.class);
        //intent.putExtra(FoodActivity.EXTRA_FOODNO,(int) id);
        //startActivity(intent);
    //}
    }


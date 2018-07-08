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

public class ChinesecategoryActivity extends AppCompatActivity {
    ListView list2;
    String [] title2;
    int [] im={R.drawable.mongo,
            R.drawable.veg,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinesecategory);
        Resources rest=getResources();
        title2=rest.getStringArray(R.array.title1);
        list2=(ListView)findViewById(R.id.list3);
        MyAdapter1 adapter1=new MyAdapter1(this,title2,im);
        list2.setAdapter(adapter1);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> listview, View v, int position, long id) {
                if (position == 0) {
                    Intent intent=new Intent(ChinesecategoryActivity.this,ChineseActivity.class);
                    intent.putExtra(ChineseActivity.EXTRA_FOODNO1,(int) id);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent=new Intent(ChinesecategoryActivity.this,ChineseActivity.class);
                    intent.putExtra(ChineseActivity.EXTRA_FOODNO1,(int) id);
                    startActivity(intent);
                }

            }
        };
        list2.setOnItemClickListener(itemClickListener);
        //ListView listfoods=getListView();
        //ArrayAdapter<Food> listAdapter=new ArrayAdapter<Food>(this,android.R.layout.simple_list_item_1,Food.foods);
        //listfoods.setAdapter(listAdapter);
    }

    //}
    class MyAdapter1 extends ArrayAdapter<String> {
        Context context;
        int[] img;
        String myTitle[];

        MyAdapter1(Context c,String [] title2,int[] img){
            super(c,R.layout.row1,R.id.text3,title2);
            this.context=c;
            this.img=img;

            this.myTitle=title2;

        }
        @Override
        public View getView(int posistion, View convertView, ViewGroup parent){
            LayoutInflater layoutInflater= (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            View row1=layoutInflater.inflate(R.layout.row1,parent,false);

            ImageView image=(ImageView)row1.findViewById(R.id.icon1);
            TextView myTitl=(TextView)row1.findViewById(R.id.text3);

            image.setImageResource(img[posistion]);
            myTitl.setText(title2[posistion]);

            return row1 ;
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

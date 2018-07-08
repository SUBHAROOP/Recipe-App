package com.example.tanmay.recipeapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class RecipeMenu extends AppCompatActivity {
    ListView list;
    String [] titles;
    String [] description;
    int [] imgs={R.drawable.indian,
            R.drawable.chinese,
            R.drawable.american,
            R.drawable.thai,
    };
    //main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_menu);
        Resources res=getResources();
        titles=res.getStringArray(R.array.titles);
        description=res.getStringArray(R.array.description);

        list=(ListView)findViewById(R.id.list1);
        MyAdapter adapter=new MyAdapter(this,titles,imgs,description);
        list.setAdapter(adapter);
//onitemclick
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> listview, View v, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(RecipeMenu.this, FoodCategoryActivity.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(RecipeMenu.this, ChinesecategoryActivity.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(RecipeMenu.this, AmericanCategoryActivity.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(RecipeMenu.this, ThaiCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };

        list.setOnItemClickListener(itemClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.commonmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.about:
                Intent intent =new Intent(RecipeMenu.this,AboutUs.class);
                startActivity(intent);
                //Toast.makeText(getApplicationContext(),"phone-8981657298 \n email-tanmaydey215@gmail.com",Toast.LENGTH_LONG).show();
                break;
            case R.id.exit:
                callalert();
        }

        return super.onOptionsItemSelected(item);
    }
    public void callalert()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you want to close this application ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                      finishAffinity();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.setTitle("Recipe_App");
        alert.show();
    }

//custcomlayout

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        int[] imgs;
        String myTitles[];
        String myDescription[];
        MyAdapter(Context c,String [] titles,int[] imgs,String[] description){
            super(c,R.layout.row,R.id.text1,titles);
            this.context=c;
            this.imgs=imgs;
            this.myDescription=description;
            this.myTitles=titles;

        }
        @Override
        public View getView(int posistion, View convertView, ViewGroup parent){
            LayoutInflater layoutInflater= (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            View row=layoutInflater.inflate(R.layout.row,parent,false);
            ImageView images=(ImageView)row.findViewById(R.id.icon);
            TextView myTitle=(TextView)row.findViewById(R.id.text1);
            TextView myDescription=(TextView)row.findViewById(R.id.text2);
            images.setImageResource(imgs[posistion]);
            myTitle.setText(titles[posistion]);
            myDescription.setText(description[posistion]);
            return row  ;
        }
    }
}

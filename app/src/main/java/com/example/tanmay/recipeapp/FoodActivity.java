package com.example.tanmay.recipeapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FoodActivity extends AppCompatActivity {

    public static final String EXTRA_FOODNO = "foodno";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        int foodno = (Integer) getIntent().getExtras().get(EXTRA_FOODNO);
        Food food = Food.foods[foodno];
        TextView name = (TextView) findViewById(R.id.name);
        TextView desc = (TextView) findViewById(R.id.description);
        ImageView image = (ImageView) findViewById(R.id.image);
        name.setText(food.getName());
        desc.setText(food.getDescription());
        image.setImageResource(food.getImageId());
    }
    //for menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ordinarymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                Intent intent = new Intent(FoodActivity.this, RecipeMenu.class);
                startActivity(intent);
                break;
            case R.id.about:
             Intent   i = new Intent(FoodActivity.this, AboutUs.class);
                startActivity(i);
                break;
            case R.id.exit:
                callalert();
        }

        return super.onOptionsItemSelected(item);
    }

    public void callalert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you want to close this application ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
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
}

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

public class ThaiActivity extends AppCompatActivity {

    public static final String EXTRA_FOODNO1 = "foodn";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thai);
        int foodn = (Integer) getIntent().getExtras().get(EXTRA_FOODNO1);
        Thai thai = Thai.food[foodn];
        TextView name = (TextView) findViewById(R.id.name2);
        TextView desc = (TextView) findViewById(R.id.description2);
        ImageView image = (ImageView) findViewById(R.id.image2);
        name.setText(thai.getName());
        desc.setText(thai.getDescription());
        image.setImageResource(thai.getImageId());
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.finalmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                Intent intent = new Intent(ThaiActivity.this, RecipeMenu.class);
                startActivity(intent);
                break;
            case R.id.about:
                Intent inten =new Intent(ThaiActivity.this,AboutUs.class);
                startActivity(inten);
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

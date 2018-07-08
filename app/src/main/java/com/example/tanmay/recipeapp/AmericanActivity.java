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

public class AmericanActivity extends AppCompatActivity {

    public static final String EXTRA_FOODNO1 = "foodn";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_american);
        int foodn = (Integer) getIntent().getExtras().get(EXTRA_FOODNO1);
        American american = American.food[foodn];
        TextView name = (TextView) findViewById(R.id.name1);
        TextView desc = (TextView) findViewById(R.id.description1);
        ImageView image = (ImageView) findViewById(R.id.image1);
        name.setText(american.getName());
        desc.setText(american.getDescription());
        image.setImageResource(american.getImageId());
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.primarymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                Intent intent = new Intent(AmericanActivity.this, RecipeMenu.class);
                startActivity(intent);
                break;
            case R.id.about:
                Intent inte =new Intent(AmericanActivity.this,AboutUs.class);
                startActivity(inte);
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

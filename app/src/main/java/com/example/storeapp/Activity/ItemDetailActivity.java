package com.example.storeapp.Activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.storeapp.R;
import com.example.storeapp.model.MatHang;

public class ItemDetailActivity extends AppCompatActivity {

    private Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        MatHang mh = (MatHang) getIntent().getSerializableExtra("mathang");

        preprareDetailItem(mh);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.submain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.home)
        {
        }
        return super.onOptionsItemSelected(item);
    }


    public void preprareDetailItem(MatHang mh) {
        ImageView imgView = findViewById(R.id.imageView);
        TextView detailItemName = findViewById(R.id.itemDetailName);
        TextView detailItemCost = findViewById(R.id.itemDetailCost);
        TextView detailItemDescription = findViewById(R.id.itemDetailDescription);

        new DownloadImageTask(imgView)
                .execute(mh.getAnh());
        detailItemName.setText(mh.getTenMatHang());
        detailItemCost.setText(String.valueOf(mh.getGia()));
        detailItemDescription.setText(mh.getMoTa());
    }
}

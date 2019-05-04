package com.example.storeapp.Activity;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.example.storeapp.R;

public class CategoryActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        LinearLayout phoneCategoryView = findViewById(R.id.phoneCategoryView);
        LinearLayout computerCategoryView = findViewById(R.id.computerCategoryView);
        LinearLayout householdCategoryView = findViewById(R.id.householdCategoryView);

        Intent intent = getIntent();
        String category = intent.getStringExtra("danhmuc");
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id==R.id.action_cart)
            startActivity(new Intent(this, CartActivity.class));
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_homePage) {
            startActivity(new Intent(this, MainActivity.class));
        } else if (id == R.id.nav_category) {

        } else if (id == R.id.nav_orderManagement) {

        } else if (id == R.id.nav_accountManagement) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void seePhoneItemList(View v) {
        Intent intent = new Intent(this, ItemListActivity.class);
        intent.putExtra("danhmuc", "Điện thoại");
        startActivity(intent);
    }

    public void seeComputerItemList(View v) {
        Intent intent = new Intent(this, ItemListActivity.class);
        intent.putExtra("danhmuc", "Máy tính");
        startActivity(intent);
    }

    public void seeElectronicItemList(View v) {
        Intent intent = new Intent(this, ItemListActivity.class);
        intent.putExtra("danhmuc", "Đồ điện tử");
        startActivity(intent);
    }
}

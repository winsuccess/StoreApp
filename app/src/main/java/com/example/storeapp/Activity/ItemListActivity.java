package com.example.storeapp.Activity;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.storeapp.R;
import com.example.storeapp.controller.ItemListAdapter;
import com.example.storeapp.controller.RestControl;
import com.example.storeapp.model.MatHang;
import com.example.storeapp.model.request.MatHangRequest;
import com.example.storeapp.model.response.MatHangResponse;

import java.util.ArrayList;
import java.util.List;

public class ItemListActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private List<MatHang> mhList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ItemListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Intent intent = getIntent();
        String category = intent.getStringExtra("danhmuc");
        prepareItemsList(category);

        recyclerView = (RecyclerView) findViewById(R.id.rv_itemList);
        mAdapter = new ItemListAdapter(mhList);
        GridLayoutManager mGridManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(mGridManager);
        recyclerView.setAdapter(mAdapter);
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
        if (id == R.id.action_cart)
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
            startActivity(new Intent(this, CategoryActivity.class));
        } else if (id == R.id.nav_orderManagement) {

        } else if (id == R.id.nav_accountManagement) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void prepareItemsList(String danhmuc) {
        ImageView itemImg = findViewById(R.id.main_itemImg);
        TextView itemName = (TextView) findViewById(R.id.main_itemName);
        TextView itemCost = (TextView) findViewById(R.id.main_itemCost);
        RestControl restControl = new RestControl();
        MatHangRequest mhRequest;
        if (danhmuc.equalsIgnoreCase("new"))
            mhRequest = new MatHangRequest("", 0, "");
        else if (danhmuc.equalsIgnoreCase("hot"))
            mhRequest = new MatHangRequest("", 0, "0");
        else
            mhRequest = new MatHangRequest(danhmuc, 0, "");
        MatHangResponse mhResponse = new MatHangResponse();
        try {
            mhResponse = restControl.getBanChay(mhRequest);
        } catch (Exception e) {
        }
        if (mhResponse != null) {
            for (MatHang mh : mhResponse.getMatHang()) {
                mhList.add(mh);
            }
        }
        //mAdapter.notifyDataSetChanged();
    }
}

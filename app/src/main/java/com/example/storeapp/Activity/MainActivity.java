package com.example.storeapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
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

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private List<MatHang> mhNewList = new ArrayList<>();
    private List<MatHang> mhHotList = new ArrayList<>();
    private RecyclerView recyclerView1;
    private ItemListAdapter mAdapter1;
    private RecyclerView recyclerView2;
    private ItemListAdapter mAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        prepareNewItemsList();
        prepareHotItemsList();

        recyclerView1 = (RecyclerView) findViewById(R.id.rv_newItemList);
        mAdapter1 = new ItemListAdapter(mhNewList, this);
        RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(mLayoutManager1);
        recyclerView1.setAdapter(mAdapter1);

        recyclerView2 = (RecyclerView) findViewById(R.id.rv_hotItemList);
        mAdapter2 = new ItemListAdapter(mhHotList, this);
        RecyclerView.LayoutManager mLayoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(mLayoutManager2);
        recyclerView2.setAdapter(mAdapter2);

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

        } else if (id == R.id.nav_category) {
            startActivity(new Intent(this, CategoryActivity.class));
        } else if (id == R.id.nav_orderManagement) {

        } else if (id == R.id.nav_accountManagement) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void prepareNewItemsList(){
        ImageView itemImg = findViewById(R.id.main_itemImg);
        TextView itemName = (TextView) findViewById(R.id.main_itemName);
        TextView itemCost = (TextView) findViewById(R.id.main_itemCost);
        RestControl restControl = new RestControl();

        MatHangRequest mhRequest = new MatHangRequest("",0,"");
        MatHangResponse mhResponse= new MatHangResponse();
        try {
            mhResponse = restControl.getBanChay(mhRequest);
        } catch (Exception e) {
        }
        if(mhResponse!=null) {
            int i = 5;
            while(i>0)
            {
                mhNewList.add(mhResponse.getMatHang().get(i));
                i--;
            }
        }
        //mAdapter.notifyDataSetChanged();
    }

    public void prepareHotItemsList(){
        ImageView itemImg = findViewById(R.id.main_itemImg);
        TextView itemName = (TextView) findViewById(R.id.main_itemName);
        TextView itemCost = (TextView) findViewById(R.id.main_itemCost);
        RestControl restControl = new RestControl();

        MatHangRequest mhRequest = new MatHangRequest("",0,"0");
        MatHangResponse mhResponse= new MatHangResponse();
        try {
            mhResponse = restControl.getBanChay(mhRequest);
        } catch (Exception e) {
        }
        if(mhResponse!=null) {
            int i = 5;
            while(i>0)
            {
                mhHotList.add(mhResponse.getMatHang().get(i));
                i--;
            }
        }
        //mAdapter.notifyDataSetChanged();
    }

    public void seeNewItemList(View v) {
        Intent intent = new Intent(this, ItemListActivity.class);
        intent.putExtra("danhmuc", "new");
        startActivity(intent);
    }

    public void seeHotItemList(View v) {
        Intent intent = new Intent(this, ItemListActivity.class);
        intent.putExtra("danhmuc", "hot");
        startActivity(intent);
    }

}
